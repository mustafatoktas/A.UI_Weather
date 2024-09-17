package com.mustafatoktas.weatherappui.ui.main.viewmodel

import com.mustafatoktas.weatherappui.common.CihazDurumu

data class MainState(
    val cihazDurumu: CihazDurumu = CihazDurumu.Normal,
)
