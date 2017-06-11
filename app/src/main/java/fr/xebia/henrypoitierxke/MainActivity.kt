package fr.xebia.henrypoitierxke

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : AppCompatActivity(), Callback<List<Book>> {

    val HP_ENDPOINT = "http://henri-potier.xebia.fr/"

    private lateinit var adapter: BooksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()

        val retrofit = Retrofit.Builder()
                .baseUrl(HP_ENDPOINT)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        val service = retrofit.create<HPService>(HPService::class.java)
        service.getBooks().enqueue(this)
    }

    private fun setupRecyclerView() {
        adapter = BooksAdapter(this)
        val spanCount = 2
        val layoutManager = GridLayoutManager(this, spanCount)
        bookRecyclerView.layoutManager = layoutManager
        bookRecyclerView.adapter = adapter
    }

    override fun onFailure(call: Call<List<Book>>?, t: Throwable?) {
        Toast.makeText(this, R.string.fetch_error, Toast.LENGTH_LONG).show()
    }

    override fun onResponse(call: Call<List<Book>>?, response: Response<List<Book>>?) {
        adapter.setItems(response!!.body()!!)
    }
}
