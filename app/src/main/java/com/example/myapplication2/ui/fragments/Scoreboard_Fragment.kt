package com.example.myapplication2.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplication2.R
import com.example.myapplication2.data.adapters.ScoreBoardAdapter
import com.example.myapplication2.data.classes.DataSource
import com.example.myapplication2.data.database.Player
import com.example.myapplication2.data.database.db
import com.example.myapplication2.data.database.insert
import kotlinx.android.synthetic.main.fragment_scoreboard_.*
import java.util.Calendar.getInstance


class Scoreboard_Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scoreboard_, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val runnable = Runnable { db.getInstance(view.context).PlayerScoreDao().apply {
            insert(Player(player_id = "abc", raining = true, score = 10))
            getAll().forEach {
                Log.i("test", it.toString())
            }
        }
        }
        Thread(runnable).start()

        btn_back4.setOnClickListener {
            it.findNavController().navigate(R.id.destination_MainFrag)
        }

        fun addDataSet() {
            val data = DataSource.createDataSet()
            ScoreBoardAdapter.submitList(data)
        }
    }
}

