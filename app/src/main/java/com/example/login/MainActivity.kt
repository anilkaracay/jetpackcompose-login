package com.example.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.login.src.ANLButton
import com.example.login.src.ANLInput
import com.example.login.ui.theme.LoginTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {

            }
        }
    }
}

@Composable
@Preview
fun LoginPage() {
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Log in with email",
                modifier = Modifier.paddingFromBaseline(top = 184.dp, bottom = 16.dp),
            )
            ANLInput(
                value = emailValue.value,
                onValueChange = { emailValue.value = it },
                label = { Text("Email address") },
                placeholder = { Text(text = "Enter email address") },

                )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            ANLInput(
                value = passwordValue.value,
                onValueChange = { passwordValue.value = it },
                label = { Text("Password") },
                placeholder = { Text(text = "Enter password") }
            )

            Spacer(modifier = Modifier.padding(18.dp))
            ANLButton(
                onClick = { },
                modifier = Modifier
                    .width(100.dp)
                    .height(58.dp),
                text = "Sign in"
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Text(
                text = "Create Account",
                modifier = Modifier.clickable(onClick = {})
            )


        }


    }

}
