package com.example.fitnessgym.data

import com.example.domoin.entities.Sports
import com.example.domoin.entities.SportsInfo
import com.example.fitnessgym.R

object Constants {

    fun getTopData() : MutableList<Sports>{
        var sportsList = mutableListOf<Sports>()

        val sp1 = Sports(0, SportsInfo(R.string.name_top1, R.string.kcal1, R.string.min1,
        "https://www.vixyvideo.com/wp-content/uploads/2018/01/header-basic-fit-case.jpg", R.string.energy1, R.string.level1,
            5, R.string.starText5,
            R.string.description_top1))
        sportsList.add(sp1)

        val sp2 = Sports(1, SportsInfo(R.string.name_top2, R.string.kcal2, R.string.min2,
            "https://ketokotleta.ru/wp-content/uploads/3/0/2/302549fbfa1a196c8b289d665379ada2.jpeg",
            R.string.energy2, R.string.level2,
            4, R.string.starText4,
            R.string.description_top2))
        sportsList.add(sp2)

        val sp3 = Sports(2, SportsInfo(R.string.name_top3, R.string.kcal3, R.string.min3,
            "https://recordregion.ru/wp-content/uploads/7/b/e/7be50e4552c03a76c90671fb0788265b.jpeg",
            R.string.energy2, R.string.level2,
            4, R.string.starText4,
            R.string.description_top3))
        sportsList.add(sp3)

        return sportsList
    }

    fun getPopularData() : MutableList<Sports>{
        var sportsList = mutableListOf<Sports>()

        val sp4 = Sports(3, SportsInfo(R.string.name_popular1, R.string.kcal4, R.string.min4,
            "https://mosturnik.ru/wp-content/uploads/e/f/1/ef15733deeeeb4671ea8d8231e12b5bc.jpeg", R.string.energy1,
            R.string.level1, 5, R.string.starText5,
            R.string.description_popular1))
        sportsList.add(sp4)

        val sp5 = Sports(4, SportsInfo(R.string.name_popular2, R.string.kcal5, R.string.min5,
            "https://bye-bye-calories.ru/wp-content/uploads/1/a/e/1aec550c71de8793080246a189aade1a.jpeg", R.string.energy1,
            R.string.level1, 5, R.string.starText5,
            R.string.description_popular2))
        sportsList.add(sp5)

        val sp6 = Sports(5, SportsInfo(R.string.name_popular3, R.string.kcal5, R.string.min5,
            "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666140200_12-mykaleidoscope-ru-p-trenirovka-pilates-dlya-nachinayushchikh-o-13.jpg",
            R.string.energy1,
            R.string.level1, 5, R.string.starText5,
            R.string.description_popular3))
        sportsList.add(sp6)

        return sportsList
    }

    fun getClassesData() : MutableList<Sports>{
        var sportsList = mutableListOf<Sports>()
        val sp1 = Sports(0, SportsInfo(R.string.name_top1, R.string.kcal1, R.string.min1,
            "https://www.vixyvideo.com/wp-content/uploads/2018/01/header-basic-fit-case.jpg", R.string.energy1, R.string.level1,
            5, R.string.starText5,
            R.string.description_top1))
        sportsList.add(sp1)

        val sp2 = Sports(1, SportsInfo(R.string.name_top2, R.string.kcal2, R.string.min2,
            "https://ketokotleta.ru/wp-content/uploads/3/0/2/302549fbfa1a196c8b289d665379ada2.jpeg",
            R.string.energy2, R.string.level2,
            4, R.string.starText4,
            R.string.description_top2))
        sportsList.add(sp2)

        val sp3 = Sports(2, SportsInfo(R.string.name_top3, R.string.kcal3, R.string.min3,
            "https://recordregion.ru/wp-content/uploads/7/b/e/7be50e4552c03a76c90671fb0788265b.jpeg",
            R.string.energy2, R.string.level2,
            4, R.string.starText4,
            R.string.description_top3))
        sportsList.add(sp3)

        val sp4 = Sports(3, SportsInfo(R.string.name_popular1, R.string.kcal4, R.string.min4,
            "https://mosturnik.ru/wp-content/uploads/e/f/1/ef15733deeeeb4671ea8d8231e12b5bc.jpeg", R.string.energy1,
            R.string.level1, 5, R.string.starText5,
            R.string.description_popular1))
        sportsList.add(sp4)

        val sp5 = Sports(4, SportsInfo(R.string.name_popular2, R.string.kcal5, R.string.min5,
            "https://bye-bye-calories.ru/wp-content/uploads/1/a/e/1aec550c71de8793080246a189aade1a.jpeg", R.string.energy1,
            R.string.level1, 5, R.string.starText5,
            R.string.description_popular2))
        sportsList.add(sp5)

        val sp6 = Sports(5, SportsInfo(R.string.name_popular3, R.string.kcal5, R.string.min5,
            "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666140200_12-mykaleidoscope-ru-p-trenirovka-pilates-dlya-nachinayushchikh-o-13.jpg",
            R.string.energy1,
            R.string.level1, 5, R.string.starText5,
            R.string.description_popular3))
        sportsList.add(sp6)

        val sp7 = Sports(6, SportsInfo(R.string.name_classes1, R.string.kcal5, R.string.min5,
            "https://sportishka.com/uploads/posts/2022-11/1667441654_32-sportishka-com-p-bokserskaya-trenirovka-krasivo-35.png",
            R.string.energy1,
            R.string.level1, 5, R.string.starText5,
            R.string.desc_classes1))
        sportsList.add(sp7)

        val sp8 = Sports(7, SportsInfo(R.string.name_classes2, R.string.kcal6, R.string.min6,
            "https://protennistv.ru/wp-content/uploads/5/c/9/5c9f5bbb96c29825b1b20036ea0ce276.jpeg",
            R.string.energy2,
            R.string.level1, 5, R.string.starText5,
            R.string.desc_classes2))
        sportsList.add(sp8)

        return sportsList
    }
}