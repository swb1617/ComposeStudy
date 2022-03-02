package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TextFieldDefaults.textFieldColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.internal.enableLiveLiterals
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun loginPage(navController: NavController) {
    val imageBitmap: ImageBitmap = ImageBitmap.imageResource(R.drawable.shenzi)
    val headPortrait: ImageBitmap = ImageBitmap.imageResource(R.drawable.name)
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
//    val deleteIcon:ImageBitmap = ImageBitmap.imageResource(id = R.drawable.delete)
    Column {
        Box(contentAlignment = Alignment.Center) {
            Image(
                bitmap = imageBitmap,
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp)
                    .clip(QureytoImageShapes(160f))
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(0.dp)
                    .clip(CicleImageShape)
                    .background(Color(206, 236, 250, 121))
                    .width(130.dp)
                    .height(130.dp)
            ) {
                Image(
                    bitmap = headPortrait,
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(80.dp)
                        .width(80.dp)
                        .background(color = Pink200, shape = CircleShape)
                        .padding(0.dp)
                        .clip(
                            CircleShape
                        )
                        .shadow(elevation = 150.dp, clip = true)
                )
            }
        }
        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "ComposeTest 登陆",
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(text = "更多精彩,更多体验 ~", fontSize = 12.sp, color = Color.Gray)
            }
        }
        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        ) {
            Column {
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    shape = RoundedCornerShape(20.dp),
                    label = { Text(text = "邮箱",color = Pink200) },
                    placeholder = {
                        Text(
                            text = "请输入~ ",
                            fontSize = 16.sp,
                            color = Color.Gray
                        )
                    },  // 提示输入内容
                    singleLine = true,
                    colors = textFieldColors(
                        backgroundColor = Color.White,
                        disabledIndicatorColor = Pink200,
                        unfocusedIndicatorColor = Pink200,
                        focusedIndicatorColor = Pink200,
                        errorIndicatorColor = Pink200,
                        placeholderColor = Pink200,
                        cursorColor = Pink200),
                    modifier = Modifier
                        .border(
                            1.dp,
                            Pink200,
                            shape = RoundedCornerShape(18.dp))
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
                    }
                )

                Spacer(modifier = Modifier.size(10.dp))
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    shape = RoundedCornerShape(18.dp),
                    label = { Text(text = "密码",color = Pink200) },
                    placeholder = {
                        Text(
                            text = "请输入~ ",
                            fontSize = 16.sp,
                            color = Color.Gray
                        )
                    },  // 提示输入内容
                    singleLine = true,
                    colors = textFieldColors(
                        backgroundColor = Color.White,
                        disabledIndicatorColor = Pink200,
                        unfocusedIndicatorColor = Pink200,
                        focusedIndicatorColor = Pink200,
                        errorIndicatorColor = Pink200,
                        placeholderColor = Pink200,
                        cursorColor = Pink200),
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
                                onClick = {email = ""}
                            )
                        )
                    },
                    trailingIcon = {
                        Image(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = null
                        )
                    },
                )
            }
        }
        MaterialTheme {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 50.dp, vertical = 20.dp)
                ) {
                    Checkbox(
                        checked = true,
                        onCheckedChange = { },
                        colors = CheckboxDefaults.colors(checkedColor = Pink200)
                    )
                    Text(
                        "用户注册",
                        color = Pink200,
                        modifier = Modifier
                            .clickable(
                                onClick = {}
                            )
                            .border(
                                1.dp,
                                color = Pink200,
                                shape = LineUndFunction
                            )
                    )
                }
            }
        }
        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        )
        {
            Button(
                onClick = {navController.navigate("homePage")},
                enabled = A(email,password),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.width(140.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Pink200)
            ) {
                Text(
                    text = "登陆",
                    modifier = Modifier
                        .padding(10.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            }
        }
    }
}

val LineUndFunction: Shape = object : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.moveTo(0f, size.height - 3f)
        path.lineTo(size.width, size.height - 3f)
        path.lineTo(size.width, size.height)
        path.lineTo(0f, size.height)
        path.close()
        return Outline.Generic(path)
    }
}

@Stable
object CicleImageShape : Shape {
    var hudu: Float = 100f
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.moveTo(0f, 0f)
        path.lineTo(0f, size.height - hudu)
        path.quadraticBezierTo(size.width / 2f, size.height, size.width, size.height - hudu)
        path.lineTo(size.width, 0f)
        path.close()
        return Outline.Generic(path)
    }
}

@Stable
class AnimalRoundedCornerShape(val value:Float=30f):Shape{
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.lineTo(value,0f)
        path.cubicTo(value,0f,0f,0f,0f,value)
        path.lineTo(0f,size.height-value)
        path.cubicTo(0f,size.height-value,0f,size.height,value,size.height)
        path.quadraticBezierTo(size.width/2,size.height-value,size.width-value,size.height)
        path.quadraticBezierTo(size.width,size.height,size.width,size.height-value)
        path.lineTo(size.width,value)
        path.quadraticBezierTo(size.width,0f,size.width-value,0f)
        path.quadraticBezierTo(size.width/2,value,value,0f)
        path.lineTo(value,0f)
        return Outline.Generic(path)
    }
}


fun A(email:String,password:String): Boolean {
    if (email == "123456" && password == "123456")
    {
        return true
    }
    else
        return false
}