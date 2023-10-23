package com.afoxplus.uikit.designsystem.foundations

import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
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
abstract class UIKitColors {
    abstract val default: Color
    abstract val primaryColor: Color
    abstract val secondaryColor: Color
    abstract val light01: Color
    abstract val orange900: Color
    abstract val orange800: Color
    abstract val orange700: Color
    abstract val orange600: Color
    abstract val orange500: Color
    abstract val orange400: Color
    abstract val orange300: Color
    abstract val orange200: Color
    abstract val orange100: Color
    abstract val orange50: Color
    abstract val orange25: Color

    abstract val rose900: Color
    abstract val rose800: Color
    abstract val rose700: Color
    abstract val rose600: Color
    abstract val rose500: Color
    abstract val rose400: Color
    abstract val rose300: Color
    abstract val rose200: Color
    abstract val rose100: Color
    abstract val rose50: Color
    abstract val rose25: Color

    abstract val blue900: Color
    abstract val blue800: Color
    abstract val blue700: Color
    abstract val blue600: Color
    abstract val blue500: Color
    abstract val blue400: Color
    abstract val blue300: Color
    abstract val blue200: Color
    abstract val blue100: Color
    abstract val blue50: Color
    abstract val blue25: Color

    abstract val blueGray900: Color
    abstract val blueGray800: Color
    abstract val blueGray700: Color
    abstract val blueGray600: Color
    abstract val blueGray500: Color
    abstract val blueGray400: Color
    abstract val blueGray300: Color
    abstract val blueGray200: Color
    abstract val blueGray100: Color
    abstract val blueGray50: Color
    abstract val blueGray25: Color

    abstract val green900: Color
    abstract val green800: Color
    abstract val green700: Color
    abstract val green600: Color
    abstract val green500: Color
    abstract val green400: Color
    abstract val green300: Color
    abstract val green200: Color
    abstract val green100: Color
    abstract val green50: Color
    abstract val green25: Color

    abstract val yellow900: Color
    abstract val yellow800: Color
    abstract val yellow700: Color
    abstract val yellow600: Color
    abstract val yellow500: Color
    abstract val yellow400: Color
    abstract val yellow300: Color
    abstract val yellow200: Color
    abstract val yellow100: Color
    abstract val yellow50: Color
    abstract val yellow25: Color

    abstract val red900: Color
    abstract val red800: Color
    abstract val red700: Color
    abstract val red600: Color
    abstract val red500: Color
    abstract val red400: Color
    abstract val red300: Color
    abstract val red200: Color
    abstract val red100: Color
    abstract val red50: Color
    abstract val red25: Color

    abstract val gray900: Color
    abstract val gray800: Color
    abstract val gray700: Color
    abstract val gray600: Color
    abstract val gray500: Color
    abstract val gray400: Color
    abstract val gray300: Color
    abstract val gray200: Color
    abstract val gray100: Color
    abstract val gray50: Color
    abstract val gray25: Color
}

val UIKitColorTheme = object : UIKitColors() {
    override val default: Color = Color.Unspecified

    override val primaryColor: Color = Orange600
    override val secondaryColor: Color = BlueGray900
    override val light01: Color = Light01

    override val orange900: Color = Orange900
    override val orange800: Color = Orange800
    override val orange700: Color = Orange700
    override val orange600: Color = Orange600
    override val orange500: Color = Orange500
    override val orange400: Color = Orange400
    override val orange300: Color = Orange300
    override val orange200: Color = Orange200
    override val orange100: Color = Orange100
    override val orange50: Color = Orange50
    override val orange25: Color = Orange25

    override val rose900: Color = Rose900
    override val rose800: Color = Rose800
    override val rose700: Color = Rose700
    override val rose600: Color = Rose600
    override val rose500: Color = Rose500
    override val rose400: Color = Rose400
    override val rose300: Color = Rose300
    override val rose200: Color = Rose200
    override val rose100: Color = Rose100
    override val rose50: Color = Rose50
    override val rose25: Color = Rose25

    override val blue900: Color = Blue900
    override val blue800: Color = Blue800
    override val blue700: Color = Blue700
    override val blue600: Color = Blue600
    override val blue500: Color = Blue500
    override val blue400: Color = Blue400
    override val blue300: Color = Blue300
    override val blue200: Color = Blue200
    override val blue100: Color = Blue100
    override val blue50: Color = Blue50
    override val blue25: Color = Blue25

    override val blueGray900: Color = BlueGray900
    override val blueGray800: Color = BlueGray800
    override val blueGray700: Color = BlueGray700
    override val blueGray600: Color = BlueGray600
    override val blueGray500: Color = BlueGray500
    override val blueGray400: Color = BlueGray400
    override val blueGray300: Color = BlueGray300
    override val blueGray200: Color = BlueGray200
    override val blueGray100: Color = BlueGray100
    override val blueGray50: Color = BlueGray50
    override val blueGray25: Color = BlueGray25

    override val green900: Color = Green900
    override val green800: Color = Green800
    override val green700: Color = Green700
    override val green600: Color = Green600
    override val green500: Color = Green500
    override val green400: Color = Green400
    override val green300: Color = Green300
    override val green200: Color = Green200
    override val green100: Color = Green100
    override val green50: Color = Green50
    override val green25: Color = Green25

    override val yellow900: Color = Yellow900
    override val yellow800: Color = Yellow800
    override val yellow700: Color = Yellow700
    override val yellow600: Color = Yellow600
    override val yellow500: Color = Yellow500
    override val yellow400: Color = Yellow400
    override val yellow300: Color = Yellow300
    override val yellow200: Color = Yellow200
    override val yellow100: Color = Yellow100
    override val yellow50: Color = Yellow50
    override val yellow25: Color = Yellow25

    override val red900: Color = Red900
    override val red800: Color = Red800
    override val red700: Color = Red700
    override val red600: Color = Red600
    override val red500: Color = Red500
    override val red400: Color = Red400
    override val red300: Color = Red300
    override val red200: Color = Red200
    override val red100: Color = Red100
    override val red50: Color = Red50
    override val red25: Color = Red25

    override val gray900: Color = Gray900
    override val gray800: Color = Gray800
    override val gray700: Color = Gray700
    override val gray600: Color = Gray600
    override val gray500: Color = Gray500
    override val gray400: Color = Gray400
    override val gray300: Color = Gray300
    override val gray200: Color = Gray200
    override val gray100: Color = Gray100
    override val gray50: Color = Gray50
    override val gray25: Color = Gray25
}

internal val DarkColorScheme = darkColorScheme(
    primary = Orange600,
    secondary = BlueGray900,
    background = Light01,
    surface = Light01
)

val LocalUIKitColors: ProvidableCompositionLocal<UIKitColors> = staticCompositionLocalOf {
    error("No ColorTheme provided")
}