package com.rainbowfarkle.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.rainbowfarkle.databinding.GameSetupFragmentBinding
import com.rainbowfarkle.datamodels.GameSetupDataModel
import com.rainbowfarkle.viewmodels.GameSetupViewModel

class GameSetupFragment : Fragment() {

    private val args: GameSetupFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = GameSetupFragmentBinding.inflate(inflater, container, false)
        binding.viewModel = GameSetupViewModel(GameSetupDataModel.from(args.gameSetupEnum), this::navigate)
        return binding.root
    }

    private fun navigate(action: NavDirections) {
        findNavController().navigate(action)
    }
}
