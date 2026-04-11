package br.com.modularpam1appfitnessrai

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btn_Calcular: Button
    private lateinit var edt_Peso: EditText
    private lateinit var edt_Altura: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        initComponents()

        btn_Calcular.setOnClickListener {
            if (!validate()) {
                Toast.makeText(
                    this,
                    "Os campos devem ser preenchidos e com valores diferents de 0",
                    Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }


    }

    private fun validate(): Boolean {
        return (edt_Peso.text.toString().isNotEmpty()
                && edt_Altura.text.toString().isNotEmpty()
                && !edt_Peso.text.toString().startsWith("0")
                && !edt_Altura.text.toString().startsWith("0"))
    }

    private fun initComponents() {
        btn_Calcular = findViewById(R.id.btn_Calcular)
        edt_Peso = findViewById(R.id.edt_peso)
        edt_Altura = findViewById(R.id.edt_altura)
    }
}