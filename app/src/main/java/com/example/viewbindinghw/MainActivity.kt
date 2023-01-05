package com.example.viewbindinghw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbindinghw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var txtName = binding.editTextPersonName.text
        var txtAge = binding.editTextNumber.text
        var switchApprove: String = "0"
        binding.switchApprove.setOnCheckedChangeListener() {
            compoundbutton, state ->
            if (state) switchApprove = "1"
        else switchApprove = "0"
}
        binding.buttonClick.setOnClickListener() {
            if (txtName.isEmpty()) {
            Toast.makeText(this, "You need to enter your name", Toast.LENGTH_SHORT).show()
        } else if (txtAge.isEmpty()) {
                Toast.makeText(this, "You need to enter your age", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "New Page is opening, please wait, ${switchApprove.toString()}", Toast.LENGTH_SHORT).show()
                val intent: Intent = Intent(this, NewActivity::class.java)
                    .putExtra("name",txtName)
                    .putExtra("age",txtAge)
                    .putExtra("approve",switchApprove)
                startActivity(intent)
            }
        }
    }
}