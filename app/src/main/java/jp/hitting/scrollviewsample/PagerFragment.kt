package jp.hitting.scrollviewsample

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class PagerFragment : Fragment() {

    var color: Int = Color.RED

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_pager, null)
        view.setBackgroundColor(this.color)
        return view
    }
    
}
