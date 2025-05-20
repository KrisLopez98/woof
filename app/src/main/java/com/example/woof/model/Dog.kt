package com.example.woof.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog(
    @DrawableRes val imageId: Int,
    @StringRes val breed: Int,
    @StringRes val species: Int,
    @StringRes val description: Int,
    )
