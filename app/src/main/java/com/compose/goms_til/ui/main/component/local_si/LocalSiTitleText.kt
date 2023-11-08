package com.compose.goms_til.ui.main.component.local_si

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalSiTitleText() {
    GomsTilTheme { colors, typography ->
        Text(
            text = "행정구역을 선택해주세요.",
            color = colors.BLACK,
            style = typography.title3,
        )
    }
}