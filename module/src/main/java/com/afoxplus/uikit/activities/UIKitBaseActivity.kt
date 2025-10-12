package com.afoxplus.uikit.activities

import android.graphics.Color
import android.os.Bundle
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.uikit.views.OnObserverViewModel
import com.afoxplus.uikit.views.OnSetUpView


abstract class UIKitBaseActivity : AppCompatActivity(), OnSetUpView, OnObserverViewModel {
    abstract fun setMainView()

    override fun observerViewModel() {
        //Do nothing
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(
                lightScrim = Color.TRANSPARENT,
                darkScrim = Color.TRANSPARENT
            ),
            navigationBarStyle = SystemBarStyle.auto(
                lightScrim = Color.TRANSPARENT,
                darkScrim = Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        setMainView()
        setUpView()
        observerViewModel()
    }
}