package com.afoxplus.uikit.designsystem.molecules

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
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
    onTabSelected: @Composable (index: Int) -> Unit
) {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
    val pagerState = rememberPagerState { tabItems.size }
    val coroutineScope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {
        TabRow(
            modifier = modifier,
            selectedTabIndex = selectedTabIndex,
            divider = {},
            containerColor = Color.Transparent
        ) {
            tabItems.forEachIndexed { index, item ->
                Tab(
                    selected = (index == selectedTabIndex),
                    onClick = {
                        selectedTabIndex = index
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(selectedTabIndex)
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
        ) { index -> onTabSelected(index) }

        LaunchedEffect(pagerState.currentPage, pagerState.isScrollInProgress) {
            if (!pagerState.isScrollInProgress) {
                selectedTabIndex = pagerState.currentPage
            }
        }
    }
}


data class UIKitTabItem(
    val title: String,
    val screen: @Composable () -> Unit
)