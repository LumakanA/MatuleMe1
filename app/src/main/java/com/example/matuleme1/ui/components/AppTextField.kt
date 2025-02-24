package com.example.matuleme1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.matuleme1.R
import com.example.matuleme1.ui.theme.BackgroundColor
import com.example.matuleme1.ui.theme.HintColor
import com.example.matuleme1.ui.theme.TextColor
import com.example.matuleme1.ui.theme.defaultTextStyle

@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false,
    hintText: String = ""
) {
    var isTextVisible by remember { mutableStateOf(!isPassword) }

    BasicTextField(
        modifier = modifier
            .background(color = BackgroundColor, shape = RoundedCornerShape(15.dp))
            .fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        textStyle = defaultTextStyle.bodyRegular14.copy(TextColor),
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 16.dp)
            ) {
                BasicText(
                    text = if (value.isEmpty()) hintText else "",
                    style = defaultTextStyle.bodyRegular14.copy(HintColor)
                )
                if (isPassword) {
                    Image(
                        modifier = Modifier
                            .clickable { isTextVisible = !isTextVisible }
                            .align(Alignment.CenterEnd)
                            .size(16.dp),
                        painter = if (isTextVisible) painterResource(R.drawable.eye_open) else painterResource(
                            R.drawable.eye_close
                        ),
                        contentDescription = ""
                    )
                }
                innerTextField()
            }
        },
        visualTransformation = if (isPassword && !isTextVisible) PasswordVisualTransformation('*') else VisualTransformation.None
    )
}

@Preview
@Composable
fun AppTextFieldPreview() {
    AppTextField(
        modifier = Modifier.fillMaxWidth(),
        value = "Test Text",
        hintText = "Test Text",
        onValueChange = {},
        isPassword = true
    )
}