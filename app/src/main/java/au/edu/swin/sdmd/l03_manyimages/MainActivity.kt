package au.edu.swin.sdmd.l03_manyimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)

        val station = findViewById<Button>(R.id.station)
        station.setOnClickListener {
            image.setImageDrawable(getDrawable(R.drawable.station))
        }

        val onClickTheatre = View.OnClickListener {
            image.setImageDrawable(getDrawable(R.drawable.theatre))
        }

        var onClickTheatre2: (() -> Unit)? = {
            image.setImageDrawable(getDrawable(R.drawable.theatre))
        }

        val theatre = findViewById<Button>(R.id.theatre)
        theatre.setOnClickListener(onClickTheatre)
        //theatre.setOnClickListener { onClickTheatre2?.invoke() }

    }

    fun onClickCollege(v: View) {
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageDrawable(getDrawable(R.drawable.college))
    }

}