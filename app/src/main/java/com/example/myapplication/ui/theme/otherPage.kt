package com.example.myapplication.ui.theme

import android.content.Context
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

@Composable
fun ErrorPage(onclick: () -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(300.dp, 180.dp),
            painter = painterResource(id = R.drawable.no_conent),
            contentDescription = "网络问题",
            contentScale = ContentScale.Crop
        )
        Button(modifier = Modifier.padding(8.dp), onClick = onclick) {
            Text(text = "网络不佳，请点击重试")
        }
    }
}

@Composable
fun LoadingPage(context: Context = LocalContext.current) {
    val animate by rememberInfiniteTransition().animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(tween(500, easing = LinearEasing), RepeatMode.Restart)
    )
    val radius = context.dp2px(80f)
    Canvas(modifier = Modifier.fillMaxSize()) {
        translate(size.width / 2-radius, size.height / 2-radius) {
            drawArc(
                Purple700,
                0f,
                animate,
                false,
                size = Size(radius*2f, radius*2f),
                style = Stroke(context.dp2px(4f)),
                alpha = 0.6f
            )
        }
    }
}

fun Context.dp2px(dp:Float):Float{
    val density = resources.displayMetrics.density
    return dp*density+0.5f
}
