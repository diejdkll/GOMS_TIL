package com.compose.goms_til.ui.component.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.compose.goms_til.ui.theme.GomsTilTheme

@Composable
fun GomsTilButton(
    text: String,
    textColor: Color,
    buttonColor: Color,
    modifier: Modifier,
    onClick: () -> Unit
) {
    GomsTilTheme { colors, typography ->
        Button(
            modifier = modifier,
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(buttonColor),
            onClick = { onClick() }
        ) {
            Text(
                text = text,
                color = textColor,
                style = typography.buttonText
            )
        }
    }
}