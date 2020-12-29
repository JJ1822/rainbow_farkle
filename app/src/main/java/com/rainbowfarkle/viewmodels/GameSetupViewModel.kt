package com.rainbowfarkle.viewmodels

import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.navigation.NavDirections
import com.rainbowfarkle.BR
import com.rainbowfarkle.GameSetupEnum
import com.rainbowfarkle.datamodels.GameSetupDataModel
import com.rainbowfarkle.ui.GameSetupFragmentDirections

class GameSetupViewModel(
    private val dataModel: GameSetupDataModel,
    private val onSaveListener: (action: NavDirections, dataModel: GameSetupDataModel) -> Unit
) : BaseObservable() {

    @Bindable
    fun getNumber() = dataModel.number.toString()

    val title = dataModel.title

    fun onNegativeClick() = View.OnClickListener {
        if (dataModel.min < dataModel.number && dataModel.number <= dataModel.max) {
            dataModel.number -= dataModel.step
            notifyPropertyChanged(BR.number)
        }
    }

    fun onPositiveClick() = View.OnClickListener {
        if (dataModel.min <= dataModel.number && dataModel.number < dataModel.max) {
            dataModel.number += dataModel.step
            notifyPropertyChanged(BR.number)
        }
    }

    fun onSaveClick() = View.OnClickListener {
       val action = when (dataModel.gameSetupEnum) {
            GameSetupEnum.NUMBER_OF_PLAYERS -> GameSetupFragmentDirections.reloadGameSetupFragment(GameSetupEnum.NUMBER_OF_POINTS)
            GameSetupEnum.NUMBER_OF_POINTS -> GameSetupFragmentDirections.gameSetupFragmentToNamesFragment()
        }
        onSaveListener(action, dataModel)
    }
}
