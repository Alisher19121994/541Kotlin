package com.example.a541kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerview = findViewById(R.id.main_recyclerview)
        recyclerview.layoutManager = GridLayoutManager(this, 1)
        getAdapter(getAllFakeDates())
    }

    private fun getAdapter(list: ArrayList<Chat_Main>) {
        val adapter = Adapter_Recyclerview(this, list)
        recyclerview.adapter = adapter
    }

    private fun getAllFakeDates(): ArrayList<Chat_Main> {
        val chatsList: ArrayList<Chat_Main> = ArrayList()
        val roomList: ArrayList<Room> = ArrayList()

        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", false))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", false))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", false))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", false))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", false))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", true))
        roomList.add(Room(R.drawable.rasm, "Alisher Daminov", false))

        chatsList.add(Chat_Main(roomList))

        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    false
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    false
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    false
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    false
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        chatsList.add(
            Chat_Main(
                Messages(
                    R.drawable.rasm,
                    "Alisher Daminov",
                    "Abbos has just sent message",
                    true
                )
            )
        )
        return chatsList
    }
}