package jp.hitting.scrollviewsample

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import kotlinx.android.synthetic.main.fragment_pager.view.*

class PagerFragment : Fragment() {

    var color: Int = Color.RED

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.fragment_pager, null)
        view.setBackgroundColor(this.color)
        this.addAction(view)
        return view
    }

    private fun addAction(view: View) {
        val scrollView = view.findViewById<ScrollView>(R.id.scrollView)
        val scrollToBottomButton = scrollView.scrollToBottomButton
        val scrollToTopButton = scrollView.scrollToTopButton
        val smoothScrollToBottomButton = scrollView.smoothScrollToBottomButton
        val smoothScrollToTopButton = scrollView.smoothScrollToTopButton

        scrollToBottomButton.setOnClickListener {
            scrollView.scrollTo(0, scrollToTopButton.y.toInt())
        }
        scrollToTopButton.setOnClickListener {
            scrollView.scrollTo(0, 0)
        }

        smoothScrollToBottomButton.setOnClickListener {
            scrollView.smoothScrollTo(0, scrollToTopButton.y.toInt())
        }
        smoothScrollToTopButton.setOnClickListener {
            scrollView.smoothScrollTo(0, 0)
        }
    }

}
