package com.testing.imageview

import android.graphics.BitmapFactory
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.testing.imageview.controller.ImageViewController
import com.testing.imageview.controller.RectMode
import com.testing.imageview.controller.Rotate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val modeList = mutableListOf<ImageViewController>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.mipmap.peng)

        modeList.add(Rotate(imageView,bitmap,10F))
        modeList.add(Rotate(imageView,bitmap,180F))
        modeList.add(RectMode(imageView,bitmap, Rect(0,0,100,100),Rect(0,0,700,700)))
        modeList.add(RectMode(imageView,bitmap, null,null))

        var iterator = modeList.iterator()

        button.setOnClickListener {
            if(!iterator.hasNext()){
                iterator = modeList.iterator()
            }
            if(iterator.hasNext()){
                val nextMode = iterator.next()
                imageView.controller = nextMode
                textView.text = nextMode.toString()
            }
            imageView.invalidate()
        }

    }
}