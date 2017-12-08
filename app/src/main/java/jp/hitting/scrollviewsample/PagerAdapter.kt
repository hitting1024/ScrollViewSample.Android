package jp.hitting.scrollviewsample

import android.graphics.Color
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class PagerAdapter(val fragmentList: List<PagerFragment>, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    val colors = arrayOf(Color.RED, Color.GREEN, Color.BLUE)

    override fun getItem(position: Int): Fragment {
        val fragment = this.fragmentList[position]
        fragment.color = colors[position % colors.size]
        return fragment
    }

    override fun getCount(): Int {
        return this.fragmentList.count()
    }

}
