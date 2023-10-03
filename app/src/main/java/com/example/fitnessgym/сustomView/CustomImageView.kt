package com.example.fitnessgym.сustomView

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class CustomImageView(context: Context, attrs: AttributeSet) : AppCompatImageView(context, attrs) {

    private val path = Path()
    private val radius = 8f // Установите желаемый радиус здесь

    override fun onDraw(canvas: Canvas) {
        val clipPath = Path()
        val rect = android.graphics.RectF(0f, 0f, width.toFloat(), height.toFloat())
        clipPath.addRoundRect(rect, floatArrayOf(radius, radius, 0f, 0f, 0f, 0f, radius, radius), Path.Direction.CW)
        canvas.clipPath(clipPath)
        super.onDraw(canvas)
    }
}