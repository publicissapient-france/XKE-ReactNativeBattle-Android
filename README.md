Henry Poitier Android
=====================

Service endpoint: http://henri-potier.xebia.fr/books

# Setup environment

## Environment Java

Make sure you have JDK or JRE version 7 installed. You can also use Java 8 with
the library such as [retrolambda](https://github.com/orfjackal/retrolambda), see more details [here](https://developer.android.com/guide/platform/j8-jack.html).

## Android Studio

If you are using Android Studio 2.3.3 (latest stable release), you have to configure
kotlin manually by adding following lines to your top level gradle file:
```
apply plugin: 'kotlin-android'

buildscript {
    ext.kotlin_version = '1.1.2-3'
    
    //...
    
    dependencies {
        classpath 'com.android.tools.build:gradle:2.3.3'
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}

```
If you are using Android Studio 3.0 Canary, you can simply follow this guide:
https://kotlinlang.org/docs/tutorials/kotlin-android.html

### Create virtual devices

In order to test your application without an Android device, follow [this guide](https://developer.android.com/studio/run/managing-avds.html)
to add an Android emulator of your choice.

# Initial project configuration

This project is already configured with Kotlin and necessary support libraries.

Following 3rd-party libraries are added, you can go to their websites to get to
know how to use them:

- [Retrofit](http://square.github.io/retrofit/): http client 
- [Moshi](https://github.com/square/moshi): JSON library
- [Picasso](http://square.github.io/picasso/): Image loading

Also the internet user permission has already been added in `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

# Let's code!

The Android UI component you need to display the list of books is [RecyclerView](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html).
You can check out this [sample](https://github.com/googlesamples/android-RecyclerView)
to learn more.

In order to position your UI elements, you can check out [LinearLayout](https://developer.android.com/reference/android/widget/LinearLayout.html),
[RelativeLayout](https://developer.android.com/reference/android/widget/RelativeLayout.html)
or even [ConstraintLayout](https://developer.android.com/training/constraint-layout/index.html)
if you are looking for something more advanced. You might also want to look at
[CardView](https://developer.android.com/reference/android/support/v7/widget/CardView.html)
for your book item display if you want to make something really cool, with elevation
and shadows.

There is a possible solution in the branch `solution`, you can go and check it out :)

## Kotlin resources 

- [Getting started with Android and Kotlin](https://kotlinlang.org/docs/tutorials/kotlin-android.html)
- [Kotlin Android Extensions](https://kotlinlang.org/docs/tutorials/android-plugin.html)
