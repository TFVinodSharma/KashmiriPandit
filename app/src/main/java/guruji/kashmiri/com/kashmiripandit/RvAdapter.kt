package guruji.kashmiri.com.kashmiripandit

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RvAdapter(val userList: ArrayList<Model>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.row_categories, p0, false)
        return ViewHolder(v);
    }
    override fun getItemCount(): Int {
        return userList.size
    }
    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        p0.name?.text = userList[p1].name
        p0.count?.text = userList[p1].count.toString()
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.tvName)
        val count = itemView.findViewById<TextView>(R.id.tvCount)

    }
}