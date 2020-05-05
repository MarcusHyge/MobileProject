package com.example.myapplication2.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.data.database.Player
import kotlinx.android.synthetic.main.fragment_scoreboard_.view.*


class ScoreBoardAdapter(val playerList: List<Player>) : RecyclerView.Adapter<ScoreBoardAdapter.ScoreboardHolder>() {

    private var items: List<Player> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScoreboardHolder {
        val itemView =  LayoutInflater.from(parent.context).inflate(R.layout.fragment_scoreboard_, parent, false)
        return ScoreboardHolder(itemView)
    }

    override fun onBindViewHolder(holder: ScoreboardHolder, position: Int) {
        when (holder)
        {

            is ScoreboardHolder -> {
                holder.bind(items.get(position))
            }
        }
    }
    override fun getItemCount() = playerList.size

    fun sumbitList(playerList: List<Player>){
        items = playerList
    }

    class ScoreboardHolder
    constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
             private val playerName = itemView.put_Name
             private val score = itemView.put_Score
             private val raining = itemView.put_Raining

        fun bind(player: Player){
            playerName.text = player.player_id.toString()
            score.text = player.score.toString()
            raining.text = player.raining.toString()
        }
    }
}







