package com.bangunsubuh.calmspace.model

import androidx.annotation.DrawableRes
import com.bangunsubuh.calmspace.R

sealed class OnboardingModel(
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
) {

    data object FirstPage : OnboardingModel(
        image = R.drawable.mental_health_v1,
        title = "Selamat Datang di CalmSpace",
        description = "Temukan langkah-langkah praktis dan dukungan yang Anda butuhkan untuk menjaga kesehatan mental setiap hari. Mulai perjalanan Anda menuju kehidupan yang lebih seimbang, tenang, dan bahagia."
    )

    data object SecondPage : OnboardingModel(
        image = R.drawable.mental_health_v2,
        title = "Konsultasi mudah dan cepat ",
        description = "Dapatkan dukungan dan solusi dari para ahli melalui konsultasi mudah, kapan saja dan di mana saja. Bersama kami, setiap langkah menuju kesehatan mental yang lebih baik jadi lebih ringan"
    )

    data object ThirdPage : OnboardingModel(
        image = R.drawable.mental_health_v3,
        title = "Berbagi cerita, saling mendukung",
        description = "Temukan kekuatan dalam komunitas melalui forum diskusi. Di sini, Anda tidak pernah sendiri—bersama kita bisa tumbuh dan sembuh"
    )

}