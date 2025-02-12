package com.afoxplus.uikit.designsystem.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme

@Composable
fun UIKitItemVerticalPhotoGrid(
    modifier: Modifier = Modifier,
    photos: List<String>,
    columns: Int = 3,
    onPhotoClick: (String) -> Unit,
    contentPadding: PaddingValues = PaddingValues(UIKitTheme.spacing.spacing00),
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(UIKitTheme.spacing.spacing08),
    verticalSpacing: Dp = UIKitTheme.spacing.spacing08
) {
    val density = LocalDensity.current
    val totalHeight = with(density) {
        val totalRows = (photos.size + columns - 1) / columns
        val gridItemHeightPx = 125.dp.toPx()
        val verticalSpacingPx = verticalSpacing.toPx()
        val paddingTopPx = contentPadding.calculateTopPadding().toPx()
        val paddingBottomPx = contentPadding.calculateBottomPadding().toPx()
        val totalHeightPx =
            totalRows * gridItemHeightPx + (totalRows - 1) * verticalSpacingPx + paddingTopPx + paddingBottomPx
        totalHeightPx.toDp()
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(totalHeight)
    ) {
        UIKitVerticalPhotoGrid(
            modifier,
            columns,
            contentPadding,
            horizontalArrangement,
            verticalSpacing,
            photos,
            onPhotoClick
        )
    }
}

@Composable
private fun UIKitVerticalPhotoGrid(
    modifier: Modifier,
    columns: Int,
    contentPadding: PaddingValues,
    horizontalArrangement: Arrangement.Horizontal,
    verticalSpacing: Dp,
    photos: List<String>,
    onPhotoClick: (String) -> Unit
) {
    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridCells.Fixed(columns),
        contentPadding = contentPadding,
        horizontalArrangement = horizontalArrangement,
        verticalArrangement = Arrangement.spacedBy(verticalSpacing)
    ) {
        items(photos.size) { index ->
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
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
