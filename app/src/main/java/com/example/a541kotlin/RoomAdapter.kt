package com.example.a541kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class RoomAdapter(var context: Context, var list: ArrayList<Room>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var CREATE = 0
    private var ROOM = 1

    inner class MyRoomHolder(item: View) : RecyclerView.ViewHolder(item) {
        val shapeableImageView: ShapeableImageView = item.findViewById(R.id.room_image_id)
        var fullname: TextView = item.findViewById(R.id.room_text_fullname_id)
        var online: LinearLayout = item.findViewById(R.id.is_online)
    }

    inner class MyCreateHolderView(item: View) : RecyclerView.ViewHolder(item) {

    }

    override fun getItemViewType(position: Int): Int {
        if (isHeader(position)) return CREATE
        return if (list.isEmpty()) ROOM else ROOM
    }

    private fun isHeader(position: Int): Boolean {
        return position == 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == CREATE) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.create, parent, false)
            return MyCreateHolderView(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.room, parent, false)
        return MyRoomHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val room = list[position]


        if (holder is MyRoomHolder) {
            holder.shapeableImageView.setImageResource(room.image)
            holder.fullname.text = room.fullname

            if (room.is_onlineRoom) {
                holder.online.visibility = View.VISIBLE
            } else {
                holder.online.visibility = View.GONE
            }
        }

    }
    override fun getItemCount(): Int {
        return list.size
    }


}