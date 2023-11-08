package com.compose.goms_til.ui.main.component.record

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun RecordSubTitleText() {
    GomsTilTheme { colors, typography ->
        Text(
            text = "서울특별시 도봉구 창동(창림초교 부근)",
            color = colors.GRAY3,
            style = typography.content1,
        )
    }
}