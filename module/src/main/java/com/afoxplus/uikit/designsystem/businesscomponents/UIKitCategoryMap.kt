package com.afoxplus.uikit.designsystem.businesscomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.designsystem.atoms.UIKitChip
import com.afoxplus.uikit.objects.vendor.RestaurantCategory

@Composable
fun UIKitCategoryMap(
    chipItems: List<RestaurantCategory>,
    modifier: Modifier = Modifier,
    onSelectedChips: (List<RestaurantCategory>) -> Unit
) {
    val selectedStates =
        remember { mutableStateListOf(*chipItems.map { it.isSelected }.toTypedArray()) }
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        itemsIndexed(chipItems) { index, item ->
            UIKitChip(
                text = item.name,
                isSelected = selectedStates[index],
                onChipClick = {
                    selectedStates[index] = !selectedStates[index]
                    val selectedChips = chipItems.filterIndexed { i, _ -> selectedStates[i] }
                    onSelectedChips(selectedChips)
                }
            )
        }
    }
}