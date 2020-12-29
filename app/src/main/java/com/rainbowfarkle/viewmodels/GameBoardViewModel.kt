package com.rainbowfarkle.viewmodels

import androidx.lifecycle.ViewModel
import com.rainbowfarkle.GameSetupEnum
import com.rainbowfarkle.datamodels.NameDataModel

class GameBoardViewModel : ViewModel() {
    val gameSetupMap: MutableMap<GameSetupEnum, Int> = mutableMapOf()
    var namesList: List<NameDataModel> = listOf()

    fun getNumberOfPlayers() = gameSetupMap[GameSetupEnum.NUMBER_OF_PLAYERS] ?: GameSetupEnum.NUMBER_OF_PLAYERS.default
}
