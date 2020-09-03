package com.example.customrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.customrecyclerview.Adapter.UsersAdapter
import com.example.customrecyclerview.Model.Users
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var userList = ArrayList<Users>()
    lateinit var ourAdapter: UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userList.add(Users("Magaji Rumfa", R.drawable.imageo))
        userList.add(Users("Timothy Olaleke", R.drawable.imaget))
        userList.add(Users("Christiana Oba", R.drawable.imageft))
        userList.add(Users("Job Ibrahim", R.drawable.imageh))
        userList.add(Users("Fatima Baba", R.drawable.imagefo))
        userList.add(Users("Ramat M Acca", R.drawable.imager))

        ourAdapter = UsersAdapter(userList)
        customRv.adapter = ourAdapter

    }
}
