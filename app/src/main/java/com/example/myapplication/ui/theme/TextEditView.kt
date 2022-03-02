package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextFieldView(textName:String,onClick: (value: String) -> Unit,email:MutableState<String> = remember { mutableStateOf("") }){
    Box() {
//        val email = remember { mutableStateOf("") }
        //键盘控制器，可控制键盘的展示和隐藏
        val keyboardController = LocalSoftwareKeyboardController.current
        TextField(
            value = email.value,
            onValueChange = { email.value = it },
            shape = RoundedCornerShape(20.dp),
            label = { Text(text = textName,color = Pink200) },
            placeholder = {
                Text(
                    text = "请输入~ ",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            },  // 提示输入内容
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                disabledIndicatorColor = Pink200,
                errorIndicatorColor = Pink200,
                placeholderColor = Pink200,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Pink200),
            modifier = Modifier
                .border(
                    1.dp,
                    Pink200,
                    shape = RoundedCornerShape(18.dp)
                )
            ,
            leadingIcon = {
                Image(
                    imageVector = Icons.Filled.Email,
                    contentDescription = null,
                    modifier = Modifier.clickable(
                        onClick = {}
                    )
                )
            },
            trailingIcon = {
                Image(
                    imageVector = Icons.Filled.Delete,
                    contentDescription = null
                )
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(
                onDone = {
                    keyboardController?.hide()
                    onClick(email.value)
                }
            )
        )
    }
}


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextPasswordEdit(textName:String, onClick: (value: String) -> Unit, password:MutableState<String> = remember { mutableStateOf("") }){
    Box() {
//        val password = remember { mutableStateOf("") }
        //键盘控制器，可控制键盘的展示和隐藏
        val keyboardController = LocalSoftwareKeyboardController.current
        TextField(
            value = password.value,
            onValueChange = { password.value = it },
            shape = RoundedCornerShape(18.dp),
            label = { Text(text = textName,color = Pink200) },
            placeholder = {
                Text(
                    text = "请输入~ ",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            },  // 提示输入内容
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                disabledIndicatorColor = Pink200,
                errorIndicatorColor = Pink200,
                placeholderColor = Pink200,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                cursorColor = Pink200
            ),
            modifier = Modifier.border(
                1.dp,
                Pink200,
                shape = RoundedCornerShape(18.dp)
            ),
            visualTransformation = PasswordVisualTransformation(),
            leadingIcon = {
                Image(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = null,
                    modifier = Modifier.clickable(
                        onClick = {password.value = ""}
                    )
                )
            },
            trailingIcon = {
                Image(
                    imageVector = Icons.Filled.Delete,
                    contentDescription = null
                )
            },
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(
                onDone = {
                    keyboardController?.hide()
                    onClick(password.value)
                }
            )
        )
    }
}
