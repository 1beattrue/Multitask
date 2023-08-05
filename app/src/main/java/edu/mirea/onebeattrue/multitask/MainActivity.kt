package edu.mirea.onebeattrue.multitask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.mirea.onebeattrue.multitask.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val saveButton = binding.saveButton
        val editTextName = binding.editTextName
        val textViewName = binding.textViewName

        val textViewResult = binding.textViewResult

        saveButton.setOnClickListener {
            val newThread = MyThread()
            val int = (Math.random() * 10).toInt()
            newThread.square(int, textViewResult)
            textViewName.text = editTextName.text.toString()
        }
    }
}