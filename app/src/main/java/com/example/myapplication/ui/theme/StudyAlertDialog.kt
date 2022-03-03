package com.example.myapplication.ui.theme

import android.app.Dialog
import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.semantics.Role.Companion.Button


@Composable
fun DialogStudy(title:String,text:String) {
    var showDialog by remember { mutableStateOf(false) }
//    Column() {
//        Button(onClick = { showDialog = !showDialog }) {
//            Text("click show AlerDialog")
//        }navController.navigate("homePage")
        if (showDialog) {
            AlertDialog(
                onDismissRequest = {
                    showDialog = false
                },
                title = {
                    Text(text = title)
                },
                text = {
                    Text(text)
                },
                confirmButton = {
                    TextButton(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text("Confirm")
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = {
                            showDialog = false
                        }
                    ) {
                        Text("Dismiss")
                    }
                }
            )
        }
    }
