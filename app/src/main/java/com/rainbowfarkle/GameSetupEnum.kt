package com.rainbowfarkle

enum class GameSetupEnum(
    val title: Int,
    val default: Int,
    val step: Int,
    val min: Int,
    val max: Int
) {
    NUMBER_OF_PLAYERS(R.string.number_of_players, 2, 1, 1, 10),
    NUMBER_OF_POINTS(R.string.number_of_points, 5000, 1000, 3000, 15000)
}
