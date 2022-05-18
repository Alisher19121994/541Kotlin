package com.example.a541kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter_Recyclerview(var context: Context, var list: ArrayList<Chat_Main>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var ROOM = 0
    private var MESSAGE = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == ROOM) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.room_recyclerview, parent, false)
            return MyRoomHorizontalHolder(view)
        }
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.message_vertical, parent, false)
        return MyMessageVerticalHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chats = list[position]
        if (holder is MyRoomHorizontalHolder) {
            val recyclerview = holder.recyclerview
            chats.rooms?.let { bringSecondADAPTER(it, recyclerview) }
        }
        if (holder is MyMessageVerticalHolder) {
            holder.shapeableImageView.setImageResource(chats.messages!!.messageImage)
            holder.fullname.text = chats.messages!!.fullname
            holder.text.text = chats.messages!!.messages
            if (chats.messages!!.is_onlineMessage) {
                holder.online.visibility = View.VISIBLE
            } else {
                holder.online.visibility = View.GONE
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyRoomHorizontalHolder(item: View) : RecyclerView.ViewHolder(item) {
        var recyclerview: RecyclerView = item.findViewById(R.id.recyclerview)

        init {
            val m = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            recyclerview.layoutManager = m
        }
    }

    inner class MyMessageVerticalHolder(item: View) : RecyclerView.ViewHolder(item) {
        val shapeableImageView: ShapeableImageView = item.findViewById(R.id.message_image_id)
        var fullname: TextView = item.findViewById(R.id.message_fullname)
        var text: TextView = item.findViewById(R.id.message_text_id)
        var online: LinearLayout = item.findViewById(R.id.message_is_online)
    }

    override fun getItemViewType(position: Int): Int {
        if (isHeader(position)) return ROOM
        return if (list.isEmpty()) MESSAGE else MESSAGE
    }
    fun isHeader(position: Int): Boolean {
        return position == 0
    }
    private fun bringSecondADAPTER(room: ArrayList<Room>, recyclerView: RecyclerView) {
        val adapter = RoomAdapter(context, room)
        recyclerView.adapter = adapter
    }

}