package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

//将所有的数据类型定义在内部，避免出现和其他接口的数据类型有同名的冲突
data class RealtimeResponse(val statu: String, val result: Result){
    data class Result(val realtime: RealTime)

    data class RealTime(val skycon: String, val temperature: Float, @SerializedName("air_quality")val airQuality: AirQuality)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}

