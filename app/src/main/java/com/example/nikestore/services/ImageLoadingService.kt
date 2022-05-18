package com.example.nikestore.services

import android.view.View

interface ImageLoadingService {
    fun load(imageView: View?, imageUrl: String)
}