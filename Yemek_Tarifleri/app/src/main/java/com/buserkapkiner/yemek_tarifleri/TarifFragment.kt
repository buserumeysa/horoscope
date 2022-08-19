package com.buserkapkiner.yemek_tarifleri

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.buserkapkiner.yemek_tarifleri.databinding.FragmentTarifBinding
import java.util.zip.Inflater


class TarifFragment : Fragment() {
    lateinit var binding: FragmentTarifBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentTarifBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.imageView2.setOnClickListener{
            Log.i(TAG, "onViewCreated: ")
        }

    }

}