package com.example.myapplication2.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.myapplication2.R
import com.example.myapplication2.data.database.Player
import com.example.myapplication2.data.database.db
import kotlinx.android.synthetic.main.fragment_endgame_fragment.*
import kotlinx.android.synthetic.main.fragment_play_.*


class endgame_fragment : Fragment() {
    private lateinit var score : String
    private lateinit var name : String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_endgame_fragment, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        score = arguments?.getString(ARG_SCORE) ?:""
        name = arguments?.getString(ARG_NAME) ?:""
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_back3.setOnClickListener {
            it.findNavController().navigate(R.id.destination_MainFrag)
        }

        btn_confirm.setOnClickListener {
            // save to database using the [score] & [name] variable
            val player = Player(name, score.toInt(), false)
            val dbInstance = db.getInstance(requireContext())
            dbInstance.PlayerScoreDao().insert(player)
        }
    }


    companion object {
        const val TAG = "ListPostedFragment"
        const val ARG_SCORE = "ARG_SCORE"
        const val ARG_NAME = "ARG_NAME"

        @JvmStatic
        fun newInstance(gameScore: String, name: String): endgame_fragment {
            val fragment = endgame_fragment()
            val args = Bundle()
            args.putString(ARG_SCORE, gameScore)
            args.putString(ARG_NAME, name)
            fragment.arguments = args
            return fragment
        }
    }

}