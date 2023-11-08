package com.compose.goms_til.ui.main.component.local_dong

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.main.component.ListItemComponent
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun LocalDongList() {
    val items = listOf("용당1동", "용당2동", "연동", "산정동", "연산동", "원산동", "대성동", "목원동", "동명동", "삼학동", "삼학동", "삼학동", "삼학동", "삼학동", "삼학동", "삼학동", "삼학동")

    GomsTilTheme { colors, _ ->
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(items.lastIndex) { index ->
                ListItemComponent(items[index])
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}