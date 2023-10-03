package com.example.fitnessgym.сustomView

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class CustomImageView(context: Context, attrs: AttributeSet) : AppCompatImageView(context, attrs) {

    private val radius = 8f

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        val clipPath = Path()
        val rect = RectF(0f, 0f, width.toFloat(), height.toFloat())

        val radii = floatArrayOf(radius, radius, 0f, 0f, 0f, 0f, radius, radius)

        clipPath.addRoundRect(rect, radii, Path.Direction.CW)
        canvas.clipPath(clipPath)
        super.onDraw(canvas)
    }
}