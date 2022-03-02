package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.example.myapplication.R


@Preview(name = "login")
@Composable
fun LoginPage() {
    val imageBitmap: ImageBitmap = ImageBitmap.imageResource(R.drawable.down)
    val delectedIcon: ImageBitmap = ImageBitmap.imageResource(R.drawable.up)
    Box(contentAlignment = Alignment.Center) {
        Image(
            bitmap = imageBitmap,
            contentDescription = "",
            contentScale= ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth().height(280.dp).clip(QureytoImageShapes(160f))
        )
//        Image(bitmap = delectedIcon, contentDescription = "")
    }
}

@Stable
class QureytoImageShapes(var hudu: Float = 100f) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.moveTo(0f, 0f)
        path.lineTo(0f, size.height-hudu)
        path.quadraticBezierTo(size.width/2f, size.height, size.width, size.height-hudu)
        path.lineTo(size.width,0f)
        path.close()
        return Outline.Generic(path)
    }
}
