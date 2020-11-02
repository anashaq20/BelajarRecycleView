package upnvjt.android.belajarrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Toast
import android.widget.TextView
import android.widget.Toast.*
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import kotlinx.android.synthetic.main.list.view.*
import androidx.cardview.widget.CardView as CardView


class Adapter(private val list: ArrayList<Users>) : RecyclerView.Adapter<Adapter.Holder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : Holder {
        // membuat view baru
        return Holder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
    }
    // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Holder, position: Int){
        // - mengambil elemen dari dataset (Array List) pada posisi tertentu
        holder.view.ibList.text = list.get(position).name
    }
    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}