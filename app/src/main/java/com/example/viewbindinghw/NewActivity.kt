package com.example.viewbindinghw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindinghw.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val txtName = intent.getStringExtra("name")
        val txtAge = intent.getStringExtra("age")
        val booleanApprove = intent.getBooleanExtra("approve", false)

        if (txtAge != null) {
            if (txtName != null) {
                binding.customView.bindData(
                    txtName,txtAge,booleanApprove
                )
            }
        }

    /*    if (txtApprove != null) {
            if (txtAge != null) {
                if (txtName != null) {
                    binding.customView.bindData(
                        txtName,txtAge,txtApprove
                    )
                }
            }
        } */
    }
}

