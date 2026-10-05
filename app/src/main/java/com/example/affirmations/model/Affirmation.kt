package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    //represents an ID for the affirmation text stored in a string resource
    @StringRes val stringResourceId: Int,

    //represents an ID for the affirmation image stored in a drawable resource
    @DrawableRes val imageResourceId: Int
)
