package com.afoxplus.uikit.designsystem.molecules

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.afoxplus.uikit.designsystem.atoms.UIKitText
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UIKitTabs(
    modifier: Modifier = Modifier,
    tabItems: List<UIKitTabItem>,
    onTabSelected: @Composable (index: Int, tabItem: UIKitTabItem) -> Unit
) {
    val pagerState = rememberPagerState { tabItems.size }
    val selectedTabIndex = remember { derivedStateOf { pagerState.currentPage } }
    val coroutineScope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {
        TabRow(
            modifier = modifier,
            selectedTabIndex = selectedTabIndex.value,
            divider = {},
            containerColor = Color.Transparent
        ) {
            tabItems.forEachIndexed { index, item ->
                Tab(
                    selected = selectedTabIndex.value == index,
                    onClick = {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(tabItems.indexOf(item))
                        }
                    },
                    text = {
                        UIKitText(
                            text = item.title,
                            style = UIKitTheme.typography.header05Bold
                        )
                    }
                )
            }
        }

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxWidth()
        ) {
            val item = tabItems[selectedTabIndex.value]
            Log.d("LOG_VALE", "PAGER $item")
            onTabSelected(selectedTabIndex.value, tabItems[selectedTabIndex.value])
        }
    }
}


data class UIKitTabItem(
    val title: String,
    val screen: @Composable () -> Unit
)