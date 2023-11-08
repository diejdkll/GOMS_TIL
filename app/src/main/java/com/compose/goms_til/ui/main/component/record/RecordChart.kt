package com.compose.goms_til.ui.main.component.record

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun RecordChartChart(
    data: List<BarData>,
    modifier: Modifier = Modifier
) {
    GomsTilTheme { colors, typography ->
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.Start
        ) {
            data.forEach { barData ->
                Column {
                    Text(
                        text = barData.title,
                        color = colors.BLACK,
                        style = typography.content2
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(24.dp)
                            .background(
                                color = colors.GRAY2,
                                shape = RoundedCornerShape(size = 8.dp)
                            )
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(barData.value)
                                .height(24.dp)
                                .background(
                                    color = colors.MAIN,
                                    shape = RoundedCornerShape(size = 8.dp)
                                )
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(end = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(modifier = Modifier.weight(1f))
                            Text(
                                text = barData.label,
                                color = colors.BLACK,
                                style = typography.content3
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}

data class BarData(val title: String, val label: String, val value: Float)

@Composable
fun RecordChartExample() {
    val data = listOf(
        BarData("발생건수", "3", 0.5f),
        BarData("사상자수", "6", 0.8f),
        BarData("사망자수", "2", 0.35f),
        BarData("중상자수", "1", 0.2f),
        BarData("경상자수","1", 0.2f),
    )

    RecordChartChart(data = data, modifier = Modifier.fillMaxWidth())
}

@Preview(showBackground = true)
@Composable
fun RecordChartExamplePreview() {
    RecordChartExample()
}
