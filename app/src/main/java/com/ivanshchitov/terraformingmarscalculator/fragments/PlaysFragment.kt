package com.ivanshchitov.terraformingmarscalculator.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ivanshchitov.terraformingmarscalculator.R

/**
 * Fragment with a list of the Terraforming Mars plays info.
 */
class PlaysFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plays, container, false)
    }
}