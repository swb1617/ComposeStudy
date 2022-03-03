package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberImagePainter


@Composable
fun ProjectItem(project: Project) {
    Card(modifier = Modifier.padding(8.dp)) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = project.title, style = MaterialTheme.typography.h6)
                Text(
                    text = project.desc,
                    style = MaterialTheme.typography.body1,
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 6.dp)
                )
                Row(modifier = Modifier.padding(top = 6.dp)) {
                    Text(
                        text = project.author,
                        style = MaterialTheme.typography.body1,
                        color = Color.Gray
                    )
                    Text(
                        text = project.niceDate,
                        style = MaterialTheme.typography.body1,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
            }
            Image(painter = rememberImagePainter(
                data = project.envelopePic),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(55.dp)
                    .height(100.dp)
                    .padding(start = 4.dp)
            )
        }
    }
}

