package com.diyorbek.repeatingtask1_040123.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.diyorbek.repeatingtask1_040123.fragments.FirstFragment
import com.diyorbek.repeatingtask1_040123.fragments.SecondFragment
import com.diyorbek.repeatingtask1_040123.fragments.ThirdFragment

class ViewPageAdapter(manager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(manager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> Fragment()
        }
    }
}