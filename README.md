Henry Poitier Android
=====================

Service endpoint: http://henri-potier.xebia.fr/books

# Setup IDE

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

# Initial configuration

This project is already configured with following dependencies, you can go to their
websites to get to know how to use them:

- [Retrofit](http://square.github.io/retrofit/): http client 
- [Moshi](https://github.com/square/moshi): JSON library
- [Picasso](http://square.github.io/picasso/): Image loading

Also with the internet user permission added in `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

# Resources

The Android components you will need to use to display book list:
- [RecyclerView](https://developer.android.com/reference/android/support/v7/widget/RecyclerView.html)

## Kotlin resources 

- [Getting started with Android and Kotlin](https://kotlinlang.org/docs/tutorials/kotlin-android.html)
- [Kotlin Android Extensions](https://kotlinlang.org/docs/tutorials/android-plugin.html)
