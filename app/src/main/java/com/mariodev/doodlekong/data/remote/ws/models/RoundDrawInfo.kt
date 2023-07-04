package com.mariodev.doodlekong.data.remote.ws.models

import com.mariodev.doodlekong.util.Constants.TYPE_CUR_ROUND_DRAW_INFO


data class RoundDrawInfo(
    val data: List<String>
) : BaseModel(TYPE_CUR_ROUND_DRAW_INFO)
