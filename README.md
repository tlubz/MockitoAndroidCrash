# MockitoAndroidCrash
Example app that crashes due to a mockito-android bug

instructions to repro:

```bash
git clone git@github.com:tlubz/MockitoAndroidCrash.git
MockitoAndroidCrash/gradlew :app:testDebugUnitTest
```

or open project in Android Studio, find `ExampleUnitTest.java`, and run the test.
