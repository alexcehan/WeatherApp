package com.example.weatherapp.data.pojos.apiresponse

data class WeatherApiResult(
    val current: Current,
    val forecast: Forecast,
    val location: Location
)