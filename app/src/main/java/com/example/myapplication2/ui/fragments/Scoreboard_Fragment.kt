package com.example.myapplication2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.R
import com.example.myapplication2.data.adapters.ScoreBoardAdapter
import com.example.myapplication2.data.classes.DataSource
import kotlinx.android.synthetic.main.fragment_scoreboard_.*


class Scoreboard_Fragment : Fragment() {

    private lateinit var mRvPlayerList : RecyclerView
    private val mAdapter = ScoreBoardAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scoreboard_, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mRvPlayerList = view.findViewById(R.id.rv_playerList)
        mRvPlayerList.adapter = mAdapter

        mAdapter.setPlayerList(DataSource.createDataSet())

        btn_back4.setOnClickListener {
            it.findNavController().navigate(R.id.destination_MainFrag)
        }
    }
}
