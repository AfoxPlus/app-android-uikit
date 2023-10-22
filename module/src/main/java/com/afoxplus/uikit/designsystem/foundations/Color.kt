package com.afoxplus.uikit.designsystem.foundations

import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

internal val Light01 = Color(0xFFFFFFFF)

internal val Orange900 = Color(0xFF7E2410)
internal val Orange800 = Color(0xFF9C2A10)
internal val Orange700 = Color(0xFFC4320A)
internal val Orange600 = Color(0xFFEC4A0A)
internal val Orange500 = Color(0xFFFB6514)
internal val Orange400 = Color(0xFFFD853A)
internal val Orange300 = Color(0xFFFEB273)
internal val Orange200 = Color(0xFFFDDCAB)
internal val Orange100 = Color(0xFFFFEAD5)
internal val Orange50 = Color(0xFFFFF6ED)
internal val Orange25 = Color(0xFFFFFAF5)

internal val Rose900 = Color(0xFF89123E)
internal val Rose800 = Color(0xFFA11043)
internal val Rose700 = Color(0xFFC01048)
internal val Rose600 = Color(0xFFE31B54)
internal val Rose500 = Color(0xFFF63D68)
internal val Rose400 = Color(0xFFFD6F8E)
internal val Rose300 = Color(0xFFFEA3B4)
internal val Rose200 = Color(0xFFFECDD6)
internal val Rose100 = Color(0xFFFFE4E8)
internal val Rose50 = Color(0xFFFFF1F3)
internal val Rose25 = Color(0xFFFFF5F6)

internal val Blue900 = Color(0xFF194185)
internal val Blue800 = Color(0xFF1849A9)
internal val Blue700 = Color(0xFF175CD3)
internal val Blue600 = Color(0xFF1570EF)
internal val Blue500 = Color(0xFF2E90FA)
internal val Blue400 = Color(0xFF53B1FD)
internal val Blue300 = Color(0xFF84CAFF)
internal val Blue200 = Color(0xFFB2DDFF)
internal val Blue100 = Color(0xFFD1E9FF)
internal val Blue50 = Color(0xFFEFF8FF)
internal val Blue25 = Color(0xFFF5FAFF)

internal val BlueGray900 = Color(0xFF101323)
internal val BlueGray800 = Color(0xFF293056)
internal val BlueGray700 = Color(0xFF363F72)
internal val BlueGray600 = Color(0xFF3E4784)
internal val BlueGray500 = Color(0xFF4E5BA6)
internal val BlueGray400 = Color(0xFF717BBC)
internal val BlueGray300 = Color(0xFFAFB5D9)
internal val BlueGray200 = Color(0xFFD5D9EB)
internal val BlueGray100 = Color(0xFFEAECF5)
internal val BlueGray50 = Color(0xFFF8F9FC)
internal val BlueGray25 = Color(0xFFFCFCFD)

internal val Green900 = Color(0xFF054F31)
internal val Green800 = Color(0xFF05603A)
internal val Green700 = Color(0xFF027A48)
internal val Green600 = Color(0xFF039855)
internal val Green500 = Color(0xFF12B76A)
internal val Green400 = Color(0xFF32D583)
internal val Green300 = Color(0xFF6CE9A6)
internal val Green200 = Color(0xFFA6F4C5)
internal val Green100 = Color(0xFFD1FADF)
internal val Green50 = Color(0xFFECFDF3)
internal val Green25 = Color(0xFFF6FEF9)

internal val Yellow900 = Color(0xFF7A2E0E)
internal val Yellow800 = Color(0xFF93370D)
internal val Yellow700 = Color(0xFFB54708)
internal val Yellow600 = Color(0xFFDC6803)
internal val Yellow500 = Color(0xFFF79009)
internal val Yellow400 = Color(0xFFFDB022)
internal val Yellow300 = Color(0xFFFEC84B)
internal val Yellow200 = Color(0xFFFEDF89)
internal val Yellow100 = Color(0xFFFEF0C7)
internal val Yellow50 = Color(0xFFFFFAEB)
internal val Yellow25 = Color(0xFFFFFCF5)

internal val Red900 = Color(0xFF7A271A)
internal val Red800 = Color(0xFF912018)
internal val Red700 = Color(0xFFB42318)
internal val Red600 = Color(0xFFD92D20)
internal val Red500 = Color(0xFFF04438)
internal val Red400 = Color(0xFFF97066)
internal val Red300 = Color(0xFFFDA29B)
internal val Red200 = Color(0xFFFECDCA)
internal val Red100 = Color(0xFFFEE4E2)
internal val Red50 = Color(0xFFFEF3F2)
internal val Red25 = Color(0xFFFFFBFA)

internal val Gray900 = Color(0xFF101828)
internal val Gray800 = Color(0xFF1D2939)
internal val Gray700 = Color(0xFF344054)
internal val Gray600 = Color(0xFF475467)
internal val Gray500 = Color(0xFF667085)
internal val Gray400 = Color(0xFF98A2B3)
internal val Gray300 = Color(0xFFD0D5DD)
internal val Gray200 = Color(0xFFEAECF0)
internal val Gray100 = Color(0xFFF2F4F7)
internal val Gray50 = Color(0xFFF9FAFB)
internal val Gray25 = Color(0xFFFCFCFD)


@Immutable
data class UIKitColors(
    val default: Color = Color.Unspecified,

    val primaryColor: Color = Orange600,
    val secondaryColor: Color = BlueGray900,
    val light01: Color = Light01,

    val orange900: Color = Orange900,
    val orange800: Color = Orange800,
    val orange700: Color = Orange700,
    val orange600: Color = Orange600,
    val orange500: Color = Orange500,
    val orange400: Color = Orange400,
    val orange300: Color = Orange300,
    val orange200: Color = Orange200,
    val orange100: Color = Orange100,
    val orange50: Color = Orange50,
    val orange25: Color = Orange25,

    val rose900: Color = Rose900,
    val rose800: Color = Rose800,
    val rose700: Color = Rose700,
    val rose600: Color = Rose600,
    val rose500: Color = Rose500,
    val rose400: Color = Rose400,
    val rose300: Color = Rose300,
    val rose200: Color = Rose200,
    val rose100: Color = Rose100,
    val rose50: Color = Rose50,
    val rose25: Color = Rose25,

    val blue900: Color = Blue900,
    val blue800: Color = Blue800,
    val blue700: Color = Blue700,
    val blue600: Color = Blue600,
    val blue500: Color = Blue500,
    val blue400: Color = Blue400,
    val blue300: Color = Blue300,
    val blue200: Color = Blue200,
    val blue100: Color = Blue100,
    val blue50: Color = Blue50,
    val blue25: Color = Blue25,

    val blueGray900: Color = BlueGray900,
    val blueGray800: Color = BlueGray800,
    val blueGray700: Color = BlueGray700,
    val blueGray600: Color = BlueGray600,
    val blueGray500: Color = BlueGray500,
    val blueGray400: Color = BlueGray400,
    val blueGray300: Color = BlueGray300,
    val blueGray200: Color = BlueGray200,
    val blueGray100: Color = BlueGray100,
    val blueGray50: Color = BlueGray50,
    val blueGray25: Color = BlueGray25,

    val green900: Color = Green900,
    val green800: Color = Green800,
    val green700: Color = Green700,
    val green600: Color = Green600,
    val green500: Color = Green500,
    val green400: Color = Green400,
    val green300: Color = Green300,
    val green200: Color = Green200,
    val green100: Color = Green100,
    val green50: Color = Green50,
    val green25: Color = Green25,

    val yellow900: Color = Yellow900,
    val yellow800: Color = Yellow800,
    val yellow700: Color = Yellow700,
    val yellow600: Color = Yellow600,
    val yellow500: Color = Yellow500,
    val yellow400: Color = Yellow400,
    val yellow300: Color = Yellow300,
    val yellow200: Color = Yellow200,
    val yellow100: Color = Yellow100,
    val yellow50: Color = Yellow50,
    val yellow25: Color = Yellow25,

    val red900: Color = Red900,
    val red800: Color = Red800,
    val red700: Color = Red700,
    val red600: Color = Red600,
    val red500: Color = Red500,
    val red400: Color = Red400,
    val red300: Color = Red300,
    val red200: Color = Red200,
    val red100: Color = Red100,
    val red50: Color = Red50,
    val red25: Color = Red25,

    val gray900: Color = Gray900,
    val gray800: Color = Gray800,
    val gray700: Color = Gray700,
    val gray600: Color = Gray600,
    val gray500: Color = Gray500,
    val gray400: Color = Gray400,
    val gray300: Color = Gray300,
    val gray200: Color = Gray200,
    val gray100: Color = Gray100,
    val gray50: Color = Gray50,
    val gray25: Color = Gray25,
)

internal val DarkColorScheme = darkColorScheme(
    primary = Orange600,
    secondary = BlueGray900,
    background = Light01,
    surface = Light01
)
internal val LocalUIKitColors = staticCompositionLocalOf { UIKitColors() }