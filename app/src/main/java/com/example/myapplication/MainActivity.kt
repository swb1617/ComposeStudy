package com.example.myapplication

import ComposePage
import android.app.Activity
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            val systemUiController = rememberSystemUiController()
            systemUiController.setStatusBarColor(
                Color.Transparent, darkIcons = MaterialTheme.colors.isLight)
            MaterialTheme() {
                ComposePage()
            }
        }
    }
}



