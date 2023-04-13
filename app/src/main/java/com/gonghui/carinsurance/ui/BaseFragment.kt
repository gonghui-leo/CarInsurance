package com.gonghui.carinsurance.ui

import android.content.Context
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    private val onBackPressedCallback = object :
        OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            onBackPressed()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        requireActivity().onBackPressedDispatcher.addCallback(this, onBackPressedCallback)
    }

    override fun onStart() {
        super.onStart()

        onBackPressedCallback.isEnabled = true
    }

    protected open fun onBackPressed() {
        onBackPressedCallback.isEnabled = false
        requireActivity().onBackPressedDispatcher.onBackPressed()
    }
}