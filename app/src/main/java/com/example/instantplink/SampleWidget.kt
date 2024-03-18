package com.example.instantplink

import android.util.Pair
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape


import androidx.compose.foundation.text.BasicText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import java.util.*
import coil.compose.rememberAsyncImagePainter

//THIS CODE IS IN JETPACK COMPOSE NOT IN JETPACK GLANCE SO WONT WORK IN WIDGETS
data class MyModel(val date: Date, val imageURL: String?)
data class Location(val name: String, val coordinate: Pair<Double, Double>)

@Composable
fun MyWidgetView(entry: MyModel) {
    val pinColor = Color.White

    Surface(color = Color.Black) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

                Image(
                    painter = rememberAsyncImagePainter(entry.imageURL),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }

            Column( verticalArrangement = Arrangement.SpaceBetween,

                modifier = Modifier.
                padding(16.dp)

            ) {

                Row {
                    Spacer(modifier = Modifier.fillMaxWidth(0.65f))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier.size(60.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.avatar),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .size(64.dp)
                                    .clip(CircleShape)                       // clip to the circle shape
                                    .border(2.dp, color = pinColor, CircleShape),
                                contentScale = ContentScale.Crop,
                                alignment = Alignment.Center,

                                )
                        }

                        Spacer(
                            modifier = Modifier
                                .size(8.dp)
                                .drawWithCache {

                                    val path = Path()
                                    path.moveTo(0f, 0f) // Start from top-left corner
                                    path.lineTo(
                                        size.width / 2f,
                                        size.height
                                    ) // Draw line to bottom-middle
                                    path.lineTo(size.width, 0f)
                                    path.close()
                                    onDrawBehind {
                                        drawPath(path, color = pinColor, style = Fill)
                                    }
                                }
                                .fillMaxSize()
                                .offset(y = (-14).dp)
                        )

                    }
                }



                        //Spacer(modifier = Modifier.fillMaxWidth())

                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Column(
                        Modifier.align(Alignment.Bottom)
                    ) {

                        Text(
                            text = "Explore",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.body1
                        )
                        BasicText(
                            text = "Kolkata",
                            style = MaterialTheme.typography.body1
                        )
                    }
                }

             Container()
            }

        }
    }


@Composable
@Preview(showBackground = true)
fun MyWidgetPreview() {
    val locations =
        Location(name = "Kolkata", coordinate = Pair(51.501, -0.141))

    val entry = MyModel(date = Date(), imageURL = "https://api.mapbox.com/styles/v1/erklabs/clrktvr2v002q01peameb9am0/static/-0.141,51.501,13,0/300x300@2x?access_token=pk.eyJ1IjoiZXJrbGFicyIsImEiOiJjbGtqcWRnYTMwbjc4M21sbml3eTUxbHZzIn0.xpSDMZkBifhBOyNdzu21Xw") // Replace null with the actual image URL
    MyWidgetView(entry = entry)
}




