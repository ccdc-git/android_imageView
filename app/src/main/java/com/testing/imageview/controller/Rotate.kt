package com.testing.imageview.controller

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.widget.ImageView

class Rotate(imageView: ImageView, private val bitmap: Bitmap, private val degrees : Float) : ImageViewController(imageView) {

    private val matrix = Matrix()

    override fun onDraw(canvas: Canvas) {
        matrix.postRotate(degrees)
        canvas.drawBitmap(bitmap,matrix,null)
    }

    override fun toString(): String {
        return "Rotate $degrees"
    }
}