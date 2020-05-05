package com.example.myapplication2.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.data.database.Player
import kotlinx.android.synthetic.main.fragment_scoreboard_.view.*


class ScoreBoardAdapter() : RecyclerView.Adapter<ScoreBoardAdapter.ScoreboardHolder>() {

    private var playerList: List<Player> = ArrayList()

    fun setPlayerList(playerList: List<Player>) {
        this.playerList = playerList
        notifyDataSetChanged()
    }

    // Correct
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoreboardHolder {
        val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.player_list_item, parent, false)
        return ScoreboardHolder(itemView)
    }

    // Correct
    override fun onBindViewHolder(holder: ScoreboardHolder, position: Int) {
        when (holder)
        {
            is ScoreboardHolder -> {
                holder.bind(playerList.get(position))
            }
        }
    }

    // Correct
    override fun getItemCount() = playerList.size

    class ScoreboardHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        fun bind(player: Player){
            val tvPlayerId = itemView.findViewById<TextView>(R.id.tv_player_id)
            tvPlayerId.text = player.player_id


        }
    }
}







