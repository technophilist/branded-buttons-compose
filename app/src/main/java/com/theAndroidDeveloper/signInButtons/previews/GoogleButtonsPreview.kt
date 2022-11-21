package com.theAndroidDeveloper.signInButtons.previews

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.brandedbuttons.BrandedButtonType
import com.brandedbuttons.BrandedButton


@PhoneDarkAndNightPreview
@Composable
internal fun DarkGoogleButtonPreview() {
    PreviewColumn {
        BrandedButton(
            brandedButtonType = BrandedButtonType.Google.DarkGoogleButton,
            label = "Sign in with Google",
            onClick = { /*TODO*/ }
        )
        Spacer(modifier = Modifier.size(16.dp))
        BrandedButton(
            brandedButtonType = BrandedButtonType.Google.LightGoogleButton,
            label = "Sign in with Google",
            onClick = { /*TODO*/ }
        )
    }
}

