package com.example.myapplication2.data.functions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication2.R
import com.example.myapplication2.data.classes.Player
import kotlinx.android.synthetic.main.fragment_scoreboard_.view.*

class ScoreBoardAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
    {
        private var items: List<Player> = ArrayList()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val GetView =  LayoutInflater.from(parent.context).inflate(R.layout.fragment_scoreboard_, parent, false)
            return Player(GetView)
        }


        override fun getItemCount(): Int {
            return items.size
        }

        fun submitList(Player : List<Player>){
            items = Player
        }

        class PlayerHolder
        constructor(itemView: View): RecyclerView.ViewHolder(itemView){

            val player_name = itemView.PlayerName
            val player_score = itemView.ScoreView
            val player_raining = itemView.RainView

            fun bind(player: Player){

                val requestOptions = RequestOptions()
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
            }

        }
    }