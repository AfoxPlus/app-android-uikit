package com.afoxplus.uikit.activities.extensions

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun Activity.addFragmentToActivity(
    fragmentManager: FragmentManager,
    fragment: Fragment,
    frameId: Int
) {
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(frameId, fragment, fragment.javaClass.toString())
    transaction.commitAllowingStateLoss()
}