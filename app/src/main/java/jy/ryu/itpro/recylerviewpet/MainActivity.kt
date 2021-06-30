package jy.ryu.itpro.recylerviewpet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val dataArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addDataArray()
        rv_data_list.layoutManager = LinearLayoutManager(this)
        rv_data_list.adapter = DataAdapter(dataArray, this)
    }

    private fun addDataArray() {
        dataArray.add("오리")
        dataArray.add("호랑이")
        dataArray.add("너구리")
        dataArray.add("참새")
        dataArray.add("강아지")
        dataArray.add("고양이")
        dataArray.add("하마")
        dataArray.add("표범")
        dataArray.add("사자")
        dataArray.add("미어캣")
        dataArray.add("두더지")
        dataArray.add("개미")
        dataArray.add("딱정벌레")
        dataArray.add("무당벌레")
        dataArray.add("오리")
        dataArray.add("호랑이")
        dataArray.add("너구리")
        dataArray.add("참새")
        dataArray.add("강아지")
        dataArray.add("고양이")
        dataArray.add("하마")
        dataArray.add("표범")
        dataArray.add("사자")
        dataArray.add("미어캣")
        dataArray.add("두더지")
        dataArray.add("개미")
        dataArray.add("딱정벌레")
        dataArray.add("무당벌레")
        dataArray.add("오리")
        dataArray.add("호랑이")
        dataArray.add("너구리")
        dataArray.add("참새")
        dataArray.add("강아지")
        dataArray.add("고양이")
        dataArray.add("하마")
        dataArray.add("표범")
        dataArray.add("사자")
        dataArray.add("미어캣")
        dataArray.add("두더지")
        dataArray.add("개미")
        dataArray.add("딱정벌레")
        dataArray.add("무당벌레")
        dataArray.add("오리")
        dataArray.add("호랑이")
        dataArray.add("너구리")
        dataArray.add("참새")
        dataArray.add("강아지")
        dataArray.add("고양이")
        dataArray.add("하마")
        dataArray.add("표범")
        dataArray.add("사자")
        dataArray.add("미어캣")
        dataArray.add("두더지")
        dataArray.add("개미")
        dataArray.add("딱정벌레")
        dataArray.add("무당벌레")
    }
}