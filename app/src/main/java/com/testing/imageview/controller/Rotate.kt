package com.testing.imageview.controller

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Matrix
import android.widget.ImageView
import com.testing.imageview.R

class Rotate(imageView: ImageView, bitmap: Bitmap, private val degrees : Float) : ImageViewController(imageView,bitmap) {

    private val matrix = Matrix().apply {
        this.postRotate(degrees,bitmap.width/2F , bitmap.height/2F)
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(bitmap,matrix,null)
    }

    override fun toString(): String {
        return "Rotate $degrees"
    }
}