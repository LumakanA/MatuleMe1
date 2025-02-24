package com.example.matuleme1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.matuleme1.R
import com.example.matuleme1.ui.theme.AccentColor
import com.example.matuleme1.ui.theme.BackgroundColor
import com.example.matuleme1.ui.theme.BlockColor
import com.example.matuleme1.ui.theme.defaultTextStyle

@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    text: String,
    isBuyButton: Boolean = false
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        colors = ButtonColors(AccentColor, BlockColor, AccentColor, AccentColor),
        shape = RoundedCornerShape(12.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            if (isBuyButton) {
                Image(
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.CenterStart),
                    painter = painterResource(R.drawable.eye_open),
                    contentDescription = null
                )
            }
            Text(
                text = text,
                style = defaultTextStyle.bodySemiBold14.copy(BackgroundColor)
            )
        }
    }
}

@Preview
@Composable
fun AppButtonPreview() {
    AppButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Test Text",
    )
}