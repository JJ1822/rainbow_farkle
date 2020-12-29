package com.rainbowfarkle.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rainbowfarkle.GameSetupEnum
import com.rainbowfarkle.R
import com.rainbowfarkle.adapters.NamesAdapter
import com.rainbowfarkle.datamodels.NameDataModel
import com.rainbowfarkle.viewmodels.GameBoardViewModel
import kotlinx.android.synthetic.main.names_fragment.*

class NamesFragment : Fragment() {

    private val gameBoardViewModel: GameBoardViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gameBoardViewModel.namesList = List(
            gameBoardViewModel.getNumberOfPlayers()
        ) {
            NameDataModel(resources.getString(R.string.player_number, it + 1))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.names_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        names_recycler_view.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = NamesAdapter(gameBoardViewModel.namesList)
        }
        save_button.setOnClickListener { navigate() }
    }

    private fun navigate() {
        gameBoardViewModel.namesList
    }
}
