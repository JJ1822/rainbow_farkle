package com.rainbowfarkle.viewmodels

import androidx.lifecycle.ViewModel
import com.rainbowfarkle.GameSetupEnum

class GameBoardViewModel : ViewModel() {
    val gameSetupMap: MutableMap<GameSetupEnum, Int> = mutableMapOf()
}
