package com.mahmoud.guesscraft.data.remote.ws.models

import com.mahmoud.guesscraft.data.remote.ws.Room
import com.mahmoud.guesscraft.util.Constants.TYPE_PHASE_CHANGE

data class PhaseChange(
        var phase: Room.Phase?,
        var time: Long,
        val drawingPlayer: String? = null
) : BaseModel(TYPE_PHASE_CHANGE)
