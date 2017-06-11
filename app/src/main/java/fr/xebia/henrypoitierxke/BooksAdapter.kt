package fr.xebia.henrypoitierxke

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*

class BooksAdapter internal constructor(context: Context) : RecyclerView.Adapter<BooksAdapter.ViewHolder>() {

    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    private var books: List<Book>? = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = layoutInflater.inflate(R.layout.view_book_item, parent, false) as BookItemView
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books!![position]
        (holder.itemView as BookItemView).bindData(book)
    }

    override fun getItemCount(): Int {
        if (books != null) return books!!.size
        return 0
    }

    fun setItems(books: List<Book>) {
        this.books = books
        notifyDataSetChanged()
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v)
}
