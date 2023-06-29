package com.pyroblinchik.calories.navigation

import androidx.navigation.NavController
import com.pyroblinchik.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}