package com.compose.goms_til.ui.main.component.start

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun StartTitleText() {
    GomsTilTheme { colors, typography ->
        Text(
            text = "PROTECT",
            color = colors.BLACK,
            style = typography.title1,
        )
    }
}