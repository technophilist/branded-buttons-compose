![Banner image](images/banner.png)
<p align = "center"> A simple library that can be used to create branded sign-in,sign-up and "continue with" buttons. </p>

# Branded Buttons [![Project Status: WIP – Initial development is in progress, but there has not yet been a stable, usable release suitable for the public.](https://www.repostatus.org/badges/latest/wip.svg)](https://www.repostatus.org/#wip)
Branded Buttons for compose is a library that contains buttons stylized according to the specification of each brand. It allows you to create high quality social sign-in, sign-up, and "continue with" buttons. For example, you can create a Google branded button with a label that displays "Sign up with Google". Just tell the library which brand and variant is required. The library takes care of creating a button with the required brand colors and logo. In addition, it takes care of setting the appropriate semantic properties. This ensures that **the button works well with accessibility services out of the box.**

## Currently available buttons
- Google 
- Twitter 
- Github 
- Apple 
- Facebook 

## Usage
The central API of this library is the ```BrandedButton()``` composable function. It has three mandatory arguments that allows you to specify the type of the branded button, label and a lamda that will be executed when the button is clicked. It also has other optional parameters that allows you to customize the button.
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
