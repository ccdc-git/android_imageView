package com.testing.imageview.controller

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.widget.ImageView

abstract class ImageViewController(open val imageView : ImageView, open val bitmap: Bitmap) {


    protected abstract fun onDraw(canvas: Canvas)
    abstract override fun toString(): String

    fun draw(canvas: Canvas){
        onDraw(canvas)
    }

    fun setImage(){
        val preDrawable = imageView.drawable
        if(preDrawable is BitmapDrawable) {
            preDrawable.bitmap.recycle()
        }
        System.gc()
        val bitmap = Bitmap.createBitmap(imageView.width,imageView.height,Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        this.onDraw(canvas)
        imageView.setImageBitmap(bitmap)
    }

}