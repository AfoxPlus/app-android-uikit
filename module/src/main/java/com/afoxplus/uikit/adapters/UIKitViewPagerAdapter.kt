package com.afoxplus.uikit.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.afoxplus.uikit.fragments.UIKitBaseFragment

class UIKitViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val listFragments: List<UIKitBaseFragment>
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = listFragments.size

    override fun createFragment(position: Int): Fragment = listFragments[position]

    fun getFragment(position: Int): UIKitBaseFragment = listFragments[position]
    fun deleteFragment(position: Int) = listFragments.drop(position)
}