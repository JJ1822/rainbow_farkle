package com.rainbowfarkle.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rainbowfarkle.R
import com.rainbowfarkle.datamodels.NameDataModel
import kotlinx.android.synthetic.main.name_item.view.name

class NamesAdapter(
    private val dataModels: List<NameDataModel>
) : RecyclerView.Adapter<NamesAdapter.NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.name_item, parent, false)
        return NameViewHolder(view)
    }

    override fun getItemCount(): Int = dataModels.size

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.bind(dataModels[position])
    }

    inner class NameViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(dataModel: NameDataModel) {
            itemView.name.hint = dataModel.hint
        }
    }
}
