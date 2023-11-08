package com.compose.goms_til.ui.main.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.main.component.local_dong.LocalDongBackButton
import com.compose.goms_til.ui.main.component.local_dong.LocalDongList
import com.compose.goms_til.ui.main.component.local_dong.LocalDongNextButton
import com.compose.goms_til.ui.main.component.local_dong.LocalDongTitleText

@Composable
fun LocalDongScreen(
    onNextClick: () -> Unit,
    onBackClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp)
    ) {
        Column {
            Spacer(modifier = Modifier.fillMaxHeight(0.03f))
            LocalDongTitleText()
            Spacer(modifier = Modifier.height(16.dp))
            LocalDongList()
        }
        Column {
            Spacer(modifier = Modifier.fillMaxHeight(0.9f))
            Row(modifier = Modifier.padding(start = 6.dp, end = 6.dp)) {
                LocalDongBackButton(
                    modifier = Modifier
                        .height(56.dp)
                        .weight(1f)
                ) {
                    onBackClick()
                }
                Spacer(modifier = Modifier.width(5.dp))
                LocalDongNextButton(
                    modifier = Modifier
                        .height(56.dp)
                        .weight(1f)
                ) {
                    onNextClick()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LocalDongScreenPreview() {
    LocalDongScreen({}, {})
}