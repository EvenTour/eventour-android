package com.upc.projects.enzoftware.eventour.ui.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

import com.upc.projects.enzoftware.eventour.R

class ProfileFragment : Fragment() {

    lateinit var mAuth: FirebaseAuth

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_profile, container, false)

        mAuth = FirebaseAuth.getInstance()
        val user = mAuth.currentUser
        val nameView:TextView = view.findViewById(R.id.userProfileName)
        nameView.text = user!!.displayName.toString()

        return view
    }

}
