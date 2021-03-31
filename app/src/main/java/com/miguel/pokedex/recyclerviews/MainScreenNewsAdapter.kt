package com.miguel.pokedex.recyclerviews

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View.inflate
import android.view.ViewGroup
import androidx.compose.ui.res.stringResource
import androidx.recyclerview.widget.RecyclerView
import com.miguel.pokedex.R
import com.miguel.pokedex.databinding.ActivityMainBinding.inflate
import com.miguel.pokedex.databinding.ItemNewsBinding

class MainScreenNewsAdapter : RecyclerView.Adapter<MainScreenNewsAdapter.NewsViewHolder>() {

    inner class NewsViewHolder(private val binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(){
            binding.apply {
                textViewName.text = "Pokémon Rumble Rush Arrives Soon"
                textViewDate.text = "15 May 2019"

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = 20;
}