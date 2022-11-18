package com.theandroiddeveloper.composesigninbuttons.previews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.composesigninbuttons.google.DarkGoogleButton
import com.theandroiddeveloper.composesigninbuttons.google.LightGoogleButton
import com.theandroiddeveloper.composesigninbuttons.twitter.DarkTwitterButton
import com.theandroiddeveloper.composesigninbuttons.twitter.LightTwitterButton

@PhoneDarkAndNightPreview
@Composable
fun AllButtonsPreview() {
    PreviewColumn {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            DarkGoogleButton(label = "Sign in with Google", onClick = { /*TODO*/ })
            LightGoogleButton(label = "Sign in with Google", onClick = { /*TODO*/ })
            DarkTwitterButton(label = "Sign in with Twitter", onClick = { /*TODO*/ })
            LightTwitterButton(label = "Sign in with Twitter", onClick = { /*TODO*/ })
        }
    }
}