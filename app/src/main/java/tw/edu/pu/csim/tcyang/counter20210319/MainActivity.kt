package tw.edu.pu.csim.tcyang.counter20210319

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()

        txv.setOnClickListener(this)
        btn.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
    }


    fun Add(v:View){
        if (v == btn){
            counter++
        }
        else{
            counter += 2
        }
        txv.text = counter.toString()
    }

    override fun onClick(v: View?) {
        if(v==txv || v==btn){
            counter++
        }
        else if(v==btn2){
            counter += 2
        }
        else{
            counter=0
        }
        txv.text = counter.toString()
    }


}