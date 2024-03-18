package com.example.instantplink

import android.content.Context
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.glance.*
import androidx.glance.action.Action
import androidx.glance.action.actionStartActivity
import androidx.glance.action.clickable
import androidx.glance.appwidget.*
import androidx.glance.layout.*
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider



class MyAppWidgetReceiverMedium : GlanceAppWidgetReceiver() {

    override val glanceAppWidget: GlanceAppWidget = MyAppWidgetMedium()
}

class MyAppWidgetMedium : GlanceAppWidget() {

    override val sizeMode = SizeMode.Single
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        // Load data needed to render the AppWidget.
        // Use `withContext` to switch to another thread for long running
        // operations.

        provideContent {
            // create your AppWidget here
            MyContent()
        }
    }

    @Composable
    private fun MyContent() {
        val context = LocalContext.current

       // val pinColor = Color.White

        Box(
            modifier = GlanceModifier.fillMaxSize()
                .cornerRadius(12.dp),
            contentAlignment = Alignment.BottomStart
        ) {

            ImageViewBack(context = context, ContentScale.FillBounds)


            Row(
                modifier = GlanceModifier.padding(16.dp)

            ) {
                Column{

                    Text(
                        text = "Explore People",
                        style = TextStyle(
                            fontWeight = androidx.glance.text.FontWeight.Bold,
                            color = ColorProvider(Color.Black)
                        )
                    )
                    Text(
                        text = "Kolkata",

                        )
                }
            }
        }

        //upper row of image and inverted triangle
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = GlanceModifier.padding(16.dp)
        ) {

            Column(

                //verticalAlignment = Alignment.CenterVertically,
                horizontalAlignment = Alignment.Start,
               // modifier = GlanceModifier.fillMaxWidth()
            ) {
           Column(  verticalAlignment = Alignment.CenterVertically,
               horizontalAlignment = Alignment.CenterHorizontally,) {

               ImageView(context = context, ContentScale.Crop, ImageProvider(R.drawable.person2))
               Image(provider = ImageProvider(R.drawable.triangle), contentDescription = "null")
           }


            }
            Spacer(modifier = GlanceModifier.padding(horizontal = 60.dp))
            Column(

               // verticalAlignment = Alignment.CenterVertically,
                horizontalAlignment = Alignment.End,
                //modifier = GlanceModifier.fillMaxWidth()
            ) {
                Column(  verticalAlignment = Alignment.CenterVertically,
                    horizontalAlignment = Alignment.CenterHorizontally,) {

                    ImageView(context = context, ContentScale.Crop, ImageProvider(R.drawable.avatar))
                    Image(provider = ImageProvider(R.drawable.triangle), contentDescription = "null")
                }


            }
        }
    }


    @Composable
    fun ImageView(context: Context, contentScale: ContentScale, imageProvider: ImageProvider) {
        Image(
            provider = imageProvider,
            contentDescription = "",
            modifier = GlanceModifier.size(40.dp).background(ImageProvider(R.drawable.circle))
                .clickable(actionLaunchActivity())
                .cornerRadius(20.dp)
                .padding(2.dp),
            contentScale = contentScale,

            )
    }

    @Composable
    fun ImageViewBack(context: Context, contentScale: ContentScale) {
        Image(
            provider = ImageProvider(R.drawable.map),
            contentDescription = "",
            modifier = GlanceModifier.size(80.dp).background(Color.Gray).fillMaxWidth()
                .fillMaxHeight()
                .clickable(actionLaunchActivity()),
            contentScale = contentScale
        )
    }





    private fun actionLaunchActivity(): Action = actionStartActivity<MainActivity>()

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
    MyAppWidgetMedium()
}


