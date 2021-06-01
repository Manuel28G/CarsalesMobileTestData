package com.manuel28g.carsalesmobiletestdata.model

import com.google.gson.annotations.SerializedName

data class CovidInfo (
        @SerializedName("data")
        var data: CovidInfoStatus
        )