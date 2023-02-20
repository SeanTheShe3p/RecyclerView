package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.adapter.MyAdapter
import com.example.recyclerview.models.MyModel


class MainActivity : AppCompatActivity() {

    lateinit var recycelerView: RecyclerView
    lateinit var  gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    lateinit var staggered: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setup what it looks like
        recycelerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)

        staggered = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

//        recycelerView.layoutManager = gridLayoutManager
        recycelerView.layoutManager = staggered
        recycelerView.setHasFixedSize(true)

        //all about data
        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recycelerView.adapter = thisAdapter
    }


    private fun setupData(): ArrayList<MyModel> {
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.s1,"Spinner 1"))
        items.add(MyModel(R.drawable.s2,"Spinner 2"))
        items.add(MyModel(R.drawable.s3,"Spinner 3"))
        items.add(MyModel(R.drawable.s4,"Spinner 4"))
        items.add(MyModel(R.drawable.s5,"Spinner 5"))
        items.add(MyModel(R.drawable.s6,"Spinner 6"))
        items.add(MyModel(R.drawable.s7,"Spinner 7"))
        items.add(MyModel(R.drawable.s8,"Spinner 8"))
        items.add(MyModel(R.drawable.s9,"Spinner 9"))
        items.add(MyModel(R.drawable.s10,"Spinner 10"))
        items.add(MyModel(R.drawable.s11,"Spinner 11"))
        items.add(MyModel(R.drawable.s12,"Spinner 12"))
        items.add(MyModel(R.drawable.s13,"Spinner 13"))
        items.add(MyModel(R.drawable.s14,"Spinner 14"))
        items.add(MyModel(R.drawable.s15,"Spinner 15"))
        items.add(MyModel(R.drawable.s16,"Spinner 16"))
        items.add(MyModel(R.drawable.s17,"Spinner 17"))
        items.add(MyModel(R.drawable.s18,"Spinner 18"))
        items.add(MyModel(R.drawable.s19,"Spinner 19"))
        items.add(MyModel(R.drawable.s20,"Spinner 20"))
        items.add(MyModel(R.drawable.s21,"Spinner 21"))
        items.add(MyModel(R.drawable.s22,"Spinner 22"))
        items.add(MyModel(R.drawable.s23,"Spinner 23"))
        items.add(MyModel(R.drawable.s24,"Spinner 24"))
        items.add(MyModel(R.drawable.s25,"Spinner 25"))



        return items
    }
}