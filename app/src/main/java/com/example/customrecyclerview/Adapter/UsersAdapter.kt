package com.example.customrecyclerview.Adapter

import android.content.Context
import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecyclerview.Model.Users
import com.example.customrecyclerview.R
import kotlinx.android.synthetic.main.userlayout.view.*

class UsersAdapter(var items: ArrayList<Users>): RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.userlayout, parent, false))

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(items[position])
    }


    override fun getItemCount(): Int {
       return items.size
    }

}

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){

    var userName = view.txtName
    var image = view.imageView

    fun bind(users: Users){

        userName.text = users.name
        image.setImageResource(users.image)

    }

}