package com.example.matuleme1.ui.screen.signin

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.matuleme1.ui.components.AppButton
import com.example.matuleme1.ui.components.AppTextField
import com.example.matuleme1.ui.theme.BlockColor
import com.example.matuleme1.ui.theme.HintColor
import com.example.matuleme1.ui.theme.SubTextDarkColor
import com.example.matuleme1.ui.theme.TextColor
import com.example.matuleme1.ui.theme.defaultTextStyle

@Composable
fun SignInScreen(
    vm: SignInViewModule,
    navController: NavController
) {

    val state = vm.state

    Scaffold { containerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(containerPadding)
                .background(BlockColor)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                Spacer(modifier = Modifier.height(78.dp))

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Привет!",
                    style = defaultTextStyle.headingBold36,
                    color = TextColor
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    text = "Заполните Свои данные Или\nПродолжите Через Социальные Медиа",
                    style = defaultTextStyle.bodyRegular16,
                    color = SubTextDarkColor
                )

                Spacer(modifier = Modifier.height(35.dp))

                Text(
                    text = "Email",
                    style = defaultTextStyle.bodyRegular16,
                    color = TextColor
                )

                Spacer(modifier = Modifier.height(12.dp))

                AppTextField(
                    value = state.email,
                    onValueChange = { email ->
                        vm.updateEmail(email)
                    },
                    hintText = "xyz@gmail.com"
                )

                Spacer(modifier = Modifier.height(26.dp))

                Text(
                    text = "Пароль",
                    style = defaultTextStyle.bodyRegular16,
                    color = TextColor
                )

                Spacer(modifier = Modifier.height(12.dp))

                AppTextField(
                    value = state.password,
                    onValueChange = { password ->
                        vm.updatePassword(password)
                    },
                    hintText = "••••••••",
                    isPassword = true
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    modifier = Modifier.align(Alignment.End),
                    text = "Воcстановить",
                    style = defaultTextStyle.bodyRegular12,
                    color = SubTextDarkColor
                )

                Spacer(modifier = Modifier.height(24.dp))

                AppButton(
                    modifier = Modifier.height(50.dp),
                    text = "Войти"
                )

                Spacer(modifier = Modifier.height(209.dp))

                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier,
                        text = "Вы впервые?",
                        style = defaultTextStyle.bodyRegular16,
                        color = HintColor
                    )

                    Spacer(modifier = Modifier.width(2.dp))

                    Text(
                        modifier = Modifier.clickable {

                        },
                        text = "Создать пользователя",
                        style = defaultTextStyle.bodyRegular16,
                        color = TextColor
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun SignInScreenPreview() {
    SignInScreen(vm = SignInViewModule(), navController = rememberNavController())
}
