package com.dicoding.myrecylerview
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Hero> = arrayListOf()
    private var title: String = "Mode List"

    val listDataTest: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in HeroesData.heroNames.indices) {
                val hero = Hero()
                hero.name = HeroesData.heroNames[position]
                hero.detail = HeroesData.heroDetails[position]
                hero.photo = HeroesData.heroesImages[position]
                hero.heroImage = HeroesData.heroesBackground[position]
                hero.heroDetail = resources.getString(HeroesData.heroesdesc[position])
                hero.heroName = resources.getString(HeroesData.name[position])
                hero.heronick = resources.getString(HeroesData.heropang[position])
                hero.herovc = HeroesData.vchero[position]
                hero.herovcname = resources.getString(HeroesData.vcheroname[position])
                hero.basicname = resources.getString(HeroesData.basic[position])
                hero.iconbasic = HeroesData.basicicon[position]
                hero.basicdesc = resources.getString(HeroesData.basicdesc[position])
                hero.Ename = resources.getString(HeroesData.nameE[position])
                hero.iconE = HeroesData.iconE[position]
                hero.Edesc = resources.getString(HeroesData.descE[position])
                hero.burstname = resources.getString(HeroesData.burstname[position])
                hero.iconburst = HeroesData.iconBurst[position]
                hero.burstdesc = resources.getString(HeroesData.burstdesc[position])
                hero.herobirthday = resources.getString(HeroesData.birthhero[position])

                list.add(hero)
            }
            return list
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(listDataTest)
        showRecyclerList()


    }



    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvHeroes.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickback(object : ListHeroAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showSelectedHero(data)
                val moveIntent = Intent(this@MainActivity, AlbedoPage::class.java)
                moveIntent.putExtra("namehero", data.heroName)
                moveIntent.putExtra("herodesc", data.heroDetail)
                moveIntent.putExtra("birth", data.herobirthday)
                moveIntent.putExtra("img", data.heroImage)
                moveIntent.putExtra("pang", data.heronick)
                moveIntent.putExtra("herovoice", data.herovc)
                moveIntent.putExtra("herovoicename", data.herovcname)
                moveIntent.putExtra("basic", data.basicname)
                moveIntent.putExtra("basicicon", data.iconbasic)
                moveIntent.putExtra("basicdesc", data.basicdesc)
                moveIntent.putExtra("Ename", data.Ename)
                moveIntent.putExtra("Eicon", data.iconE)
                moveIntent.putExtra("Edesc", data.Edesc)
                moveIntent.putExtra("burst", data.burstname)
                moveIntent.putExtra("bursticon", data.iconburst)
                moveIntent.putExtra("burstdesc", data.burstdesc)
                Log.i("TAG","this")
                startActivity(moveIntent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "mode CardView"
                showRecyclerCardView()
            }
            R.id.action_about -> {
                title = "About"
                val mIntent = Intent(this@MainActivity, AboutPage::class.java)
                startActivity(mIntent)
            }
        }
        setActionBarTitle(title)
    }

    private fun showRecyclerGrid() {
        rvHeroes.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridHeroAdapter(list)
        rvHeroes.adapter = gridHeroAdapter

        gridHeroAdapter.setOnitemClickCallback(object : GridHeroAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Hero) {
                showSelectedHero(data)
                val moveIntent = Intent(this@MainActivity, AlbedoPage::class.java)
                moveIntent.putExtra("namehero", data.heroName)
                moveIntent.putExtra("herodesc", data.heroDetail)
                moveIntent.putExtra("birth", data.herobirthday)
                moveIntent.putExtra("img", data.heroImage)
                moveIntent.putExtra("pang", data.heronick)
                moveIntent.putExtra("herovoice", data.herovc)
                moveIntent.putExtra("herovoicename", data.herovcname)
                moveIntent.putExtra("basic", data.basicname)
                moveIntent.putExtra("basicicon", data.iconbasic)
                moveIntent.putExtra("basicdesc", data.basicdesc)
                moveIntent.putExtra("Ename", data.Ename)
                moveIntent.putExtra("Eicon", data.iconE)
                moveIntent.putExtra("Edesc", data.Edesc)
                moveIntent.putExtra("burst", data.burstname)
                moveIntent.putExtra("bursticon", data.iconburst)
                moveIntent.putExtra("burstdesc", data.burstdesc)
                startActivity(moveIntent)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewHeroAdapter(list)
        rvHeroes.adapter = cardViewHeroAdapter

        cardViewHeroAdapter.setOnitemClickCallback(object : CardViewHeroAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Hero) {
                showSelectedHero(data)
                val moveIntent = Intent(this@MainActivity, AlbedoPage::class.java)
                moveIntent.putExtra("namehero", data.heroName)
                moveIntent.putExtra("herodesc", data.heroDetail)
                moveIntent.putExtra("birth", data.herobirthday)
                moveIntent.putExtra("img", data.heroImage)
                moveIntent.putExtra("pang", data.heronick)
                moveIntent.putExtra("herovoice", data.herovc)
                moveIntent.putExtra("herovoicename", data.herovcname)
                moveIntent.putExtra("basic", data.basicname)
                moveIntent.putExtra("basicicon", data.iconbasic)
                moveIntent.putExtra("basicdesc", data.basicdesc)
                moveIntent.putExtra("Ename", data.Ename)
                moveIntent.putExtra("Eicon", data.iconE)
                moveIntent.putExtra("Edesc", data.Edesc)
                moveIntent.putExtra("burst", data.burstname)
                moveIntent.putExtra("bursticon", data.iconburst)
                moveIntent.putExtra("burstdesc", data.burstdesc)
                startActivity(moveIntent)
            }
        })
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedHero(hero: Hero) {
        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
    }



}