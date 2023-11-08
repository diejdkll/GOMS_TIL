package com.compose.goms_til.ui.main.component.start

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun StartSubTitleText() {
    GomsTilTheme { colors, typography ->
        Text(
            text = "스쿨존 사고를 알아보아요",
            color = colors.GRAY3,
            style = typography.content1,
        )
    }
}