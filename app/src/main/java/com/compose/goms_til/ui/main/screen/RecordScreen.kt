package com.compose.goms_til.ui.main.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.main.component.record.RecordButton
import com.compose.goms_til.ui.main.component.record.RecordChartExample
import com.compose.goms_til.ui.main.component.record.RecordSubTitleText
import com.compose.goms_til.ui.main.component.record.RecordTitleText
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun RecordScreen() {
    GomsTilTheme { colors, _ ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colors.WHITE)
                .padding(start = 20.dp, end = 20.dp),
        ) {
            Spacer(modifier = Modifier.fillMaxHeight(0.06f))
            RecordTitleText()
            Spacer(modifier = Modifier.height(4.dp))
            RecordSubTitleText()
            Spacer(modifier = Modifier.fillMaxHeight(0.03f))
            RecordChartExample()
            Spacer(modifier = Modifier.fillMaxHeight(0.3f))
            RecordButton {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecordScreenPreview() {
    RecordScreen()
}