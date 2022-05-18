package com.example.a541kotlin

import java.util.*
import kotlin.collections.ArrayList

class Chat_Main {
    var messages: Messages? = null
    var rooms: ArrayList<Room>? = null


    constructor(messages: Messages?) {
        this.messages = messages
    }

    constructor(rooms: ArrayList<Room>?) {
        this.rooms = rooms
    }



}