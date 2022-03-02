package com.example.myapplication.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ListStudy(){
    val scrollState = rememberLazyListState()
    LazyColumn(state = scrollState) {
        items(10){
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                StudyLayoutViews()
                Spacer(modifier = Modifier.padding(horizontal = 5.dp))
                StudyLayoutViews()
            }
        }

    }
}