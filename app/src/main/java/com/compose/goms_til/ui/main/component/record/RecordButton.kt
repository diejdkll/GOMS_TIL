package com.compose.goms_til.ui.main.component.record

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.goms_til.R
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun RecordButton(onClick: () -> Unit) {
    GomsTilTheme { colors, typography ->
        Box(
            modifier = Modifier
                .background(
                    color = colors.GRAY1,
                    shape = RoundedCornerShape(16.dp)
                )
                .shadow(elevation = 8.dp, spotColor = Color(0x14000000), ambientColor = Color(0x14000000))
                .clickable {
                    onClick()
                }
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_record),
                contentDescription = "Record Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, end = 13.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "다른 지역도 알아보기",
                    color = colors.BLACK,
                    style = typography.content2,
                    textDecoration = TextDecoration.Underline,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecordButtonPreview() {
    RecordButton({})
}