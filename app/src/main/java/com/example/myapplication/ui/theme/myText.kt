package com.example.myapplication.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@Composable
fun myText(text:String){
    val nameState:MutableState<Color> = remember { mutableStateOf(Color.Green)}
    Text(text = text,
        modifier = Modifier.border(
            border = BorderStroke(
                width = 30.dp,
                color = Color.Black,
            ),
            shape = RoundedCornerShape(20f,60f,20f,150f),
        ).clickable(
            onClick = {
                nameState.value=Color.Yellow
            }
        ),
        color = nameState.value,
        fontSize = TextUnit.Unspecified,
        fontWeight = FontWeight.Bold,
    )
}