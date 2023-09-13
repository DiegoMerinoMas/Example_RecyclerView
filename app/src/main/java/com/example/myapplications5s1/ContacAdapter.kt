package com.example.myapplications5s1

import android.provider.ContactsContract.Contacts
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContacAdapter(var contacts: ArrayList<Contact>): RecyclerView.Adapter<ContactPrototype>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactPrototype {
        //metodo que muestra cada uno de los elementos
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.prototype_contact, parent, false)

        return ContactPrototype(view)
    }

    override fun onBindViewHolder(holder: ContactPrototype, position: Int) {
        //metodo que une(vincula)
        holder.bind(contacts.get(position))
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}

class ContactPrototype(itemView: View): RecyclerView.ViewHolder(itemView) {
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvPhone = itemView.findViewById<TextView>(R.id.tvPhone)

    fun bind(contact: Contact){
        tvName.text=contact.name
        tvPhone.text=contact.phone
    }

}
