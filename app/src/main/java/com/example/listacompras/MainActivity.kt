package com.example.listacompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    var itensAdicionados = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.teste).setText(itensAdicionados);
    }

    fun btnAddClick(view: View) {
        var nomeProduto = findViewById<TextView>(R.id.productName)
        var qtde = findViewById<TextView>(R.id.qtde)

        if(itensAdicionados == ""){
            itensAdicionados = itensAdicionados +  qtde.getText() + " x " + nomeProduto.getText()
        } else {
            itensAdicionados = itensAdicionados + ", " +  qtde.getText() + " x " + nomeProduto.getText()
        }

        findViewById<TextView>(R.id.teste).setText(itensAdicionados)


    }
}
