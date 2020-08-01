package com.testing.imageview.controller

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Rect
import android.widget.ImageView

class RectMode(imageView: ImageView, bitmap: Bitmap, private val src : Rect?, private val dst : Rect?) : ImageViewController(imageView, bitmap) {

    private val nullRect : Rect by lazy {
        Rect(0,0,imageView.width,imageView.height)
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawBitmap(bitmap,src,dst?:nullRect,null)
    }

    override fun toString(): String {
        return """RectMode src :: ${src.toString()})
            |       dst :: ${dst.toString()}
        """.trimMargin()
    }
}