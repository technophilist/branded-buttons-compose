package com.theandroiddeveloper.composesigninbuttons.previews

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.composesigninbuttons.google.DarkGoogleButton
import com.theandroiddeveloper.composesigninbuttons.google.LightGoogleButton
import com.theandroiddeveloper.composesigninbuttons.twitter.DarkTwitterButton
import com.theandroiddeveloper.composesigninbuttons.twitter.LightTwitterButton


@PhoneDarkAndNightPreview
@Composable
internal fun DarkGoogleButtonPreview() {
    PreviewColumn {
        DarkGoogleButton(
            label = "Sign up with Google",
            onClick = {}
        )
        Spacer(modifier = Modifier.size(16.dp))
        LightGoogleButton(
            label = "Sign up with Google",
            onClick = { /*TODO*/ }
        )
    }
}

