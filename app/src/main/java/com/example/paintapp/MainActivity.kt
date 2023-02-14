package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList
import kotlin.io.path.Path

class MainActivity : AppCompatActivity() {
companion object{
    var path = Path()
    var paintbrush = Paint()

}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val  blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)


        redBtn.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.RED
            currentColor(paintbrush.color)

        }
        blueBtn.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()

            paintbrush.color = Color.BLUE
            currentColor(paintbrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()

            paintbrush.color = Color.BLACK
            currentColor(paintbrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()

        }


    }
    private fun currentColor(color:Int){
        currentBrush = color
        path = Path()
    }
}