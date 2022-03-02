package com.example.myapplication.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import android.os.Bundle
import android.provider.MediaStore.Images.Media.getBitmap
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import com.example.myapplication.R

/**
 * 抽屉内容
 */
@Composable
fun drawerContentPage() {
    val headPortrait: ImageBitmap = ImageBitmap.imageResource(R.drawable.name)
    Box(contentAlignment = Alignment.TopStart) {
        androidx.compose.foundation.Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .width(250.dp),
            onDraw = {
                drawIntoCanvas { canvas ->
                    val paint = Paint()
                    paint.color = Color(36, 36, 92, 255)
                    paint.style = PaintingStyle.Fill
                    paint.isAntiAlias = true
                    paint.blendMode = BlendMode.ColorDodge
                    val roundRect = Path()
                    roundRect.moveTo(0f, 0f)
                    roundRect.lineTo(size.width - 350f, 0f)
                    roundRect.quadraticBezierTo(
                        size.width,
                        size.height / 2f,
                        size.width - 350f,
                        size.height
                    )
                    roundRect.lineTo(0f, size.height)
                    roundRect.close()
                    canvas.clipPath(roundRect)
                    canvas.drawPath(roundRect, paint)
                }
            }
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Image(
                bitmap = headPortrait,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .offset(x = 40.dp, y = 50.dp)
                    .background(color = Color(0XFF0DBEBF), shape = CircleShape)
                    .padding(3.dp)
                    .clip(
                        CircleShape
                    )
                    .shadow(elevation = 150.dp, clip = true)
//                    .rotate(
//                        animatedOffset.value
//                    )
            )
            Column(
                modifier = Modifier.offset(x = 40.dp, y = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                Text(text = "Hello_World", fontSize = 13.sp, color = Color.White)
                Text(text = "路很长一加油", fontSize = 8.sp, color = Color.White)

                Row(modifier = Modifier.padding(top = 45.dp)) {
                    Image(
                        bitmap = headPortrait,
                        contentDescription = "1",
                        modifier = Modifier
                            .clickable {
                            }.padding(end = 15.dp)
                            .size(10.dp)

                    )
                    Text(text = "Login", fontSize = 13.sp, color = Color.White)
                }
                Row(modifier = Modifier.padding(top = 45.dp)) {
                    Image(
                        bitmap = headPortrait,
                        contentDescription = "1",
                        modifier = Modifier
                            .clickable {
                            }.padding(end = 15.dp)
                            .size(10.dp)
                    )
                    Text(text = "Login", fontSize = 13.sp, color = Color.White)
                }
                Row(modifier = Modifier.padding(top = 45.dp)) {
                    Image(
                        bitmap = headPortrait,
                        contentDescription = "1",
                        modifier = Modifier
                            .clickable {
                            }.padding(end = 15.dp)
                            .size(10.dp)
                    )
                    Text(text = "Login", fontSize = 13.sp, color = Color.White)
                }

                Row(modifier = Modifier.padding(top = 45.dp)) {
                    Image(
                        bitmap = headPortrait,
                        contentDescription = "1",
                        modifier = Modifier
                            .clickable {
                            }.padding(end = 15.dp)
                            .size(10.dp)
                    )
                    Text(text = "Login", fontSize = 13.sp, color = Color.White)
                }



                Row(modifier = Modifier.padding(top = 95.dp)) {
                    Image(
                        bitmap = headPortrait,
                        contentDescription = "1",
                        modifier = Modifier
                            .clickable {
                            }.padding(end = 15.dp)
                            .size(10.dp)
                    )
                    Text(text = "Login", fontSize = 13.sp, color = Color.White)
                }
                Row(modifier = Modifier.padding(top = 45.dp)) {
                    Image(
                        bitmap = headPortrait,
                        contentDescription = "1",
                        modifier = Modifier
                            .clickable {
                            }.padding(end = 15.dp)
                            .size(10.dp)
                    )
                    Text(text = "Login", fontSize = 13.sp, color = Color.White)
                }
                Row(modifier = Modifier.padding(top = 45.dp)) {
                    Image(
                        bitmap = headPortrait,
                        contentDescription = "1",
                        modifier = Modifier
                            .clickable {
                            }.padding(end = 15.dp)
                            .size(10.dp)
                    )
                    Text(text = "Login", fontSize = 13.sp, color = Color.White)
                }
            }
        }
    }
}


//LazyColumn(modifier = Modifier.fillMaxWidth(),
//contentPadding = PaddingValues(10.dp),
//verticalArrangement = Arrangement.spacedBy(10.dp),
//) {
//    items(5) { index ->
//        Text(text = "抽屉内容 ${index+1} ",
//            fontSize = 14.sp,
//            color = MaterialTheme.colors.primary,)
//    }
//
//}
