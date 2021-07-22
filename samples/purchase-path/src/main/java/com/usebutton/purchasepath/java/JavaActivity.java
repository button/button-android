package com.usebutton.purchasepath.java;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.usebutton.purchasepath.CardBuilder;
import com.usebutton.purchasepath.R;
import com.usebutton.purchasepath.kotlin.KotlinActivity;
import com.usebutton.sdk.Button;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.BrowserPage;
import com.usebutton.sdk.purchasepath.CardList;
import com.usebutton.sdk.purchasepath.ProductPage;
import com.usebutton.sdk.purchasepath.PurchasePage;
import com.usebutton.sdk.purchasepath.PurchasePath;
import com.usebutton.sdk.purchasepath.PurchasePathExtension;
import com.usebutton.sdk.purchasepath.PurchasePathListener;
import com.usebutton.sdk.purchasepath.PurchasePathRequest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static com.usebutton.sdk.purchasepath.Commission.CommissionType.COMMISSIONABLE;

public class JavaActivity extends Activity {

    private static final String TAG = JavaActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickWithoutExtension(final View view) {
        PurchasePathRequest request = new PurchasePathRequest("https://www.boxed.com");
        Button.purchasePath().fetch(request, new PurchasePathListener() {
            @Override
            public void onComplete(@Nullable PurchasePath purchasePath,
                    @Nullable Throwable throwable) {
                Button.purchasePath().setExtension(null);
                startPurchasePath(purchasePath, throwable);
            }
        });
    }

    public void onClickWithExtension(final View view) {
        PurchasePathRequest request = new PurchasePathRequest("https://www.jet.com");
        Button.purchasePath().fetch(request, new PurchasePathListener() {
            @Override
            public void onComplete(@Nullable PurchasePath purchasePath,
                    @Nullable Throwable throwable) {
                Button.purchasePath().setExtension(
                        new CustomPurchasePathExtension(getApplicationContext()));
                startPurchasePath(purchasePath, throwable);
            }
        });
    }

    private void startPurchasePath(@Nullable PurchasePath purchasePath,
            @Nullable Throwable throwable) {
        if (purchasePath != null) {
            purchasePath.start(getApplicationContext());
        } else if (throwable != null) {
            Log.e(TAG, "Error with PurchasePathRequest", throwable);
        }
    }

    public void onClickSwitchTo(final View view) {
        Intent i = new Intent(view.getContext(), KotlinActivity.class);
        startActivity(i);
        finish();
    }

    /**
     * Customize Purchase Path user experience.
     * <p/>
     * Declared {@code static} so it does not hold a reference to the outer class (activity).
     */
    private static class CustomPurchasePathExtension implements PurchasePathExtension {

        private final Context ctx;

        CustomPurchasePathExtension(final Context ctx) {
            this.ctx = ctx;
        }

        @Override
        public void onInitialized(@NonNull BrowserInterface browser) {
            browser.getHeader().setBackgroundColor(Color.WHITE);
            browser.getFooter().setBackgroundColor(Color.WHITE);
            browser.getHeader().setTintColor(Color.parseColor("#E25461"));
            browser.getFooter().setTintColor(Color.parseColor("#E25461"));
            browser.getHeader().getTitle().setColor(Color.parseColor("#E25461"));
            browser.getHeader().getSubtitle().setColor(Color.parseColor("#E25461"));
            browser.getHeader().getTitle().setText("Custom Title");
            browser.getHeader().getSubtitle().setText("Earn cash back");
        }

        @Override
        public void onStartNavigate(@NonNull BrowserInterface browser) {
            if (browser.getCardList() != null) {
                browser.getCardList().removeAllCards();
            }
        }

        @Override
        public void onPageNavigate(@NonNull BrowserInterface browser, @NonNull BrowserPage page) {
            browser.getHeader().getSubtitle().setText("Shop here to earn!");
        }

        @Override
        public void onProductNavigate(@NonNull BrowserInterface browser,
                @NonNull ProductPage page) {
            browser.getHeader().getSubtitle().setText("This page contains a product or listing!");
            if (page.getCommission().getCommissionType() == COMMISSIONABLE) {
                final CardList cardList = browser.getCardList();
                if (cardList != null) {
                    cardList.removeAllCards();
                    cardList.addCard(CardBuilder.createCashBackCard());
                    cardList.addCard(CardBuilder.createWeekendWarriorCard());
                    cardList.addCard(CardBuilder.createHowButtonWorksCard());
                    cardList.addCard(CardBuilder.createNightOwlCard());
                    browser.showTopCard();
                }
            }
        }

        @Override
        public void onPurchaseNavigate(@NonNull BrowserInterface browser,
                @NonNull PurchasePage page) {
            browser.getHeader().getTitle().setText("Thank You!");
            browser.getHeader().getSubtitle().setText("Your reward will be available in 24 hrs");
        }

        @Override
        public void onClosed() {
            Toast.makeText(ctx, "Thank you for Shopping!", Toast.LENGTH_SHORT).show();
        }
    }
}
