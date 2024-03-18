package com.example.instantplink

import android.graphics.pdf.PdfDocument.Page
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Start
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController






@Composable
fun profile(modifier: Modifier = Modifier, ) {
     val back= Color(218,203,252)
    Surface() {


        Column(
            modifier = modifier
                .background(color = Color.White)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {


            Image(
                painter = painterResource(id = R.drawable.plinkblack), contentDescription = "image",
                modifier = Modifier
                    .align(alignment = Alignment.Start)
                    .size(80.dp)



            )

            Image(
                painter = painterResource(id = R.drawable.image_profile),
                contentDescription = "image",
                modifier = Modifier
                    .clip(RoundedCornerShape(50.dp))
                    .align(alignment = Alignment.Start)
                    //.fillMaxWidth()
                    .size(450.dp)
//                    .height(370.dp)
//                    .width(600.dp)
            )

            Text(
                "Sarah Rex",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 25.dp,top=2.dp)

            )
            Text(
                "UI/UX Designer and Graphic Designer",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 25.dp,)
            )


            Row(modifier = Modifier.padding(start = 25.dp)) {


                Icon(
                    Icons.Default.LocationOn,
                    contentDescription = "pin"
                )

                Text(
                    text = "India",
                    fontSize = 15.sp,
                    modifier = Modifier.padding(top = 5.dp),
                )


            }
            Text(
                "Over view",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 25.dp,)
            )
            Text(
                text = "Let my skills and expertise elevate your projects and contribute to your success.",
                fontSize = 16.sp,
                softWrap = true,
                modifier = Modifier.padding(top = 10.dp, start = 25.dp, bottom = 6.dp),
            )

            Row(modifier = Modifier.padding(start = 15.dp)) {
                Button(
                    onClick = {

                    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                    modifier = Modifier
                        .height(65.dp)
                        .width(170.dp)
                        .padding(all = 10.dp),
                    shape = RoundedCornerShape(15)

                ) {
                    Text(
                        "View Resume",
                        Modifier.padding(5.dp),
                        color = Color.White,
                    )
                }
                Button(
                    onClick = {

                    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    border = BorderStroke(width = 1.dp, color = Color.Black),
                    modifier = Modifier
                        .height(65.dp)
                        .width(170.dp)
//                    .border(0.dp, Color.Black)

                        .padding(all = 10.dp),

                    shape = RoundedCornerShape(15)

                ) {
                    Text(
                        "More",
                        Modifier.padding(5.dp)
                    )
                }
            }


        }
    }


}
@Preview(showBackground = true)
@Composable
fun preview2() {

    profile( )

}