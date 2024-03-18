package com.example.instantplink



import android.content.Context
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

import androidx.glance.action.clickable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.glance.*

import androidx.glance.action.Action
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.cornerRadius
import androidx.glance.layout.*

private fun actionLaunchActivity(): Action = actionStartActivity<MainActivity>()


@Composable
fun iconView(context: Context, contentScale: ContentScale, imageProvider: ImageProvider) {
    Image(
        provider = imageProvider,
        contentDescription = "",
        modifier = GlanceModifier.size(55.dp)
            .clickable(actionLaunchActivity())
            .cornerRadius(20.dp)
            .padding(2.dp),
        contentScale = contentScale,

        )
}

@Composable
fun IconBarView() {
    val context = LocalContext.current
   Row(
        modifier = GlanceModifier
            .fillMaxWidth()
            .height(75.dp)

    ) {
      Row(
            verticalAlignment = Alignment.CenterVertically,
          horizontalAlignment = Alignment.CenterHorizontally,


            modifier = GlanceModifier.fillMaxSize()
                .background(Color.White)
                .cornerRadius(12.dp),
        ) {
          iconView(context = context, contentScale = ContentScale.Crop, ImageProvider(R.drawable.search))
          Spacer(modifier = GlanceModifier.size(8.dp))
          iconView(context = context, contentScale = ContentScale.Crop, ImageProvider(R.drawable.icon2))
          Spacer(modifier = GlanceModifier.size(8.dp))
          iconView(context = context, contentScale = ContentScale.Crop, ImageProvider(R.drawable.icon3))
          Spacer(modifier = GlanceModifier.size(8.dp))
          iconView(context = context, contentScale = ContentScale.Crop, ImageProvider(R.drawable.icon4))


      }
    }
}

@Preview
@Composable
fun ElevatedContainer1() {
    MaterialTheme {
        IconBarView()
    }
}
