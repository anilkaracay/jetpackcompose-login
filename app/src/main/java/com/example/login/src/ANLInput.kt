package com.example.login.src

import androidx.arch.core.util.Function
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue
import androidx.constraintlayout.widget.Placeholder

@Composable
fun ANLInput(
    value: String,
    label: @Composable (() -> Unit)?,
    placeholder: @Composable (() -> Unit)?,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = label,
        placeholder = placeholder,
        singleLine = true
    )

}