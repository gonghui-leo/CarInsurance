package com.gonghui.carinsurance.ui.main

import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.gonghui.carinsurance.AnalyticsAdapter
import com.gonghui.carinsurance.databinding.FragmentMainBinding
import com.gonghui.carinsurance.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : BaseFragment() {
    @Inject
    lateinit var analytics: AnalyticsAdapter

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentMainBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@MainFragment
            viewmodel = viewModel
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        analytics.getService().analyticsMethods()
        analytics.run {
            analytics
        }
    }

    private var lastTime = 0L
    override fun onBackPressed() {
        Log.i("qwe", "HomeFragment onBackPressed: ")
        if (System.currentTimeMillis() - lastTime > 2000L) {
            Toast.makeText(requireContext().applicationContext, "再按一次返回键退出", Toast.LENGTH_SHORT)
                .show()
            lastTime = System.currentTimeMillis()
            return
        }
        super.onBackPressed()
    }

    companion object{
        @JvmOverloads
        fun asdf(a :String= "s",b:String){}
    }
}