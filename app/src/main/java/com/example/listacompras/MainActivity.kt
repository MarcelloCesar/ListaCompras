package com.example.listacompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    var itensAdicionados = "";
    var contView = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.teste).setText(itensAdicionados);
    }

    fun btnAddClick(view: View) {
        var nomeProduto = findViewById<TextView>(R.id.productName)
        var qtde = findViewById<TextView>(R.id.qtde)
        var ll = findViewById<LinearLayout>(R.id.linearLayout)

        if(itensAdicionados == ""){
            itensAdicionados = itensAdicionados +  qtde.getText() + " x " + nomeProduto.getText()
        } else {
            itensAdicionados = itensAdicionados + ", " +  qtde.getText() + " x " + nomeProduto.getText()
        }

        var newLabel = TextView(this)
        newLabel.text = "" + qtde.getText() + " x " + nomeProduto.getText()

        var botao = Button(this)
        botao.text = "Remover"

        botao.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View) {
                ll.removeView(v.parent as View)
            }
        })

        var container = LinearLayout(this)
        container.orientation = LinearLayout.HORIZONTAL

        var separador = TextView(this)
        separador.text = "          "


        container.addView(botao)
        container.addView(separador)
        container.addView(newLabel)

        ll.addView(container)

    }
}
