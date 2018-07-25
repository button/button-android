package com.usebutton.purchasepath;

import android.graphics.Color;

import com.usebutton.purchasepath.custom.NightOwlCard;
import com.usebutton.sdk.purchasepath.CallToAction;
import com.usebutton.sdk.purchasepath.Card;
import com.usebutton.sdk.purchasepath.TextCard;

public class CardBuilder {

    public static Card createCashBackCard() {
        CallToAction action = new CallToAction(R.drawable.btn_ic_app_button, "2% Cash Back",
                Color.parseColor("#0CAC56"));

        return new TextCard.Builder(action, "2% Cash Back on this Item",
                "This category of items qualifies for 2% Cash Back when you shop now through Button.")
                .setBackgroundColor(Color.parseColor("#0cac56")).build();
    }

    public static Card createWeekendWarriorCard() {
        CallToAction action = new CallToAction(R.drawable.btn_ic_app_button, "Weekend Warrior",
                Color.parseColor("#000000"));

        return new TextCard.Builder(action, "Weekend Warrior Bonus",
                "Get an extra $1.00 with the Weekend Warrior Bonus when you earn cash back in this category.")
                .setBackgroundColor(Color.parseColor("#ffffff"))
                .setTitleColor(Color.BLACK)
                .setBodyColor(Color.BLACK).build();
    }

    public static Card createHowButtonWorksCard() {
        CallToAction action =
                new CallToAction(R.drawable.btn_ic_app_button, "How it works",
                        Color.parseColor("#000000"));

        return new TextCard.Builder(action, "How it works",
                "First, purchase your products in the Merchant app or website. We'll make "
                        + "sure that the right purchase was made. Your cash back will be deposited "
                        + "into your account, around 3/23 if you purchase today.")
                .setBackgroundColor(Color.parseColor("#27938d")).build();
    }

    public static Card createNightOwlCard() {
        CallToAction action =
                new CallToAction(R.drawable.ic_hoot, "Night Owl",
                        Color.parseColor("#0e0637"));

        return new NightOwlCard(action);
    }
}
