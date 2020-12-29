package com.rainbowfarkle.datamodels

import com.rainbowfarkle.GameSetupEnum

data class GameSetupDataModel(
    val title: Int,
    var number: Int,
    val step: Int,
    val min: Int,
    val max: Int,
    val gameSetupEnum: GameSetupEnum
) {
    companion object {
        fun from(enum: GameSetupEnum, number: Int?) = GameSetupDataModel(
            enum.title,
            number ?: enum.default,
            enum.step,
            enum.min,
            enum.max,
            enum
        )
    }
}
