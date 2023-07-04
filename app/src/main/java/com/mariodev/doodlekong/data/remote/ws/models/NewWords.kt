package com.mariodev.doodlekong.data.remote.ws.models

import com.mariodev.doodlekong.util.Constants.TYPE_NEW_WORDS


data class NewWords(
    val newWords: List<String>
) : BaseModel(TYPE_NEW_WORDS)
