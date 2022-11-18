package com.theandroiddeveloper.composesigninbuttons.previews

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.theandroiddeveloper.composesigninbuttons.twitter.DarkTwitterButton
import com.theandroiddeveloper.composesigninbuttons.twitter.LightTwitterButton

@PhoneDarkAndNightPreview
@Composable
internal fun TwitterButtonsPreview() {
    PreviewColumn {
        DarkTwitterButton(label = "Sign in with Twitter", onClick = { /*TODO*/ })
        Spacer(modifier = Modifier.size(16.dp))
        LightTwitterButton(label = "Sign in with Twitter", onClick = {})
    }
}