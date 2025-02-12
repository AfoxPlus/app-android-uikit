package com.afoxplus.uikit.designsystem.atoms

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import com.afoxplus.uikit.designsystem.foundations.UIKitTheme
import com.afoxplus.uikit.designsystem.molecules.UIKitLoading

enum class UIKitButtonStatus() {
    ACTIVE,
    DISABLED,
    LOADING
}

sealed class UIKitButtonType() {

    data class OutlineLarge(val status: UIKitButtonStatus = UIKitButtonStatus.ACTIVE) :
        UIKitButtonType()

    data class FilledLarge(val status: UIKitButtonStatus = UIKitButtonStatus.ACTIVE) :
        UIKitButtonType()

    data class OutlineMedium(val status: UIKitButtonStatus = UIKitButtonStatus.ACTIVE) :
        UIKitButtonType()

    data class FilledMedium(val status: UIKitButtonStatus = UIKitButtonStatus.ACTIVE) :
        UIKitButtonType()

    data class OutlineSmall(val status: UIKitButtonStatus = UIKitButtonStatus.ACTIVE) :
        UIKitButtonType()

    data class FilledSmall(val status: UIKitButtonStatus = UIKitButtonStatus.ACTIVE) :
        UIKitButtonType()

}

@Composable
fun UIKitButton(
    modifier: Modifier = Modifier,
    type: UIKitButtonType = UIKitButtonType.OutlineLarge(UIKitButtonStatus.ACTIVE),

    text: String = "",
    textStyle: TextStyle? = null,
    textColor: Color? = null,

    buttonColor: ButtonColors? = null,
    buttonPadding: PaddingValues? = null,
    buttonBorder: BorderStroke? = null,
    buttonShape: Shape? = null,

    onClick: () -> Unit
) {
    when (type) {
        is UIKitButtonType.OutlineLarge -> {
            when (type.status) {
                UIKitButtonStatus.ACTIVE -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.header05SemiBold,
                        textColor = textColor ?: UIKitTheme.colors.primaryColor,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.light01,
                            contentColor = UIKitTheme.colors.light01
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing16,
                            vertical = UIKitTheme.spacing.spacing16
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.medium,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.DISABLED -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.header05SemiBold,
                        textColor = textColor ?: UIKitTheme.colors.gray300,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.light01,
                            contentColor = UIKitTheme.colors.light01
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing16,
                            vertical = UIKitTheme.spacing.spacing16
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.gray300
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.medium,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.LOADING -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.header05SemiBold,
                        textColor = textColor ?: UIKitTheme.colors.primaryColor,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.light01,
                            contentColor = UIKitTheme.colors.light01
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing16,
                            vertical = UIKitTheme.spacing.spacing16
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.medium,
                        circleColor = UIKitTheme.colors.primaryColor,
                        circleSize = UIKitTheme.spacing.spacing12,
                        onClick = { onClick() },
                        isLoading = true
                    )
                }
            }
        }

        is UIKitButtonType.FilledLarge -> {
            when (type.status) {
                UIKitButtonStatus.ACTIVE -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.header05SemiBold,
                        textColor = textColor ?: UIKitTheme.colors.light01,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.primaryColor,
                            contentColor = UIKitTheme.colors.primaryColor
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing16,
                            vertical = UIKitTheme.spacing.spacing16
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.medium,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.DISABLED -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.header05SemiBold,
                        textColor = textColor ?: UIKitTheme.colors.light01,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.gray300,
                            contentColor = UIKitTheme.colors.gray300
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing16,
                            vertical = UIKitTheme.spacing.spacing16
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.gray300
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.medium,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.LOADING -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.header05SemiBold,
                        textColor = textColor ?: UIKitTheme.colors.primaryColor,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.primaryColor,
                            contentColor = UIKitTheme.colors.primaryColor
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing16,
                            vertical = UIKitTheme.spacing.spacing16
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.medium,
                        circleColor = UIKitTheme.colors.light01,
                        circleSize = UIKitTheme.spacing.spacing12,
                        onClick = { onClick() },
                        isLoading = true
                    )
                }
            }
        }

        is UIKitButtonType.OutlineMedium -> {
            when (type.status) {
                UIKitButtonStatus.ACTIVE -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph01,
                        textColor = textColor ?: UIKitTheme.colors.primaryColor,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.light01,
                            contentColor = UIKitTheme.colors.light01
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing12,
                            vertical = UIKitTheme.spacing.spacing12
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.DISABLED -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph01,
                        textColor = textColor ?: UIKitTheme.colors.gray300,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.light01,
                            contentColor = UIKitTheme.colors.light01
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing12,
                            vertical = UIKitTheme.spacing.spacing12
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.gray300
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.LOADING -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph01,
                        textColor = textColor ?: UIKitTheme.colors.gray300,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.light01,
                            contentColor = UIKitTheme.colors.light01
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing12,
                            vertical = UIKitTheme.spacing.spacing12
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        circleColor = UIKitTheme.colors.primaryColor,
                        circleSize = UIKitTheme.spacing.spacing10,
                        onClick = { onClick() },
                        isLoading = true
                    )
                }
            }
        }

        is UIKitButtonType.FilledMedium -> {
            when (type.status) {
                UIKitButtonStatus.ACTIVE -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph01,
                        textColor = textColor ?: UIKitTheme.colors.light01,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.primaryColor,
                            contentColor = UIKitTheme.colors.primaryColor
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing12,
                            vertical = UIKitTheme.spacing.spacing12
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.DISABLED -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph01,
                        textColor = textColor ?: UIKitTheme.colors.light01,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.gray300,
                            contentColor = UIKitTheme.colors.gray300
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing12,
                            vertical = UIKitTheme.spacing.spacing12
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.gray300
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.LOADING -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph01,
                        textColor = textColor ?: UIKitTheme.colors.gray300,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.primaryColor,
                            contentColor = UIKitTheme.colors.primaryColor
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing12,
                            vertical = UIKitTheme.spacing.spacing12
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing02,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        circleColor = UIKitTheme.colors.light01,
                        circleSize = UIKitTheme.spacing.spacing10,
                        onClick = { onClick() },
                        isLoading = true
                    )
                }
            }
        }

        is UIKitButtonType.OutlineSmall -> {
            when (type.status) {
                UIKitButtonStatus.ACTIVE -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph02,
                        textColor = textColor ?: UIKitTheme.colors.primaryColor,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.light01,
                            contentColor = UIKitTheme.colors.light01
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing08,
                            vertical = UIKitTheme.spacing.spacing08
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing01,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.DISABLED -> {
                    //TODO - UIKitButtonStatus.DISABLED
                }

                UIKitButtonStatus.LOADING -> {
                    //TODO - UIKitButtonStatus.LOADING
                }
            }
        }

        is UIKitButtonType.FilledSmall -> {
            when (type.status) {
                UIKitButtonStatus.ACTIVE -> {
                    UIKitButtonGeneric(
                        modifier = modifier,
                        text = text,
                        textStyle = textStyle ?: UIKitTheme.typography.paragraph02,
                        textColor = textColor ?: UIKitTheme.colors.light01,
                        buttonColor = buttonColor ?: ButtonDefaults.buttonColors(
                            containerColor = UIKitTheme.colors.primaryColor,
                            contentColor = UIKitTheme.colors.primaryColor
                        ),
                        buttonPadding = buttonPadding ?: PaddingValues(
                            horizontal = UIKitTheme.spacing.spacing08,
                            vertical = UIKitTheme.spacing.spacing08
                        ),
                        buttonBorder = buttonBorder ?: BorderStroke(
                            width = UIKitTheme.spacing.spacing01,
                            color = UIKitTheme.colors.primaryColor
                        ),
                        buttonShape = buttonShape ?: UIKitTheme.shapes.small,
                        onClick = { onClick() }
                    )
                }

                UIKitButtonStatus.DISABLED -> {
                    //TODO - UIKitButtonStatus.DISABLED
                }

                UIKitButtonStatus.LOADING -> {
                    //TODO - UIKitButtonStatus.LOADING
                }
            }
        }
    }
}

@Composable
private fun UIKitButtonGeneric(
    modifier: Modifier,
    text: String = "",
    textStyle: TextStyle,
    textColor: Color,
    buttonColor: ButtonColors,
    buttonPadding: PaddingValues,
    buttonBorder: BorderStroke,
    buttonShape: Shape,
    circleColor: Color = UIKitTheme.colors.primaryColor,
    circleSize: Dp = UIKitTheme.spacing.spacing12,
    onClick: () -> Unit,
    isLoading: Boolean = false
) {
    OutlinedButton(
        modifier = modifier,
        colors = buttonColor,
        border = buttonBorder,
        shape = buttonShape,
        contentPadding = buttonPadding,
        onClick = {
            onClick()
        }
    ) {
        if (isLoading) {
            UIKitLoading(
                travelDistance = UIKitTheme.spacing.spacing06,
                circleColor = circleColor,
                circleSize = circleSize
            )
        } else {
            UIKitText(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                text = text,
                textAlign = TextAlign.Center,
                style = textStyle,
                color = textColor
            )
        }
    }
}

@Deprecated("UIKitButtonPrimaryLarge is deprecated", ReplaceWith("UIKitButton"))
@Composable
fun UIKitButtonPrimaryLarge(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor = UIKitTheme.colors.primaryColor),
    shape: Shape = UIKitTheme.shapes.medium,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .fillMaxWidth(),
        enabled = enabled,
        onClick = {
            onClick()
        },
        colors = colors,
        shape = shape
    ) {
        UIKitText(
            modifier = modifier
                .fillMaxWidth()
                .padding(UIKitTheme.spacing.spacing10)
                .align(Alignment.CenterVertically),
            text = text,
            textAlign = TextAlign.Center,
            style = UIKitTheme.typography.header05SemiBold,
            color = UIKitTheme.colors.light01
        )
    }
}

@Deprecated("UIKitButtonOutlineLarge is deprecated", ReplaceWith("UIKitButton"))
@Composable
fun UIKitButtonOutlineLarge(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    border: BorderStroke = BorderStroke(
        UIKitTheme.spacing.spacing02,
        UIKitTheme.colors.primaryColor
    ),
    shape: Shape = UIKitTheme.shapes.medium,
    textColor: Color = UIKitTheme.colors.primaryColor,
    onClick: () -> Unit
) {

    OutlinedButton(
        modifier = modifier
            .fillMaxWidth(),
        border = border,
        shape = shape,
        enabled = enabled,
        onClick = {
            onClick()
        }
    ) {
        UIKitText(
            modifier = modifier
                .fillMaxWidth()
                .padding(UIKitTheme.spacing.spacing10)
                .align(Alignment.CenterVertically),
            text = text,
            textAlign = TextAlign.Center,
            style = UIKitTheme.typography.header05SemiBold,
            color = textColor
        )
    }
}