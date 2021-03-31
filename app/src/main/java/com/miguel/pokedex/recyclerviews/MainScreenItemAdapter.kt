package com.miguel.pokedex.recyclerviews

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.miguel.pokedex.databinding.MainScreenItemBinding
import com.miguel.pokedex.recyclerviews.staticdata.MainItemData
import com.miguel.pokedex.recyclerviews.staticdata.MainMenuItem

class MainScreenItemAdapter : RecyclerView.Adapter<MainScreenItemAdapter.MainScreenItemViewHolder>() {

    val menuList = MainItemData.MENU_ITEMS

    inner class MainScreenItemViewHolder(private val binding: MainScreenItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: MainMenuItem){
            binding.apply {
                textViewItem.text = item.title
                menuItemBackground.setBackgroundResource(item.background)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainScreenItemViewHolder {
        val view = MainScreenItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainScreenItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainScreenItemViewHolder, position: Int) {
        holder.bind(menuList[position])
    }

    override fun getItemCount(): Int {
        return menuList.size
    }
}