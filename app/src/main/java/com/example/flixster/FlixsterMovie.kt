package com.example.flixster

import com.google.gson.annotations.SerializedName


class FlixsterMovie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("poster_path")
    var movieImageUrl: String? = null

}


