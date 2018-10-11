### [6.3.0 Docs](http://building.usebutton.com/button-android/history/6.3.0/reference/com/usebutton/sdk/Button.html)
We’re excited to announce our latest SDK feature, Autofill. With Autofill your web view users will be able to fill out a form once, save that profile information, and reuse it on all other merchant sites. Disabled by default – reach out to your Partner Success representative for details.

### [6.2.1 Docs](http://building.usebutton.com/button-android/history/6.2.1/reference/com/usebutton/sdk/Button.html)
* Merchant app activities are now launched in a new task
* Fixed an issue where the card peek height was incorrect after removing the top card from browser

### [6.2.0 Docs](http://building.usebutton.com/button-android/history/6.2.0/reference/com/usebutton/sdk/Button.html)
* Minor bugfixes and improvements

### [6.1.0 Docs](http://building.usebutton.com/button-android/history/6.1.0/reference/com/usebutton/sdk/Button.html)
Compatible with Android 9 Pie

### [6.0.0 Docs](http://building.usebutton.com/button-android/history/6.0.0/reference/com/usebutton/sdk/Button.html)
* Introduces a new single Purchase Path interface using fetch by URL
* Introduces a new single Button Actions interface using ActionQuery
* Replaces CheckoutExtension interface with improved PurchasePathExtension interface
* New static Button API with PurchasePath, ButtonActions, User, and Debug modules
* Removes all deprecated 5.x functionality
* Removes all merchant functionality migrated to the Open Source Merchant Library
* Updates minimum SDK version to 19 (Android 4.4 KitKat)

### [5.32.0 Docs](http://building.usebutton.com/button-android/history/5.32.0/reference/com/usebutton/sdk/Button.html)
- Adds automatic Predictable Rewards and Instant Rewards cards to In-App Checkout (disabled by default — reach out to your Partner Success representative for details)

### [5.31.1 Docs](http://building.usebutton.com/button-android/history/5.31.1/reference/com/usebutton/sdk/Button.html)
* Fixes issue that led to incorrect size and position for custom Checkout Cards.
* Fixes issue where Checkout Extension navigation callbacks reported previous page url.

### [5.31.0 Docs](http://building.usebutton.com/button-android/history/5.31.0/reference/com/usebutton/sdk/Button.html)
* Scrolling down in the web view now dismisses the displayed card
* Checkout Extensions no longer receive  callback if product is null

### [5.30.0 Docs](http://building.usebutton.com/button-android/history/5.30.0/reference/com/usebutton/sdk/Button.html)
- Limit Button SDK embedded web browser to only one instance at a time
- Fix a potential crash when parsing null URLs on web view navigation

### [5.29.1 Docs](http://building.usebutton.com/button-android/history/5.29.1/reference/com/usebutton/sdk/Button.html)
Fix intermittent web checkout crash when viewing a product.


### [5.29.0 Docs](http://building.usebutton.com/button-android/history/5.29.0/reference/com/usebutton/sdk/Button.html)
- Replaced beta API to show/hide checkout cards (API diff)
- Add multiple cards to a Checkout Extension
- Adds ability build custom cards for Checkout Extensions
- Fixed a bug where elements at the bottom of the web view may be partially off screen

### [5.28.0 Docs](http://building.usebutton.com/button-android/history/5.28.0/reference/com/usebutton/sdk/Button.html)
* Fixes an intermittent crash when the authorization challenge activity is destroyed during the auth flow

### [5.27.0 Docs](http://building.usebutton.com/button-android/history/5.27.0/reference/com/usebutton/sdk/Button.html)
* Create and show a single Text Card with Checkout Extensions
* In-App Checkout navigation buttons now respect custom color
* Advances version number to 5.27.0 to synchronize with Button iOS SDK

### [5.22.1 Docs](http://building.usebutton.com/button-android/history/5.22.1/reference/com/usebutton/sdk/Button.html)
Corrects package visibility for new checkout extensions classes

### [5.22.0 Docs](http://building.usebutton.com/button-android/history/5.22.0/reference/com/usebutton/sdk/Button.html)
Adds Checkout Extension callbacks for product viewed and checkout complete for select merchants

### [5.21.0 Docs](http://building.usebutton.com/button-android/history/5.21.0/reference/com/usebutton/sdk/Button.html)
* Add custom views to In-App Checkout with a checkout extension
* Prefix layout resources to avoid collision


### [5.20.0 Docs](http://building.usebutton.com/button-android/history/5.20.0/reference/com/usebutton/sdk/Button.html)
* NEW! Customize In-App Checkout with Checkout Extensions
* Minor bug fixes and improvements

### [5.19.0 Docs](http://building.usebutton.com/button-android/history/5.19.0/reference/com/usebutton/sdk/Button.html)
* Purchase tracking improvements in the embedded browser 
* Install sheet optimizations 
* An embedded browser that no longer intermittently opens search results in a dialog window 

### [5.18.0 Docs](http://building.usebutton.com/button-android/history/5.18.0/reference/com/usebutton/sdk/Button.html)
* Adds support for app install banners using Chrome Intents for Android.
* Bug fixes and improvements to authorization challenge flow.
* Bug fixes and improvements to web view used for in-app checkout.

### [5.17.0 Docs](http://building.usebutton.com/button-android/history/5.17.0/reference/com/usebutton/sdk/Button.html)
* Deprecates  since it can lead to unexpected behavior when called externally. Apps should use  instead.
* Deprecates  and . Apps should use  instead.
* Minor bug fixes and improvements to app install flow.

### [5.16.0 Docs](http://building.usebutton.com/button-android/history/5.16.0/reference/com/usebutton/sdk/Button.html)
* Fixes web checkout bug that opened the Google Play store in a popup window instead of the native app for some websites when clicking an app install banner
* Fixes app install notification bug when using SSO authentication
* Minor networking improvements and enhanced debug logging when fetching app actions

### [5.16.0 Docs](http://building.usebutton.com/button-android/history/5.16.0/reference/com/usebutton/sdk/Button.html)
* Fixes web checkout bug that opened the Google Play store in a popup window instead of the native app for some websites when clicking an app install banner
* Fixes app install notification bug when using SSO authentication
* Minor networking improvements and enhanced debug logging when fetching app actions

### [5.15.0 Docs](http://building.usebutton.com/button-android/history/5.15.0/reference/com/usebutton/sdk/Button.html)
* Adds single sign-on merchant authorization challenge
* In-app checkout bug fixes and improvements

### [5.14.0 Docs](http://building.usebutton.com/button-android/history/5.14.0/reference/com/usebutton/sdk/Button.html)
* Adds support for Android Oreo (API 26)
* Adds ability to register a callback for MerchantAction completion

### [5.13.1 Docs](http://building.usebutton.com/button-android/history/5.13.1/reference/com/usebutton/sdk/Button.html)
* Enables SUBA

### [5.13.0 Docs](http://building.usebutton.com/button-android/history/5.13.0/reference/com/usebutton/sdk/Button.html)
* Improvements to navigation in web checkout flow
* Fixes issue with Facebook login in web checkout flow

### [5.12.0 Docs](http://building.usebutton.com/button-android/history/5.12.0/reference/com/usebutton/sdk/Button.html)
* Adds an optional app install overlay to the web checkout flow
* Minor bug fixes and improvements

### [5.11.0 Docs](http://building.usebutton.com/button-android/history/5.11.0/reference/com/usebutton/sdk/Button.html)
* Adds improved flow for url exchange including loading animation and redirect resolution
* Minor bug fixes and improvements to interactive buttons

### [5.10.1 Docs](http://building.usebutton.com/button-android/history/5.10.1/reference/com/usebutton/sdk/Button.html)
* Fixes a bug that would sometimes prevent automatic deep linking after successfully completing the authorization challenge.

### [5.10.0 Docs](http://building.usebutton.com/button-android/history/5.10.0/reference/com/usebutton/sdk/Button.html)
* Adds ability to prepare a  using an .
* Fixes a web view content sizing issue in the authorization flow.

### [5.9.0 Docs](http://building.usebutton.com/button-android/history/5.9.0/reference/com/usebutton/sdk/Button.html)
* Adds support for offer auth challenge flow

### [5.8.0 Docs](http://building.usebutton.com/button-android/history/5.8.0/reference/com/usebutton/sdk/Button.html)
- Adds a method to detect whether a url can be exchanged for an app action
- Adds a method to exchange a url for an app action
- Fixes an intermittent web checkout issue where navigation chrome overlaps on-page controls

### [5.7.0 Docs](http://building.usebutton.com/button-android/history/5.7.0/reference/com/usebutton/sdk/Button.html)
* Adds support for publishers to pass through a value (e.g. click Id) to be associated with downstream merchant conversions
* Fix to allow Merchants shown in an Android web view and using local storage to render correctly

### [5.6.0 Docs](http://building.usebutton.com/button-android/history/5.6.0/reference/com/usebutton/sdk/Button.html)
* Support for getting action with merchant Id
* Misc improvements

### [5.5.0 Docs](http://building.usebutton.com/button-android/history/5.5.0/reference/com/usebutton/sdk/Button.html)
* New events persistence (from file to database)
* Fix for stale intents in install notification
* Viewed event for custom UI buttons
* Fix for potential crash after attended install

### [5.3.1 Docs](http://building.usebutton.com/button-android/history/5.3.1/reference/com/usebutton/sdk/Button.html)
* New loading state
* Fix for flicker in InteractiveButton

### [5.3.0 Docs](http://building.usebutton.com/button-android/history/5.3.0/reference/com/usebutton/sdk/Button.html)
* Misc improvements & bug fixes

### [5.2.0 Docs](http://building.usebutton.com/button-android/history/5.2.0/reference/com/usebutton/sdk/Button.html)
* A brand new Button - InteractiveButton
* Misc bug fixes

### [5.1.1 Docs](http://building.usebutton.com/button-android/history/5.1.1/reference/com/usebutton/sdk/Button.html)
* Bug fix related to persisted events

### [4.3.5 Docs](http://building.usebutton.com/button-android/history/4.3.5/reference/com/usebutton/sdk/Button.html)
* Bug fix related to persisted events
* Fix for ViewPager and support-v4:24.0.0 crashing

### [5.1.0 Docs](http://building.usebutton.com/button-android/history/5.1.0/reference/com/usebutton/sdk/Button.html)
* Post-install notification to make the install process better
* Deprecated SDK order reporting, please see our [developer docs](https://www.usebutton.com/developers/api-reference/).

### [5.0.1 Docs](http://building.usebutton.com/button-android/history/5.0.1/reference/com/usebutton/sdk/Button.html)
* Fix for crash with support-v4:24.0.0 due to incorrect handling of decor views in [ViewPager](b.android.com/213359)

### [5.0.0 Docs](http://building.usebutton.com/button-android/history/5.0.0/reference/com/usebutton/sdk/Button.html)
* A number of performance improvements
* Bug fixes

### [4.3.4 Docs](http://building.usebutton.com/button-android/history/4.3.4/reference/com/usebutton/sdk/Button.html)
* Bug fixes related to handling incoming deep links and language change

### [4.3.2 Docs](http://building.usebutton.com/button-android/history/4.3.2/reference/com/usebutton/sdk/Button.html)
* Bug fixes
* Preview heading

### [4.3.1 Docs](http://building.usebutton.com/button-android/history/4.3.1/reference/com/usebutton/sdk/Button.html)
* Fixed bug when trying to install app on Genymotion (NPE)

### [4.3.0 Docs](http://building.usebutton.com/button-android/history/4.3.0/reference/com/usebutton/sdk/Button.html)
* Reduced network usage for event reporting
* Miscellaneous bug fixes
* Support for intent flags for invoking custom UI

### [4.2.0 Docs](http://building.usebutton.com/button-android/history/4.2.0/reference/com/usebutton/sdk/Button.html)
* Removed dependency on CardView and compat-v7

### [4.1.5 Docs](http://building.usebutton.com/button-android/history/4.1.5/reference/com/usebutton/sdk/Button.html)
* Removed backup attribute from AndroidManifest
* Ability to disable interaction on the ButtonDropin

### [4.1.3 Docs](http://building.usebutton.com/button-android/history/4.1.3/reference/com/usebutton/sdk/Button.html)
* Fixed attribution bug

### [4.1.0 Docs](http://building.usebutton.com/button-android/history/4.1.0/reference/com/usebutton/sdk/Button.html)
* Make your own buttons
* Significant performance improvements
* Disk based caching of images

### [4.0.0 Docs](http://building.usebutton.com/button-android/history/4.0.0/reference/com/usebutton/sdk/Button.html)
* Automatic intent handling of incoming deep links
* Line item reporting
* BETA support for a new feature

### [3.2.0 Docs](http://building.usebutton.com/button-android/history/3.2.0/reference/com/usebutton/sdk/Button.html)
* Improved network access
* Misc improvements

### [3.1.0 Docs](http://building.usebutton.com/button-android/history/3.1.0/reference/com/usebutton/sdk/Button.html)
* Minor bug fixes and improvement

### [3.0.1 Docs](http://building.usebutton.com/button-android/history/3.0.1/reference/com/usebutton/sdk/Button.html)
* Ability to report custom attribution events

### [3.0.0 Docs](http://building.usebutton.com/button-android/history/3.0.0/reference/com/usebutton/sdk/Button.html)
* Introduced new structured taxonomy for context

### [2.3.0 Docs](http://building.usebutton.com/button-android/history/2.3.0/reference/com/usebutton/sdk/Button.html)
* Added ability to set your own user ID via [setThirdPartyId](http://building.usebutton.com/button-android/history/2.3.0/reference/com/usebutton/sdk/Button.html\#setThirdpartyId\(java.lang.String\)).
* Improved caching and reduced network traffic

### [2.2.1 Docs](http://building.usebutton.com/button-android/history/2.2.1/reference/com/usebutton/sdk/Button.html)
* Minor bug fix.

### [2.2.0 Docs](http://building.usebutton.com/button-android/history/2.2.0/reference/com/usebutton/sdk/Button.html)
* New card type
* Button text styling

### [2.1.0 Docs](http://building.usebutton.com/button-android/history/2.1.0/reference/com/usebutton/sdk/Button.html)
* Dynamic inventory item cells
* Support for 9-patch backgrounds
* Support for gravity in Button
* Misc bug fixes and performance improvements

### [2.0.1 Docs](http://building.usebutton.com/button-android/history/2.0.1/reference/com/usebutton/sdk/Button.html)
* Option to create, style and add a ButtonDropin by code instead of layout XML.
* Misc bug fixes.

### [2.0.0 Docs](http://building.usebutton.com/button-android/history/2.0.0/reference/com/usebutton/sdk/Button.html)
* Debug logging to verify & debug Button integration
* Full support for grouped inventory, stay tuned for new integrations!
* btn_ namespace on all attributes to avoid collision. Note: breaking change from 1.n.n, see [Integration Docs](https://www.usebutton.com/developers/deep-link-commerce-android/) for details.


### [1.5.0 Docs](http://building.usebutton.com/button-android/history/1.5.0/reference/com/usebutton/sdk/Button.html)
* Grouped inventory commerce card support.

### [1.4.1 Docs](http://building.usebutton.com/button-android/history/1.4.1/reference/com/usebutton/sdk/Button.html)
* Delayed all SDK init until app foreground to support frequent BroadcastReceivers

### [1.4.0 Docs](http://building.usebutton.com/button-android/history/1.4.0/reference/com/usebutton/sdk/Button.html)
* Modest bug fixes and performance improvements

### [1.3.2 Docs](http://building.usebutton.com/button-android/history/1.3.2/reference/com/usebutton/sdk/Button.html)
* Removed obsolete permission

### [1.3.1 Docs](http://building.usebutton.com/button-android/history/1.3.1/reference/com/usebutton/sdk/Button.html)
* Fixed missing dialog background

### [1.3.0 Docs](http://building.usebutton.com/button-android/history/1.3.0/reference/com/usebutton/sdk/Button.html)
* New languages can now be switched on remotely
* Buttons are now cached for fasting loading
* SDK reporting and configuration behaviors can be updated remotely
* Assorted minor performance improvements
* Resolves issue where tapping on a card can cause a crash on Android 4.0

### [1.2.0 Docs](http://building.usebutton.com/button-android/history//reference/com/usebutton/sdk/Button.html)
* DLC Recipient Functionality (Production)
* Button now supports localization for Turkish, Portuguese, Russian & Spanish
* Custom font support for your Button

### [1.1.0 Docs](http://building.usebutton.com/button-android/history/1.1.0/reference/com/usebutton/sdk/Button.html)
* DLC Recipient Functionality (BETA)
* Minor bugfixes
* More reliable fetching of Identifier for Advertiser

### [1.0.0 Docs](http://building.usebutton.com/button-android/history/1.0.0/reference/com/usebutton/sdk/Button.html)
* First public release of the DLC SDK
* Supports Uber ride picker
* Supports generic promotions and install cards
