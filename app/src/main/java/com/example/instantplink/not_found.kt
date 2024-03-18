package com.example.instantplink

import android.graphics.pdf.PdfDocument.Page
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Start
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun notFound(modifier: Modifier = Modifier,) {
    val back= Color(218,203,252)
    val cherry = FontFamily(
        Font(
            resId = R.font.cherry_bomb_one,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.cherry_bomb_one,
            weight = FontWeight.Medium,
            style = FontStyle.Italic
        ),
    )
    val schoolbell = FontFamily(
        Font(
            resId = R.font.schoolbell,
            weight = FontWeight.Bold,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.schoolbell,
            weight = FontWeight.Medium,
            style = FontStyle.Italic
        ),

        )
    Column(modifier = modifier.background(color = back)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Image(
                painter = painterResource(id = R.drawable.oops), contentDescription = "image",
                modifier = Modifier
                    .padding(top = 40.dp)
                    .fillMaxWidth()
            )
            Text(
                "OOPS!",
                fontFamily = cherry,
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                "Profile not found!",
                fontFamily = schoolbell,
                fontSize = 18.sp,
                modifier = Modifier.padding( bottom = 40.dp)
            )
        }

        Row(modifier = Modifier.padding(top=20.dp, bottom = 20.dp)) {

            Image(
                painter = painterResource(id = R.drawable.logo1), contentDescription = "image",
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .padding(end = 15.dp)
                    .clip(RoundedCornerShape(30.dp)),
            )
            Column() {
                Text(
                    text = "Download Plink App and become a plinker",
                    fontSize = 16.sp,
                    fontFamily = schoolbell,
                    modifier = Modifier.padding(top = 8.dp),
                )
                Text(
                    text = "And create your personal portfolio !",
                    fontSize = 12.sp
                )
            }

        }

        Button(onClick = {},
            colors= ButtonDefaults.buttonColors(backgroundColor = Color(255,254,0)
            ),
            modifier = Modifier
                .height(65.dp)
                .width(300.dp)
                .padding(all = 10.dp),
            shape = RoundedCornerShape(15)

        ) {
            Text(text="Download Now",
                fontFamily = schoolbell,
               modifier= Modifier.padding(5.dp))
        }



    }


}
@Preview(showBackground = true)
@Composable
fun preview1() {

    notFound( )
}