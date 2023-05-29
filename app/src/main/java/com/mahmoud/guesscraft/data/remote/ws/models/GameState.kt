package com.mahmoud.guesscraft.data.remote.ws.models

import com.mahmoud.guesscraft.util.Constants.TYPE_GAME_STATE

data class GameState(
    val drawingPlayer: String,
    val word: String
): BaseModel(TYPE_GAME_STATE)
