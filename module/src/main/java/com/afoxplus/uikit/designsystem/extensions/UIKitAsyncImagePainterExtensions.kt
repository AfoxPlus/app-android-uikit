package com.afoxplus.uikit.designsystem.extensions

import android.content.Context
import androidx.compose.runtime.Composable
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest

@Composable
fun getImage(context: Context, url: String): AsyncImagePainter {
    return rememberAsyncImagePainter(
        model = ImageRequest.Builder(context)
            .data(url)
            .build()
    )
}