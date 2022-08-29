package com.reyhan.belajarnavdrawer.ui.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.reyhan.belajarnavdrawer.R
import com.reyhan.belajarnavdrawer.databinding.FragmentGalleryBinding
import com.reyhan.belajarnavdrawer.databinding.FragmentHomeBinding
import com.reyhan.belajarnavdrawer.ui.home.HomeViewModel


class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)
        // Inflate the layout for this fragment
        _binding = FragmentGalleryBinding.inflate(layoutInflater, container, false)

        val textView: TextView = binding.tvGallery
        galleryViewModel.text.observe(viewLifecycleOwner){
            textView.text = it
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}