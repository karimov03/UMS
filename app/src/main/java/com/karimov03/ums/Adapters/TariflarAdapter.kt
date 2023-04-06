package com.karimov03.ums.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.karimov03.ums.Data
import com.karimov03.ums.databinding.TariflaritemBinding

class TariflarAdapter(val list: ArrayList<Data.Tariflar>,val onclick:Action): RecyclerView.Adapter<TariflarAdapter.vh>(){


    class vh(val itemTariflarBinding: TariflaritemBinding): RecyclerView.ViewHolder(itemTariflarBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        return vh(TariflaritemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        val tariflarlist=list[position]
        holder.itemTariflarBinding.tvDaqiqa.text=tariflarlist.name
        holder.itemTariflarBinding.tvDaqiqaKod.text=tariflarlist.kod
        holder.itemTariflarBinding.tvDaqiqaHaqida.text=tariflarlist.about

        holder.itemView.setOnClickListener {
            onclick.OnClick(list,position)
        }
    }
    interface Action{
        fun OnClick(list: ArrayList<Data.Tariflar>, position: Int)
    }
}
