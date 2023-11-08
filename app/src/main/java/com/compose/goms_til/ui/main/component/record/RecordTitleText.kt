package com.compose.goms_til.ui.main.component.record

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun RecordTitleText() {
    GomsTilTheme { colors, typography ->
        Text(
            text = "서울특별시 도봉구1",
            color = colors.BLACK,
            style = typography.title2,
        )
    }
}