package com.usebutton.purchasepath.kotlin

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.usebutton.purchasepath.CardBuilder
import com.usebutton.purchasepath.R
import com.usebutton.purchasepath.java.JavaActivity
import com.usebutton.sdk.Button
import com.usebutton.sdk.purchasepath.BrowserInterface
import com.usebutton.sdk.purchasepath.BrowserPage
import com.usebutton.sdk.purchasepath.Commission.CommissionType.COMMISSIONABLE
import com.usebutton.sdk.purchasepath.ProductPage
import com.usebutton.sdk.purchasepath.PurchasePage
import com.usebutton.sdk.purchasepath.PurchasePath
import com.usebutton.sdk.purchasepath.PurchasePathExtension
import com.usebutton.sdk.purchasepath.PurchasePathRequest

class KotlinActivity : AppCompatActivity() {

    companion object {
        val TAG = KotlinActivity::class.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.switch_to).setText(R.string.switch_to_java)
        findViewById<ImageView>(R.id.language_logo).setImageResource(R.drawable.ic_kotlin)
    }

    fun onClickWithoutExtension(view: View) {
        val request = PurchasePathRequest("https://www.boxed.com")
        Button.purchasePath().fetch(request) { purchasePath, throwable ->
            Button.purchasePath().extension = null
            startPurchasePath(purchasePath, throwable)
        }
    }

    fun onClickWithExtension(view: View) {
        val request = PurchasePathRequest("https://www.jet.com")
        Button.purchasePath().fetch(request) { purchasePath, throwable ->
            Button.purchasePath().extension = CustomPurchasePathExtension(applicationContext)
            startPurchasePath(purchasePath, throwable)
        }
    }

    private fun startPurchasePath(purchasePath: PurchasePath?, throwable: Throwable?) {
        purchasePath?.start(this)
        throwable?.let {
            Log.e(TAG, "Error with PurchasePathRequest", throwable)
        }
    }

    fun onClickSwitchTo(view: View) {
        val intent = Intent(view.context, JavaActivity::class.java)
        startActivity(intent)
        finish()
    }

    /**
     * Customize Purchase Path experience.
     * <p/>
     * Declared {@code static} so it does not hold a reference to the outer class (activity).
     */
    class CustomPurchasePathExtension(private val ctx: Context) : PurchasePathExtension {
        override fun onInitialized(browser: BrowserInterface) {
            browser.header.backgroundColor = Color.WHITE
            browser.footer.backgroundColor = Color.WHITE
            browser.header.tintColor = Color.parseColor("#E25461")
            browser.footer.tintColor = Color.parseColor("#E25461")
            browser.header.title.color = Color.parseColor("#E25461")
            browser.header.subtitle.color = Color.parseColor("#E25461")
            browser.header.title.text = "Custom Title"
            browser.header.subtitle.text = "Earn cash back"
        }

        override fun onStartNavigate(browser: BrowserInterface) {
            browser.cardList?.removeAllCards()
        }

        override fun onPageNavigate(browser: BrowserInterface, page: BrowserPage) {
            browser.header.subtitle.text = "Shop here to earn!"
        }

        override fun onProductNavigate(browser: BrowserInterface, page: ProductPage) {
            browser.header.subtitle.text = "This page contains a product or listing!"
            if (page.commission.commissionType == COMMISSIONABLE) {
                browser.cardList?.let {
                    it.addCard(CardBuilder.createCashBackCard())
                    it.addCard(CardBuilder.createWeekendWarriorCard())
                    it.addCard(CardBuilder.createHowButtonWorksCard())
                    it.addCard(CardBuilder.createNightOwlCard())
                    browser.showTopCard()
                }
            }
        }

        override fun onPurchaseNavigate(browser: BrowserInterface, page: PurchasePage) {
            browser.header.title.text = "Thank You!"
            browser.header.subtitle.text = "Your reward will be available in 24 hrs"
        }

        override fun onClosed() {
            Toast.makeText(ctx, "Thank you for Shopping!", Toast.LENGTH_SHORT).show()
        }
    }
}
