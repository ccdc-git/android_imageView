package com.testing.imageview.controller

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.widget.ImageView

abstract class ImageViewController(private val imageView : ImageView) {

    protected abstract fun onDraw(canvas: Canvas)
    abstract override fun toString(): String

    fun setImage(){
        val bitmap = Bitmap.createBitmap(imageView.width,imageView.height,Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        this.onDraw(canvas)

        imageView.setImageBitmap(bitmap)
    }

}