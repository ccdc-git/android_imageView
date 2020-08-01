package com.testing.imageview.controller

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.ImageView

class PengImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatImageView(context, attrs, defStyleAttr) {
    var controller : ImageViewController? = null

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if(canvas != null)
            controller?.draw(canvas)
    }

}