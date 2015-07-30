# Button Android Deep Link Commerce

<p align="center"><img src="http://www.usebutton.com/img/sdk/img_dlc-preview.png" width="204"/>
</p>

<h1 align="center">Button DeepLink Commerce</h1>

## Overview

Button DeepLink Commerce enables rich cross-application functionality initiated from drop-in `Buttons`. Buttons act as the entry point to highly-contextual, fully attributed actions across apps.

The DeepLink Commerce (DLC) SDK provides full functionality for both sending and receiving users, attributed within the DLC network.

Add a `Button` to your app, pass it some `context` and it will render & display itself. e.g...

<p align="center"><img src="http://www.usebutton.com/img/sdk/img_dlc-uber-button.png" width="300" />
<br/>
<code>Ride</code> use-case with an <code>end-location</code>
</p>

## Getting started

### Gradle integration

We highly recommend that you use our SDK with Gradle, all you need to do is make sure you have `jcenter()` as one of your app's repositories.

```
repositories {
    jcenter()
}
```

Latest version: ![Download](https://api.bintray.com/packages/button/Public/android-sdk/images/download.svg).

```
dependencies {
    // Add the Button SDK dependency to the list of dependencies, 
    // you can see the latest version in the badge above
    // Replace + with this number, e.g. 1.0.0
    compile 'com.usebutton:android-sdk:+'
}
```

### Manual integration

But you can also include us manually by dropping our `aar` into you `/libs` folder, click [ ![Download](https://api.bintray.com/packages/button/Public/android-sdk/images/download.svg) ](https://bintray.com/button/Public/android-sdk/_latestVersion) to get the latest version.


### Next Steps

1. Get an Application ID by signing up here: [app.usebutton.com](https://app.usebutton.com/).
2. Follow the [DeepLink Commerce Integration Guide](https://www.usebutton.com/sdk/deep-link-commerce-android/) to get DLC in your app!


You can find the full [SDK Documentation](http://building.usebutton.com/button-android/latest/reference/com/usebutton/sdk/Button.html) here.

## Samples

You can find relevant example code and a fully working sample application in our [button-android-sample](https://github.com/usebutton/button-android-samples) repository.

## Release notes
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
