package upnvjt.android.belajarrecycleview

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Alpha",
        "Bravo",
        "Charlie",
        "Delta",
        "Echo",
        "Foxtrot",
        "Golf",
        "Hotel",
        "India",
        "Juliet"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val RecyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size){
            list.add(Users(listUsers.get(i)))
            if(listUsers.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                RecyclerView.adapter = adapter
            }
        }
    }
}