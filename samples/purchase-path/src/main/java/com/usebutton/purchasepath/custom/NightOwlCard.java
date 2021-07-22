package com.usebutton.purchasepath.custom;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.usebutton.purchasepath.R;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.CallToAction;
import com.usebutton.sdk.purchasepath.Card;

import androidx.annotation.NonNull;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class NightOwlCard extends Card {

    private boolean isRedeemed = false;

    /**
     * Creates a new card instance with the given call to action.
     *
     * @param callToAction call to action that will be displayed when the card is "active".
     */
    public NightOwlCard(@NonNull CallToAction callToAction) {
        super(callToAction);
    }

    @NonNull
    @Override
    protected View onCreateView(@NonNull ViewGroup parent) {
        LayoutInflater factory = LayoutInflater.from(parent.getContext());
        return factory.inflate(R.layout.view_night_owl_card, parent, false);
    }

    @Override
    protected void onBindView(@NonNull View view) {
        TextView title = view.findViewById(R.id.title);
        TextView body = view.findViewById(R.id.body);
        Button button = view.findViewById(R.id.button);

        title.setText("Night Owl Bonus +1%");
        body.setText(
                "Whoooo’s up late shopping? Here’s an extra 1% cash back when you shop now before 6 AM.");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRedeemed = true;
                updateCardState();

                BrowserInterface browserInterface = getBrowser();

                if (browserInterface != null) {
                    browserInterface.getHeader().getTitle().setText("YOU REDEEMED NIGHT OWL BONUS");
                }
            }
        });

        updateCardState();
    }

    private void updateCardState() {
        View view = getView();

        if (view != null) {
            ImageView image = view.findViewById(R.id.image);
            Button button = view.findViewById(R.id.button);

            if (isRedeemed) {
                Picasso.get()
                        .load("https://developer.usebutton.com/assets/guides/publishers/checkout-extensions/custom-cards/img_owl-redeemed.png")
                        .into(image, new Callback() {
                            @Override
                            public void onSuccess() {
                                View view = getView();

                                if (view != null) {
                                    Button button = view.findViewById(R.id.button);
                                    button.setText("Offer Redeemed");
                                    button.setBackgroundColor(Color.parseColor("#0cac56"));
                                }
                            }

                            @Override
                            public void onError(Exception e) {

                            }
                        });
            } else {
                button.setText("Tap to redeem");
                button.setBackgroundColor(Color.parseColor("#1b84ff"));
                image.setImageResource(R.drawable.img_owl);
            }
        }
    }
}
