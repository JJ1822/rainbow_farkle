package com.rainbowfarkle.datamodels

import com.rainbowfarkle.GameSetupEnum
import com.rainbowfarkle.R

data class GameSetupDataModel(
    val title: Int,
    var number: Int,
    val step: Int,
    val min: Int,
    val max: Int,
    val gameSetupEnum: GameSetupEnum
) {
    companion object {
        fun from(enum: GameSetupEnum, number: Int?) = when (enum) {
            GameSetupEnum.NUMBER_Of_POINTS -> GameSetupDataModel(
                R.string.number_of_points,
                number ?: 5000,
                1000,
                3000,
                15000,
                enum
            )
            GameSetupEnum.NUMBER_OF_PLAYERS -> GameSetupDataModel(
                R.string.number_of_players,
                number ?: 2,
                1,
                1,
                10,
                enum
            )
        }
    }
}
