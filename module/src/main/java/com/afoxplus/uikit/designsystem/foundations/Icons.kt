package com.afoxplus.uikit.designsystem.foundations


import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import com.afoxplus.uikit.R

val LocalUIKitIconTheme: ProvidableCompositionLocal<IconTheme> = staticCompositionLocalOf {
    error("No IconTheme provided")
}

@Immutable
abstract class IconTheme {
    abstract val icon_whatsapp_outline: Icon
    abstract val icon_pin_location_outline: Icon
    abstract val icon_calendar_small_outline: Icon
    abstract val icon_minus: Icon
    abstract val icon_plus: Icon
    abstract val icon_printer_outline: Icon
    abstract val icon_scan_outline: Icon
    abstract val icon_trash_outline: Icon
    abstract val icon_location_outline: Icon
    abstract val icon_verified_solid: Icon
    abstract val icon_star_disable: Icon
    abstract val icon_star_enable: Icon
    abstract val icon_search: Icon
    abstract val icon_clean: Icon
    abstract val icon_back: Icon
    abstract val icon_about_info_outline: Icon
    abstract val icon_basket_outline: Icon
    abstract val icon_building_home_outline: Icon
    abstract val icon_camera_image_outline: Icon
    abstract val icon_category_outline: Icon
    abstract val icon_current_location_outline: Icon
    abstract val icon_dish_outline: Icon
    abstract val icon_list_detail_filled: Icon
    abstract val icon_location_filled: Icon
    abstract val icon_three_dots_filled: Icon
    abstract val icon_upload_cloud_file_outline: Icon
    abstract val icon_current_location: Icon
    abstract val icon_location_filled_red: Icon

    @JvmInline
    value class Icon(@DrawableRes val drawableRes: Int)
}

val UIKitIconTheme: IconTheme = object : IconTheme() {
    override val icon_whatsapp_outline: Icon = Icon(drawableRes = R.drawable.icon_whatsapp_outline)
    override val icon_pin_location_outline: Icon = Icon(drawableRes = R.drawable.icon_pin_location_outline)
    override val icon_calendar_small_outline: Icon = Icon(drawableRes = R.drawable.icon_calendar_small_outline)
    override val icon_minus: Icon = Icon(drawableRes = R.drawable.icon_minus)
    override val icon_plus: Icon = Icon(drawableRes = R.drawable.icon_plus)
    override val icon_printer_outline: Icon = Icon(drawableRes = R.drawable.icon_printer_outline)
    override val icon_scan_outline: Icon = Icon(drawableRes = R.drawable.icon_scan_outline)
    override val icon_trash_outline: Icon = Icon(drawableRes = R.drawable.icon_trash_outline)
    override val icon_location_outline: Icon = Icon(drawableRes = R.drawable.icon_location_outline)
    override val icon_verified_solid: Icon = Icon(drawableRes = R.drawable.icon_verified_solid)
    override val icon_star_disable: Icon = Icon(drawableRes = R.drawable.icon_star_disable)
    override val icon_star_enable: Icon = Icon(drawableRes = R.drawable.icon_star_enable)
    override val icon_search: Icon = Icon(drawableRes = R.drawable.icon_search)
    override val icon_clean: Icon = Icon(drawableRes = R.drawable.icon_clean)
    override val icon_back: Icon = Icon(drawableRes = R.drawable.icon_back)
    override val icon_current_location: Icon =
        Icon(drawableRes = R.drawable.icon_current_location_outline)
    override val icon_location_filled: Icon = Icon(drawableRes = R.drawable.icon_location_filled)
    override val icon_location_filled_red: Icon =
        Icon(drawableRes = R.drawable.icon_location_filled_red)
    override val icon_about_info_outline: Icon = Icon(drawableRes = R.drawable.icon_about_info_outline)
    override val icon_basket_outline: Icon = Icon(drawableRes = R.drawable.icon_basket_outline)
    override val icon_building_home_outline: Icon = Icon(drawableRes = R.drawable.icon_building_home_outline)
    override val icon_camera_image_outline: Icon = Icon(drawableRes = R.drawable.icon_camera_image_outline)
    override val icon_category_outline: Icon = Icon(drawableRes = R.drawable.icon_category_outline)
    override val icon_current_location_outline: Icon = Icon(drawableRes = R.drawable.icon_current_location_outline)
    override val icon_dish_outline: Icon = Icon(drawableRes = R.drawable.icon_dish_outline)
    override val icon_list_detail_filled: Icon = Icon(drawableRes = R.drawable.icon_list_detail_filled)
    override val icon_three_dots_filled: Icon = Icon(drawableRes = R.drawable.icon_three_dots_filled)
    override val icon_upload_cloud_file_outline: Icon = Icon(drawableRes = R.drawable.icon_upload_cloud_file_outline)
}