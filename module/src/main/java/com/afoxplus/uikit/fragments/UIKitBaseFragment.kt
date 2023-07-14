package com.afoxplus.uikit.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.afoxplus.uikit.views.OnObserverViewModel
import com.afoxplus.uikit.views.OnSetUpView

abstract class UIKitBaseFragment : Fragment(), OnSetUpView, OnObserverViewModel {
    abstract fun getMainView(inflater: LayoutInflater, container: ViewGroup?): View
    override fun setUpView() {
        //Do nothing
    }

    override fun observerViewModel() {
        //Do nothing
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = getMainView(inflater, container)
        setUpView()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observerViewModel()
    }
}