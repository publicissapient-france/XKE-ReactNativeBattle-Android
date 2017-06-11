package fr.xebia.henrypoitierxke

import retrofit2.Call
import retrofit2.http.GET

interface HPService {

    @GET("/books")
    fun getBooks(): Call<List<Book>>
}
