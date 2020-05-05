package com.example.myapplication2.data.classes

import com.example.myapplication2.data.database.Player

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Player>{
            val list = ArrayList<Player>()
            list.add(
                Player(
                    "Marcus",
                    1,
                    false
                )
            )
            list.add(
                Player(
                    "Ludvig",
                    10,
                    false
                )
            )

            list.add(
                Player(
                    "Jannicke",
                    250,
                    true
                )
            )
            list.add(
                Player(
                    "Mariusz",
                    10000,
                    true
                )
            )
            list.add(
                Player(
                    "Bot",
                    5,
                    false
                )
            )
            list.add(
                Player(
                    "Marte",
                    17,
                    false
                )
            )
            list.add(
                Player(
                    "Marcus",
                    1,
                    false
                )
            )
            list.add(
                Player(
                    "Marcusss",
                    9,
                    false
                )
            )
            list.add(
                Player(
                    "Håkon",
                    789,
                    true
                )
            )
            return list
        }
    }
}