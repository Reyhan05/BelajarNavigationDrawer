package com.reyhan.belajarnavdrawer.ui.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.reyhan.belajarnavdrawer.R
import com.reyhan.belajarnavdrawer.databinding.FragmentAndroidBinding
import com.reyhan.belajarnavdrawer.databinding.FragmentGalleryBinding
import com.reyhan.belajarnavdrawer.ui.gallery.GalleryViewModel


class AndroidFragment : Fragment() {

    private var _binding: FragmentAndroidBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val androidViewModel = ViewModelProvider(this).get(AndroidViewModel::class.java)
        // Inflate the layout for this fragment
        _binding = FragmentAndroidBinding.inflate(layoutInflater, container, false)
        val textView: TextView = binding.tvAndroid
        androidViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return binding.root
    }

}