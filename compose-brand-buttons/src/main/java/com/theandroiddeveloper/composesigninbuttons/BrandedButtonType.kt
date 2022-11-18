package com.theandroiddeveloper.composesigninbuttons


import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


/**
 * A sealed classes hierarchy that contains different properties associated with each branded
 * button.
 */
internal sealed class BrandedButtonType(
    @DrawableRes val iconResId: Int,
    val iconHeight: Dp,
    val backgroundColor: Color,
    val contentColor: Color
) {
    object LightGoogleButton : BrandedButtonType(
        iconResId = R.drawable.btn_google_light_normal_ios,
        iconHeight = 40.dp,
        backgroundColor = Color.White,
        contentColor = Color.Gray
    )

    object DarkGoogleButton : BrandedButtonType(
        iconResId = R.drawable.btn_google_light_normal_ios,
        iconHeight = 40.dp,
        backgroundColor = Color(0xFF4285F4),
        contentColor = Color.White
    )

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

    object DarkFacebookButton : BrandedButtonType(
        iconResId = R.drawable.facebook_logo_white,
        iconHeight = 25.dp,
        backgroundColor = Color(0xFF1877f2),
        contentColor = Color.White
    )
}