package com.example.fitnessgym.utilits

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.res.Resources
import android.graphics.Outline
import android.os.Build
import android.view.*
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.domoin.entities.Sports
import com.example.fitnessgym.R

fun replaceFragmentMain(fagmnt: Fragment, aStack: Boolean = true) {
    if (aStack) {
        APP_ACTIVITY.supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(
                com.example.fitnessgym.R.id.main_layout,
                fagmnt
            ).commit()
    } else {
        APP_ACTIVITY.supportFragmentManager.beginTransaction()
            .replace(
                com.example.fitnessgym.R.id.main_layout,
                fagmnt
            ).commit()
    }
}

@SuppressLint("ObsoleteSdkInt")
@TargetApi(Build.VERSION_CODES.LOLLIPOP)
fun setStatusBarGradiantMain(activity: Activity) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        val window: Window = activity.window
        val background = ContextCompat.getDrawable(activity, com.example.fitnessgym.R.color.background)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        window.statusBarColor = ContextCompat.getColor(activity,android.R.color.transparent)
        window.setBackgroundDrawable(background)
    }
}

@SuppressLint("SetTextI18n", "ObsoleteSdkInt")
fun getDialogDetails(
    context: Context,
    sports: Sports,
    resources: Resources
){
    val dialog = Dialog(context, android.R.style.Theme_DeviceDefault_Light_NoActionBar_Fullscreen)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.setContentView(com.example.fitnessgym.R.layout.full_screen_details)
    dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
    dialog.window?.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    dialog.window?.statusBarColor = ContextCompat.getColor(context, android.R.color.transparent)

    val icon : ImageView = dialog.findViewById(com.example.fitnessgym.R.id.ic_details)
    val name : TextView = dialog.findViewById(com.example.fitnessgym.R.id.tv_name_details)
    val star : TextView = dialog.findViewById(com.example.fitnessgym.R.id.tv_star_details)
    val ratingBar : RatingBar = dialog.findViewById(com.example.fitnessgym.R.id.ratingBar_details)
    val kcal : TextView = dialog.findViewById(com.example.fitnessgym.R.id.tv_kcal_details)
    val min : TextView = dialog.findViewById(com.example.fitnessgym.R.id.tv_min_details)
    val desc : TextView = dialog.findViewById(com.example.fitnessgym.R.id.tv_desctiption_details)
    val btArrow : ImageView = dialog.findViewById(com.example.fitnessgym.R.id.ic_arrow)

    icon.post {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val radius = resources.getDimensionPixelSize(R.dimen.image_corner_radius).toFloat()
            val outlineProvider = object : ViewOutlineProvider() {
                override fun getOutline(view: View?, outline: Outline?) {
                    outline?.setRoundRect(0, 0, view!!.width, view.height, radius)
                }
            }
            icon.outlineProvider = outlineProvider
            icon.clipToOutline = true
        }
    }

    name.setText(sports.info.name)
    star.setText(sports.info.starText)
    ratingBar.rating = sports.info.star.toFloat()
    ratingBar.numStars = 5
    kcal.setText(sports.info.kcal)
    min.setText(sports.info.min)
    desc.setText(sports.info.description)

    Glide.with(context).load(sports.info.icon).into(icon)

    btArrow.setOnClickListener { dialog.cancel() }

    dialog.show()
}