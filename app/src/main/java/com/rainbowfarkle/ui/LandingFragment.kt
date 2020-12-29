package com.rainbowfarkle.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rainbowfarkle.GameSetupEnum
import com.rainbowfarkle.R

class LandingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.landing_fragment, container, false).apply {
            findViewById<Button>(R.id.play_game_button).setOnClickListener { navigate() }
        }
    }

    private fun navigate() {
        findNavController().navigate(
            LandingFragmentDirections.landingFragmentToGameSetupFragment(GameSetupEnum.NUMBER_OF_PLAYERS)
        )
    }
}
