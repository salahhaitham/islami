package com.example.islami_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islami_app.databinding.FragmentHadeethFrgBinding


class hadeeth_frg : Fragment() {

lateinit var viewbinding:FragmentHadeethFrgBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
viewbinding=FragmentHadeethFrgBinding.inflate(layoutInflater,container,false)

        return viewbinding.root
    }

            }

