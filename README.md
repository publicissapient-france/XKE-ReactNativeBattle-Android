Henry Poitier Android
=====================

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

This project is already configured with following dependencies:

- [Retrofit](http://square.github.io/retrofit/): http client 
- [Moshi](https://github.com/square/moshi): JSON library
- [Picasso](http://square.github.io/picasso/): Image loading

Also with the internet user permission added in `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

