package com.mustafatoktas.weatherappui.ui.main

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.mustafatoktas.weatherappui.R
import com.mustafatoktas.weatherappui.common.CihazDurumu
import com.mustafatoktas.weatherappui.ui.main.components.MainContent
import com.mustafatoktas.weatherappui.ui.main.components.OtherContent
import com.mustafatoktas.weatherappui.ui.main.viewmodel.MainViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value
    val context = LocalContext.current

    when (state.cihazDurumu) {
        CihazDurumu.Rootlu -> OtherContent(
            baslik = context.getString(R.string.root_tespit_edildi),
            icerik = context.getString(R.string.root_icerigi),
            resim = R.drawable.root,
        )
        CihazDurumu.Emulator -> OtherContent(
            baslik = context.getString(R.string.cihaz_bir_emulator_uzerinde_calisiyor),
            icerik = context.getString(R.string.emulator_icerigi),
            resim = R.drawable.emulator,
        )
        CihazDurumu.Normal -> MainContent()
    }
}
