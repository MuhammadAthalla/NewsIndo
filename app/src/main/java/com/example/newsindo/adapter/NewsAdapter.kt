package com.example.newsindo.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsindo.core.response.PostsItem
import com.example.newsindo.databinding.ItemRowBinding
import com.example.newsindo.presentation.DetailActivity
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.Locale

class NewsAdapter: RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    private val listNews = ArrayList<PostsItem>()

    fun setData(list: List<PostsItem>?){
        listNews.clear()
        if (list != null) {
            listNews.addAll(list)
        }
        notifyItemRangeChanged(0, listNews.size)
    }

    class MyViewHolder(val binding: ItemRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemRowBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = listNews.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataNews = listNews[position]

        val dateTimeString = dataNews.pubDate
        val dateTimeFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val date = dateTimeFormat.parse(dateTimeString)
        val myDateFormat = SimpleDateFormat("EEE, dd MMMM | HH:mm", Locale.getDefault())

        val myDate = myDateFormat.format(date!!)

        holder.binding.apply {
            tvTitle.text = dataNews.title
            tvDate.text = dataNews.pubDate.toString()


            Picasso.get()
                .load(dataNews.thumbnail)
                .fit()
                .centerInside()
                .into(imgNews)
        }
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.DATA_NEWS, dataNews)
//            intent.putExtra(DetailActivity.DATE_NEWS, date)
            holder.itemView.context.startActivity(intent)
        }
    }
}