package com.compose.goms_til.ui.main.component.local_do

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalDoTitleText() {
    GomsTilTheme { colors, typography ->
        Text(
            text = "광역행정구역을 선택해주세요.",
            color = colors.BLACK,
            style = typography.title3,
        )
    }
}