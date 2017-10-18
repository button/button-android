<p align="center"><img src="https://cloud.githubusercontent.com/assets/1057077/11322171/de11ea38-90ac-11e5-9df6-4da8d87ef76e.png" width="204"/>
</p>

<h1 align="center">Button Android SDK</h1>

<p align="center"><a href="https://bintray.com/button/Public/android-sdk/_latestVersion">
  <img src="https://api.bintray.com/packages/button/Public/android-sdk/images/download.svg" />
</a></p>

## Overview

Button enables rich cross-application functionality initiated from drop-in UI components called Buttons! Buttons act as the entry point to highly-contextual, fully attributed actions across apps.

The Button Android SDK provides full functionality for both sending and receiving users, attributed within the Button marketplace.

Add a Button to your app, pass it some context, and it will render & display itself. e.g...

<p align="center"><img src="http://www.usebutton.com/img/sdk/img_dlc-uber-button.png" width="300" />
<br/>
Ride use-case with a `SubjectLocation`.
</p>

## Getting started

### Gradle

We highly recommend that you use our SDK with Gradle.

First, ensure that you have `jcenter()` included as one of your app's repositories.

**build.gradle**
```
repositories {
    jcenter()
}
```

Then, add the Button Android SDK as a compile-time dependency.

**build.gradle**
```
dependencies {
    compile 'com.usebutton:android-sdk:[INSERT_LATEST_VERSION]'
    // ...
}
```

### Download

You can also include Button by downloading the latest `aar` and dropping it into the module `/libs` folder.

[ ![Download](https://api.bintray.com/packages/button/Public/android-sdk/images/download.svg) ](https://bintray.com/button/Public/android-sdk/_latestVersion)

### Next Steps

1. Get an Application ID by signing up on the [Button Dashboard](https://app.usebutton.com/).
2. Follow the [Quick Start](https://developer.usebutton.com/guides/publishers/android/quick-start) guide to get Button in your app!

You can find the full [SDK Documentation](http://building.usebutton.com/button-android/latest/reference/com/usebutton/sdk/Button.html) here.

## Samples

You can find relevant example code and a fully working sample application in our [button-android-samples](https://github.com/usebutton/button-android-samples) repository.
