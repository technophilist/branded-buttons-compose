package com.theAndroidDeveloper.signInButtons.previews

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.brandedbuttons.BrandedButtonType
import com.theandroiddeveloper.brandedbuttons.BrandedButton

@PhoneDarkAndNightPreview
@Composable
internal fun TwitterButtonsPreview() {
    PreviewColumn {
        BrandedButton(
            brandedButtonType = BrandedButtonType.Twitter.DarkTwitterButton,
            label = "Sign in with Twitter",
            onClick = { /*TODO*/ }
        )
        Spacer(modifier = Modifier.size(16.dp))
        BrandedButton(
            brandedButtonType = BrandedButtonType.Twitter.LightTwitterButton,
            label = "Sign in with Twitter",
            onClick = { /*TODO*/ }
        )
    }
}