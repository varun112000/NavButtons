package com.example.navbuttons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewitem2.view.*

class ViewPagerAdapter2: RecyclerView.Adapter<PagerVH2>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH2 =
        PagerVH2(LayoutInflater.from(parent.context).inflate(R.layout.viewitem2, parent, false))

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: PagerVH2, position: Int) = holder.itemView.run {
        if(position == 0){
            image2.setImageResource(R.drawable.one)
            image3.setImageResource(R.drawable.teo)
        }
        if(position == 1){
            image2.setImageResource(R.drawable.one)
            image3.setImageResource(R.drawable.teo)
        }
        if(position == 2){
            image2.setImageResource(R.drawable.one)
            image3.setImageResource(R.drawable.teo)
        }
    }
}
class PagerVH2(itemView: View) : RecyclerView.ViewHolder(itemView)

