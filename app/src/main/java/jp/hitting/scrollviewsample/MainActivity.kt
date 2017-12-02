package jp.hitting.scrollviewsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ScrollView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.addAction()
    }

    private fun addAction() {
        val scrollView = this.findViewById<ScrollView>(R.id.scrollView)
        val scrollToBottomButton = scrollView.scrollToBottomButton
        val scrollToTopButton = scrollView.scrollToTopButton
        val smoothScrollToBottomButton = scrollView.smoothScrollToBottomButton

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
