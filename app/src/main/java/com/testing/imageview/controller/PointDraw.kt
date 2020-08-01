package com.testing.imageview.controller

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Point
import android.widget.ImageView

class PointDraw(imageView: ImageView, bitmap: Bitmap, private val point : Point) : ImageViewController(imageView, bitmap) {
    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(bitmap, point.x.toFloat(), point.y.toFloat(), null)
    }

    override fun toString(): String {
        return "Point = $point"
    }
}