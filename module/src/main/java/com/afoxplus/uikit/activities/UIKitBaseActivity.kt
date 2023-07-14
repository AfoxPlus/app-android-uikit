package com.afoxplus.uikit.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.views.OnObserverViewModel
import com.afoxplus.uikit.views.OnSetUpView

abstract class UIKitBaseActivity : AppCompatActivity(), OnSetUpView, OnObserverViewModel {
    abstract fun setMainView()

    override fun observerViewModel() {
        //Do nothing
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setMainView()
        setUpView()
        observerViewModel()
    }
}