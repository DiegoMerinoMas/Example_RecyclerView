package com.example.myapplications5s1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var contacts = ArrayList<Contact>()

    var contactAdapter = ContacAdapter(contacts)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContacts()

        initView()
    }

    private fun initView() {
        val rvContact = findViewById<RecyclerView>(R.id.rvContact)
        rvContact.adapter=contactAdapter
        rvContact.layoutManager=LinearLayoutManager(this)
    }

    private fun loadContacts() {
        contacts.add(Contact("Lucho Lopez", "123456789"))
        contacts.add(Contact("Nicole Lopez", "123321123"))
        contacts.add(Contact("Ashley Mesta", "123456987"))
        contacts.add(Contact("Kiara Venturo", "123654789"))
        contacts.add(Contact("Leonardo Del Milagro", "955736644"))
    }
}