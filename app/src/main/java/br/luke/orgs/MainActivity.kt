package br.luke.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "Amo a denguinha!!", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)


        
    }

}