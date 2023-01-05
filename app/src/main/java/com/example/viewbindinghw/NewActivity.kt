package com.example.viewbindinghw

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
        val txtApprove = intent.getStringExtra("approve")


        TODO("Burada senden asla null olmayan bir String istiyor ancak " +
                "sen nullable olan bir String? veriyorsun buradaki hatayı düzeltmen lazım")
        binding.customView.bindData(
            txtName,txtAge,txtApprove
        )

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