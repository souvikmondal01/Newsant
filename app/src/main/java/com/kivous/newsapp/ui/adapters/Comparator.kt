package com.kivous.newsapp.ui.adapters

import androidx.recyclerview.widget.DiffUtil
import com.kivous.newsapp.data.model.Article

object Comparator : DiffUtil.ItemCallback<Article>() {
    override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem.url == newItem.url
    }

    override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem == newItem
    }
}