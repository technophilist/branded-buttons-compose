package com.theandroiddeveloper.brandedbuttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.brandedbuttons.R

/**
 * A sealed classes hierarchy that contains different visual properties associated with each branded
 * button.
 */
sealed class BrandedButtonType(
    val iconResId: Int,
    val iconHeight: Dp,
    val backgroundColor: Color,
    val contentColor: Color,
    val contentPadding: PaddingValues = ButtonDefaults.ContentPadding
) {
    object Google {
        object LightGoogleButton : BrandedButtonType(
            iconResId = R.drawable.btn_google_light_normal_ios,
            iconHeight = 40.dp,
            backgroundColor = Color.White,
            contentColor = Color.Gray,
            contentPadding = PaddingValues(end = 8.dp)
        )

        object DarkGoogleButton : BrandedButtonType(
            iconResId = R.drawable.btn_google_light_normal_ios,
            iconHeight = 40.dp,
            backgroundColor = Color(0xFF4285F4),
            contentColor = Color.White,
            contentPadding = PaddingValues(end = 8.dp)
        )
    }

    object Twitter {
        object DarkTwitterButton : BrandedButtonType(
            iconResId = R.drawable.twitter_logo_white,
            iconHeight = 20.dp,
            backgroundColor = Color(0xFF121212),
            contentColor = Color.White
        )

        object LightTwitterButton : BrandedButtonType(
            iconResId = R.drawable.twitter_logo_white,
            iconHeight = 20.dp,
            backgroundColor = Color(0xFF1D9BF0),
            contentColor = Color.White
        )
    }

    object Facebook {
        object DarkFacebookButton : BrandedButtonType(
            iconResId = R.drawable.facebook_logo_white,
            iconHeight = 25.dp,
            backgroundColor = Color(0xFF1877f2),
            contentColor = Color.White
        )

    }

    object Apple {
        object DarkAppleButton : BrandedButtonType(
            iconResId = R.drawable.apple_logo_white,
            iconHeight = 25.dp,
            backgroundColor = Color(0xFF000000),
            contentColor = Color.White
        )

        object LightAppleButton : BrandedButtonType(
            iconResId = R.drawable.apple_logo_black,
            iconHeight = 25.dp,
            backgroundColor = Color.White,
            contentColor = Color.Black
        )
    }

    object Github{
        object LightGithubButton:BrandedButtonType(
            iconResId = R.drawable.github_logo_black,
            iconHeight = 40.dp,
            backgroundColor = Color.White,
            contentColor = Color.Black,
            contentPadding = PaddingValues(horizontal = 8.dp)
        )
        object DarkGithubButton:BrandedButtonType(
            iconResId = R.drawable.github_logo_white,
            iconHeight = 40.dp,
            backgroundColor = Color(0xFF333333),
            contentColor = Color.White,
            contentPadding = PaddingValues(horizontal = 8.dp)
        )
    }
}
