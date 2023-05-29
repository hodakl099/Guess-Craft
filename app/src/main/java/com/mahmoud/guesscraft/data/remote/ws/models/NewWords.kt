package com.mahmoud.guesscraft.data.remote.ws.models

import com.mahmoud.guesscraft.util.Constants.TYPE_NEW_WORDS

data class NewWords(
    val newWords: List<String>
): BaseModel(TYPE_NEW_WORDS)
