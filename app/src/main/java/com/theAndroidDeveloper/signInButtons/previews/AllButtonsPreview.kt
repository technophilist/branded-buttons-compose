package com.theAndroidDeveloper.signInButtons.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.brandedbuttons.BrandedButton

@PhoneDarkAndNightPreview
@Composable
internal fun AllButtonsPreview() {
    PreviewColumn {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            BrandedButton(
                brandedButtonType = BrandedButtonType.Google.DarkGoogleButton,
                label = "Sign in with Google",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Google.LightGoogleButton,
                label = "Sign in with Google",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Twitter.DarkTwitterButton,
                label = "Sign in with Twitter",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Twitter.LightTwitterButton,
                label = "Sign in with Twitter",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Facebook.DarkFacebookButton,
                label = "Sign in with Facebook",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Apple.DarkAppleButton,
                label = "Sign in with Apple",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Apple.LightAppleButton,
                label = "Sign in with Apple",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Github.DarkGithubButton,
                label = "Sign in with Github",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brandedButtonType = BrandedButtonType.Github.LightGithubButton,
                label = "Sign in with Github",
                onClick = { /*TODO*/ }
            )
        }
    }
}