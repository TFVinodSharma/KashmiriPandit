package guruji.kashmiri.com.kashmiripandit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView=findViewById<RecyclerView>(R.id.recycler)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
//        Create an arraylist
        val dataList = ArrayList<Model>()
        dataList.add(Model("Makela", 1))
        dataList.add(Model("Lagan", 2))
        dataList.add(Model("Khanether", 3))
        dataList.add(Model("Grahprewesh", 4))
//        pass the values to RvAdapter
        val rvAdapter = RvAdapter(dataList)
//        set the recyclerView to the adapter
        recyclerView.adapter = rvAdapter;
    }
}
