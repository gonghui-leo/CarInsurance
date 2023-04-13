package com.gonghui.carinsurance.ui.me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.gonghui.carinsurance.R

class MeFragment : Fragment() {

    companion object {
        fun newInstance() = MeFragment()
    }

    private val viewModel by viewModels<MeViewModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_me, container, false)
    }

}