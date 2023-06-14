package com.mariodev.doodlekong.ui.setup.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mariodev.doodlekong.R
import com.mariodev.doodlekong.databinding.FragmentCreateRoomBinding
import com.mariodev.doodlekong.databinding.FragmentSelectRoomBinding
import com.mariodev.doodlekong.databinding.FragmentUsernameBinding

class CreateRoomFragment : Fragment(R.layout.fragment_create_room) {

    private var _binding: FragmentCreateRoomBinding? = null
    private val binding: FragmentCreateRoomBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding =FragmentCreateRoomBinding.bind(view)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}