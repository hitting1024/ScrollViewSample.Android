package jp.hitting.scrollviewsample

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_pager)
        this.initLayout()
    }

    private fun initLayout() {
        val fragmentList = ArrayList<PagerFragment>()
        fragmentList.add(PagerFragment())
        fragmentList.add(PagerFragment())
        fragmentList.add(PagerFragment())

        val viewPager = this.findViewById<ViewPager>(R.id.viewPager)
        val pagerAdapter = PagerAdapter(fragmentList, this.supportFragmentManager)
        viewPager.adapter = pagerAdapter
    }

}
