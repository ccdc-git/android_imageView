package com.testing.imageview.controller

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.widget.ImageView

class Rotate(imageView: ImageView, bitmap: Bitmap, private val degrees : Float) : ImageViewController(imageView,bitmap) {

    private val matrix = Matrix().apply {
        this.postRotate(degrees,bitmap.width/2F , bitmap.height/2F)
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(bitmap,matrix,null)
    }

    override fun toString(): String {
        return "Rotate $degrees"
    }
}