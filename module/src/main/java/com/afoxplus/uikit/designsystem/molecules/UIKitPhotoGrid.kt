package com.afoxplus.uikit.designsystem.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitGridPhoto(
    modifier: Modifier = Modifier,
    photos: List<String>,
    columns: Int = 3,
    onPhotoClick: (String) -> Unit,
    contentPadding: PaddingValues = PaddingValues(UIKitTheme.spacing.spacing08),
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(UIKitTheme.spacing.spacing08),
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(UIKitTheme.spacing.spacing08)
) {
    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridCells.Fixed(columns),
        contentPadding = contentPadding,
        horizontalArrangement = horizontalArrangement,
        verticalArrangement = verticalArrangement
    ) {
        items(photos.size) { index ->
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(UIKitTheme.spacing.spacing08))
                    .clickable { onPhotoClick(photos[index]) }
                    .background(Color.LightGray)
            ) {
                AsyncImage(
                    model = photos[index],
                    contentDescription = "Image $index",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}