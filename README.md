# Guess-Craft


GuessCraft is an engaging multiplayer word guessing game, developed using Kotlin and Android XML. In this game, one player chooses a word from a selection of three provided by the server, and other players attempt to guess that word.

Used Libraries

    -Easy Permissions - Simplifies Android permissions.
    -Retrofit - A type-safe HTTP client for Android and Java.
    -Preferences DataStore - A data storage solution that allows you to store key-value pairs.
    -Activity KTX - A set of Kotlin extensions that are included with Android Jetpack and other Android libraries.
    -Dagger-Hilt - A dependency injection library for Android.
    -Timber - A logger with a small, extensible API.
    -Android Lifecycle - Helps you create a UI that automatically responds to lifecycle events.
    -Coroutines - A concurrency design pattern used in Kotlin.
    -Navigation Component - Helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer.
    -Gson - A Java serialization/deserialization library to convert Java Objects into JSON and back.
    -Lottie - A mobile library for Android and iOS that parses Adobe After Effects animations exported as json with Bodymovin and renders them natively on mobile.

## Features
- Multiplayer word guessing game.
- Each round, the drawer gets 3 words from the server and selects one.
- Other players can guess the selected word and submit it as a message.

## Installation

To clone and run this application, you'll need [Git](https://git-scm.com) and [Android Studio](https://developer.android.com/studio) installed on your computer. From your command line:


# Clone this repository

``
$ git clone https://github.com/hodakl099/GuessCraft.git

# Go into the repository
$ cd GuessCraft

# Install dependencies
$ ./gradlew build
``

# GuessCraft - Server and Client Communication Setup Guide

In order to have both the GuessCraft Server and Android application communicate with each other, they need to be configured to use the same port number. Additionally, the specific IP address used will depend on whether you're using an Android emulator or a physical Android device.
# Server Setup

The Ktor server typically runs on localhost and a specified port. In your application.conf file (or wherever you have your Ktor server set up), make sure the port is set to 8001.

Here's an example of what the application.conf file may look like:
```
ktor {
    deployment {
        port = 8001
        port = ${?PORT}
    }
    application {
        modules = [ com.mahmoud.ApplicationKt.module ]
    }
}
``

In this file, the server is configured to run on port `8001`.

# Android Application Setup

Your Android application needs to be set up to communicate with the server. This involves setting the correct IP address and port number.

If you're running your app on an Android emulator, the IP address 10.0.2.2 is used to access your machine's local loopback interface. Therefore, your base URLs will look like this:

``kotlin

const val HTTP_BASE_URL_LOCALHOST = "http://10.0.2.2:8001/"
const val WS_BASE_URL_LOCALHOST = "ws://10.0.2.2:8001/ws/draw"
``

Note: For WebSocket connections, the scheme should be either ws:// for unsecured or wss:// for secured connections.

If you're running the app on a physical Android device that's connected to the same local network as your server, you should use your machine's local network IP address. To find your local network IP address on most machines, you can run ipconfig (Windows) or ifconfig (Mac/Linux) in a terminal/command prompt, and look for the IPv4 Address.

Once you have your local network IP address, you can replace 10.0.2.2 in the above URLs with that address. Here's an example:

``kotlin

const val HTTP_BASE_URL = "http://192.168.1.5:8001/"
const val WS_BASE_URL = "ws://192.168.1.5:8001/ws/draw"
``

Final Note

This setup ensures that both your server and your Android application are communicating on the same port, and that they can find each other on the network. Be aware that the specific IP address and port you use can depend on your network setup.
