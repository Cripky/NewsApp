package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)


val pages = listOf(
    Page(
        title = "TOP 20 PLAYERS OF 2023: ZYWOO (1)",
        description = "ZywOo was unmatched in the race to become HLTV’s Player of the Year, leading the stat boards in over a dozen categories.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "TOP 20 PLAYERS OF 2023: NIKO (2)",
        description = "NiKo's exceptional numbers at the biggest events and against the best teams see him tie his best placement on our Top 20 Players of the Year ranking.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "TOP 20 PLAYERS OF 2023: ROPZ (3)",
        description = "Impressive stats in the biggest tournaments and against elite-level opposition earn the Estonian the third place in HLTV’s Top 20 Players of 2023 ranking.",
        image = R.drawable.onboarding3
    )
)