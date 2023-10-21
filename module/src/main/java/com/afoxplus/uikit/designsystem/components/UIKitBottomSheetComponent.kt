package com.afoxplus.uikit.designsystem.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.afoxplus.uikit.R
import com.afoxplus.uikit.designsystem.extensions.noRippleClickable
import com.afoxplus.uikit.designsystem.theme.UIKitTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun <T> UIKitBottomSheet(
    modifier: Modifier = Modifier,
    title: String,
    list: MutableList<T>,
    description: (T) -> String,
    showIcon: (T) -> Boolean,
    onClick: (T) -> Unit,
    onDismiss: () -> Unit,
    sheetState: SheetState,
    color: Color = Color.White
) {
    ModalBottomSheet(
        onDismissRequest = { onDismiss() },
        sheetState = sheetState,
        containerColor = color
    ) {
        Column {
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = title,
                style = UIKitTheme.typography.header05SemiBold,
                color = UIKitTheme.colors.dark01,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(UIKitTheme.spacing.spacing10))
            Divider(
                modifier = Modifier
                    .height(UIKitTheme.spacing.spacing02)
                    .background(color = UIKitTheme.colors.light03)
            )
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn(modifier = modifier.fillMaxWidth()) {
                items(list.size) { itemPosition ->
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = UIKitTheme.spacing.medium)
                            .noRippleClickable {
                                onClick(list[itemPosition])
                            }
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = description(list[itemPosition]),
                                style = UIKitTheme.typography.paragraph01SemiBold,
                                color = UIKitTheme.colors.dark03
                            )
                            if (showIcon(list[itemPosition])) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_uikit_check),
                                    contentDescription = "check_icon"
                                )
                            }
                        }
                        if ((list.size - 1) != itemPosition) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Divider(
                                modifier = Modifier
                                    .height(1.dp)
                                    .background(color = UIKitTheme.colors.light03)
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                    }

                }
            }
        }
        Spacer(modifier = Modifier.height(70.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
internal fun BottomSheetComponentPreview() = UIKitTheme {
    val sheetState = rememberModalBottomSheetState()
    UIKitBottomSheet(
        list = arrayListOf(
            BottomSheetContentVO(0, "Pendiente", false),
            BottomSheetContentVO(1, "Proceso", true),
            BottomSheetContentVO(1, "Rechazado", false),
            BottomSheetContentVO(1, "Finalizado", false),
        ),
        title = "Elige un nuevo estado al pedido",
        description = {
            it.description
        },
        onClick = {
            Log.d("TAG", "Here - BottomSheetComponentPreview: $it")
        },
        onDismiss = {
            Log.d("TAG", "Here - BottomSheetComponentPreview")
        },
        showIcon = {
            it.check
        },
        sheetState = sheetState
    )
}

data class BottomSheetContentVO(
    val id: Int,
    val description: String,
    val check: Boolean = false
)