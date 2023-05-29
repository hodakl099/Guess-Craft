# Guess-Craft
GuessCraft

GuessCraft is an engaging multiplayer word guessing game, developed using Kotlin and Android XML. In this game, one player chooses a word from a selection of three provided by the server, and other players attempt to guess that word.

#Technical Stack
 -koltin
 -server side (ktor)
 -Android XML

#Used Libraries

-Easy Permissions - Simplifies Android permissions.
-Retrofit - A type-safe HTTP client for Android and Java.
-Preferences DataStore - A data storage solution that allows you to store key-value pairs.
-Activity KTX - A set of Kotlin extensions that are included with Android Jetpack and other Android libraries.
-Dagger-Hilt - A dependency injection library for Android.
-Timber - A logger with a small, extensible API.
-Android Lifecycle - Helps you create a UI that automatically responds to lifecycle events.
-Coroutines - A concurrency design pattern used in Kotlin.
-Navigation Component - Helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the -   navigation drawer.
-Gson - A Java serialization/deserialization library to convert Java Objects into JSON and back.
-Lottie - A mobile library for Android and iOS that parses Adobe After Effects animations exported as json with Bodymovin and renders   them natively on mobile.

## Features
- Multiplayer word guessing game.
- Each round, the drawer gets 3 words from the server and selects one.
- Other players can guess the selected word and submit it as a message.

## Installation

To clone and run this application, you'll need [Git](https://git-scm.com) and [Android Studio](https://developer.android.com/studio) installed on your computer. From your command line:

```bash
# Clone this repository
$ git clone https://github.com/hodakl099/GuessCraft.git

# Go into the repository
$ cd GuessCraft

# Install dependencies
$ ./gradlew build
