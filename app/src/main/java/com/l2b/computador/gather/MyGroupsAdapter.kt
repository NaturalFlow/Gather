package com.l2b.computador.gather

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.mygroups_column.view.*

/**
 * Created by Computador on 22/05/2018.
 */
class MyGroupsAdapter : RecyclerView.Adapter<MyGroupsViewHolder>() {
    val myGroups = listOf(R.drawable.images8,
            R.drawable.image9,
            R.drawable.image10,
            R.drawable.image11,
            R.drawable.image12,
            R.drawable.image13,
            R.drawable.image14,
            R.drawable.image15,
            R.drawable.image16,
            R.drawable.image17)

    override fun onBindViewHolder(holder: MyGroupsViewHolder?, position: Int) {
        val currentGroup = myGroups.get(position)
        holder?.view?.groupIcon?.setImageResource(currentGroup)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyGroupsViewHolder {
        val layoutInflate = LayoutInflater.from(parent?.context)
        val cellForColumn = layoutInflate.inflate(R.layout.mygroups_column, parent, false)
        return MyGroupsViewHolder(cellForColumn)
    }

    override fun getItemCount(): Int {
        return myGroups.size
    }
}

class MyGroupsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

}