package com.dicoding.myrecylerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AlbedoPage: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hero_albedo)

        val heroname : TextView = findViewById(R.id.hero_name)
        val background : ImageView = findViewById(R.id.backgroung_hero)
        val herodesc : TextView = findViewById(R.id.hero_desc)
        val herobirth: TextView = findViewById(R.id.hero_birth)
        val pang : TextView = findViewById(R.id.pang_hero)
        val voicechar : ImageView = findViewById(R.id.profile_image)
        val voicecharname : TextView = findViewById(R.id.hero_vc)
        val iconbasic : ImageView = findViewById(R.id.icon_hero_basic)
        val basic : TextView = findViewById(R.id.hero_basic)
        val basicdesc : TextView = findViewById(R.id.hero_basic_desc)
        val iconE : ImageView = findViewById(R.id.icon_hero_E)
        val ename : TextView = findViewById(R.id.hero_E)
        val edesc : TextView = findViewById(R.id.hero_E_desc)
        val bursticon : ImageView = findViewById(R.id.icon_hero_burst)
        val burst : TextView = findViewById(R.id.hero_burst)
        val burstdesc : TextView = findViewById(R.id.hero_burst_desc)

        val bundle : Bundle?= intent.extras
        val hname = bundle!!.getString("namehero")
        val back = bundle.getInt("img")
        val birth = bundle.getString("birth")
        val desc = bundle.getString("herodesc")
        val nick = bundle.getString("pang")
        val hvc = bundle.getInt("herovoice")
        val hvcname = bundle.getString("herovoicename")
        val bas = bundle.getString("basic")
        val basicon = bundle.getInt("basicicon")
        val basdesc = bundle.getString("basicdesc")
        val nameE = bundle.getString("Ename")
        val icnE = bundle.getInt("Eicon")
        val deschE = bundle.getString("Edesc")
        val burstname = bundle.getString("burst")
        val iconburst = bundle.getInt("bursticon")
        val descburst = bundle.getString("burstdesc")

        heroname.text = hname
        background.setImageResource(back)
        herodesc.text = desc
        herobirth.text = birth
        pang.text = nick
        voicechar.setImageResource(hvc)
        voicecharname.text = hvcname
        basic.text = bas
        iconbasic.setImageResource(basicon)
        basicdesc.text = basdesc
        ename.text = nameE
        iconE.setImageResource(icnE)
        edesc.text = deschE
        burst.text = burstname
        bursticon.setImageResource(iconburst)
        burstdesc.text = descburst
    }
}