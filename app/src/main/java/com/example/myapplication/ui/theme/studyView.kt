package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R


@Composable
fun StudyLayoutViews() {
    val imageBitmap: ImageBitmap = ImageBitmap.imageResource(id = R.drawable.img)
    val deteleIcon: ImageBitmap = ImageBitmap.imageResource(id = R.drawable.delete)
    Box(modifier = Modifier.clip(BoxClipShapes).background(color = Color(89, 199, 249)))
    {
        Box(
            modifier = Modifier
                .padding(0.dp)
                .clip(BoxClipShapes)
                .background(Color(206, 236, 250))
                .border(width = 1.dp, color = Color(79, 129, 160), shape = BoxClipShapes)
        )
        {
            Row(
                modifier = Modifier
                    .background(Color(206, 236, 250), shape = BoxClipShapes)
                    .padding(10.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        bitmap = imageBitmap,
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                            .background(color = Color.White, shape = CircleShape)
                            .padding(3.dp)
                            .clip(
                                CircleShape
                            )
                            .shadow(elevation = 150.dp, clip = true)
                    )
                    Column(modifier = Modifier.padding(start = 5.dp)) {
                        Text(
                            text = "Container",
                            fontSize = 12.sp,
                            color = Color.Gray,
                        )
                        Text(
                            "容器组件",
                            modifier = Modifier.padding(top = 3.dp, bottom = 3.dp),
                            fontSize = 12.sp,
                            color = Color.Gray,
                        )
                        Text(
                            "123万阅读量",
                            fontSize = 8.sp,
                            color = Color.White,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .padding(start = 30.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Image(
                            bitmap = deteleIcon,
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                                .shadow(elevation = 150.dp, clip = true)
                        )
                    }
                }
            }
        }
    }
}




@Stable
val BoxClipShapes: Shape = object : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.moveTo(20f, 0f)
        path.relativeLineTo(-20f, 20f)
        path.relativeLineTo(0f,size.height - 40f)
        path.relativeLineTo(20f, 20f)
        path.relativeLineTo(size.width / 3f-20, 0f)
        path.relativeLineTo(15f, -20f)
        path.relativeLineTo(size.width / 3f-30, 0f)
        path.relativeLineTo(15f, 20f)
        path.relativeLineTo(size.width / 3f-20, 0f)
        path.relativeLineTo(20f, -20f)
        path.relativeLineTo(0f, -(size.height - 40f))
        path.relativeLineTo(-20f, -20f)
        path.relativeLineTo(-(size.width / 3f-20),0f)
        path.relativeLineTo(-15f,20f)
        path.relativeLineTo(-(size.width / 3f-30), 0f)
        path.relativeLineTo(-15f, -20f)
        path.close()
        return Outline.Generic(path)
    }
}
