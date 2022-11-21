![Banner image](images/banner.png)
<p align = "center"> A simple library that can be used to create branded sign-in,sign-up, and "continue with" buttons. </p>

# Branded Buttons [![Project Status: WIP – Initial development is in progress, but there has not yet been a stable, usable release suitable for the public.](https://www.repostatus.org/badges/latest/wip.svg)](https://www.repostatus.org/#wip)
Branded Buttons for compose is a library that contains stylized buttons according to the specification of each brand. It allows you to create high quality social sign-in, sign-up, and "continue with" buttons. For example, you can create a Google branded button with a label that displays "Sign up with Google". Just tell the library which brand and variant is required. The library takes care of creating a button with the required brand colors and logo. In addition, it takes care of setting the appropriate semantic properties. This ensures that **the button works well with accessibility services out of the box.**

## Accessibility
As mentioned, the buttons contain appropriate semantic properties that works well with accessibility services. For example, if a user is using the Talkback service and the UI presents one or more of the buttons from this library the talkback service will use the phrase - "{The label of the button} button". For example, if the label is set to "Sign in with Google", the talkback service will say "Sign in with Google button".

## Installation
1. Add 'https://jitpack.io' to the ```settings.gradle``` file of your project. If you have configured your project such that all project level repositories are defined in the **project level ```build.gradle```** file, then, instead of adding it to the settings.gradle file, add it to the **project level build.gradle** file.

```groovy
// settings.gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' } // add this
    }
}
```

```groovy
// project level build.gradle
allprojects {
    repositories {
        google()
        jcenter()
    }
}

```

2. Add the following dependency to your app's ```build.gradle``` file.

```groovy
dependencies {
    implementation 'com.github.t3chkid:branded-buttons-compose:2.0.0-alpha01'
}
```

## Currently available buttons
- Google <br>
<img src ="images/google-buttons.png" width = "273" height = "141"></img>
- Twitter <br>
<img src ="images/twitter-buttons.png" width = "273" height = "141"></img>
- Github <br>
<img src ="images/github-buttons.png" width = "273" height = "141"></img>
- Apple <br>
<img src ="images/apple-buttons.png" width = "273" height = "141"></img>
- Facebook <br>
<img src ="images/facebook-button.png" width = "301" height = "73"></img>

## Usage
The central API of this library is the ```BrandedButton()``` composable function. It has three mandatory arguments that allows you to specify the type of the branded button, label, and a lambda that will be executed when the button is clicked. It also has other optional parameters that allows you to customize the button.
```kotlin
@Composable
fun BrandedButton(
    brandedButtonType: BrandedButtonType,
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = LocalTextStyle.current.copy(fontWeight = FontWeight.Bold),
    enabled: Boolean = true,
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = null
)
```

### Example
```kotlin
// A braded Github social login button.
BrandedButton(
  brandedButtonType = BrandedButtonType.Github.DarkGithubButton,
  label = "Sign in with Github",
  onClick = {}
)
```
## Roadmap
Currently, this library is in its very early stages of development. It is also based on Material Design 2. Once the api is stable, I plan to make a separate artifact that contains buttons suitable for use with Material Design 3.
