package com.example.recycleview

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewMotorAdapter constructor(private val getActivity: MainActivity, private val motorlist : List<Motor>):
    RecyclerView.Adapter<RecyclerViewMotorAdapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return motorlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvMotorTitle : TextView = itemView.findViewById(R.id.tvMotorTitle)
        val tvMotorImg : ImageView = itemView.findViewById(R.id.ivmotorimg)
        val cardView : CardView = itemView.findViewById(R.id.cardView)


    }
}