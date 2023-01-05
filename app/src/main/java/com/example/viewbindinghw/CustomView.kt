package com.example.viewbindinghw

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.cardview.widget.CardView
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.example.viewbindinghw.databinding.CustomViewBinding

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : CardView(context, attrs, defStyle) {

    private lateinit var binding: CustomViewBinding

    init {
        init()
    }

    private fun init() {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.custom_view,
            this,
            true
        )
    }

    fun bindData(name: String, age: String, approve: String) {
        binding.txtName.text = name
        binding.txtAge.text = age
        if (approve == "1") {
            Glide.with(this)
                .load(R.drawable.greencheck)
                .into(binding.imgSymbol)
        } else {
            Glide.with(this)
                .load(R.drawable.redx)
                .into(binding.imgSymbol)
        }
    }
}