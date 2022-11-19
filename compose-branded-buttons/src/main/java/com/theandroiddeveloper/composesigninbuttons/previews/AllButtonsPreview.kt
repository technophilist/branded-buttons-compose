package com.theandroiddeveloper.composesigninbuttons.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.composesigninbuttons.Brand
import com.theandroiddeveloper.composesigninbuttons.BrandedButton

@PhoneDarkAndNightPreview
@Composable
internal fun AllButtonsPreview() {
    PreviewColumn {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            BrandedButton(
                brand = Brand.Google.DarkGoogleButton,
                label = "Sign in with Google",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brand = Brand.Google.LightGoogleButton,
                label = "Sign in with Google",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brand = Brand.Twitter.DarkTwitterButton,
                label = "Sign in with Twitter",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brand = Brand.Twitter.LightTwitterButton,
                label = "Sign in with Twitter",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brand = Brand.Facebook.DarkFacebookButton,
                label = "Sign in with Facebook",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brand = Brand.Apple.DarkAppleButton,
                label = "Sign in with Apple",
                onClick = { /*TODO*/ }
            )
            BrandedButton(
                brand = Brand.Apple.LightAppleButton,
                label = "Sign in with Apple",
                onClick = { /*TODO*/ }
            )
        }
    }
}