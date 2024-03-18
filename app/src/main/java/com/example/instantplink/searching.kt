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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.action.Action

@Composable
fun searching(modifier: Modifier = Modifier){
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
    Surface() {
        Column(
            modifier = modifier
                .background(color = back)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding( bottom = 40.dp)
            ) {


                Image(
                    painter = painterResource(id = R.drawable.group), contentDescription = "image",
                    modifier = Modifier
                        .padding(top = 80.dp)
                        .fillMaxWidth()
                )
                Text(
                    "Searching...",
                    fontFamily = cherry,
                    fontSize = 45.sp,

                    )
                Text(
                    "plinkers near you",
                    fontFamily = schoolbell,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(bottom = 20.dp)
                )
            }

            Row(modifier = Modifier.padding(top = 20.dp, bottom = 10.dp)) {

                Image(
                    painter = painterResource(id = R.drawable.logo1), contentDescription = "image",
                    modifier = Modifier
                        .height(50.dp)
                        .width(50.dp)
                        .padding(end = 15.dp)
                        .clip(RoundedCornerShape(40.dp)),

                    )
                Column() {
                    Text(
                        text = "Download Plink App and become a plinker",
                        fontFamily = schoolbell,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(top = 8.dp),
                    )
                    Text(
                        text = "And create your personal portfolio!",
                        fontSize = 12.sp
                    )
                }

            }

            Button(
                onClick = {

                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(255,254,0)),
                modifier = Modifier
                    .height(65.dp)
                    .width(300.dp)
                    .padding(all = 10.dp),
                shape = RoundedCornerShape(15)

            ) {
                Text(
                    text = "Download Now",

                    fontFamily = schoolbell,
                    fontSize = 12.sp,

                    modifier = Modifier.padding(5.dp)
                )
            }


        }
    }


}

@Preview(showBackground = true)
@Composable
fun preview() {

    searching()

}