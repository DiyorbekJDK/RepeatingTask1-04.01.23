package com.diyorbek.repeatingtask1_040123.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.diyorbek.repeatingtask1_040123.MainActivity
import com.diyorbek.repeatingtask1_040123.NewActivity
import com.diyorbek.repeatingtask1_040123.R
import com.google.android.material.button.MaterialButton

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn: MaterialButton = view.findViewById(R.id.btn)
        val activity = (activity as MainActivity)
        btn.setOnClickListener {
            val intent = Intent(activity, NewActivity::class.java)
            activity.startActivity(intent)
            activity.finish()
        }
    }
}