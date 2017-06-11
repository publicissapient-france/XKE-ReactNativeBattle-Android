package fr.xebia.henrypoitierxke

import android.content.Context
import android.support.v7.widget.CardView
import android.util.AttributeSet
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_book_item.view.*

class BookItemView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : CardView(context, attrs, defStyleAttr) {

    fun bindData(book: Book) {
        Picasso.with(context).load(book.cover).resize(340, 500).centerCrop().into(bookCover)
        bookTitle.text = book.title
        bookPrice.text = String.format(context.getString(R.string.format_price), book.price)
    }
}