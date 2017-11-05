package com.mg.axechen.flowlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.ActionMenuView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var flowLayout: FlowLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        flowLayout = findViewById(R.id.flowLayout)
        addViewItem()
    }

    private fun addViewItem() {
        var views: ArrayList<View> = ArrayList()
        for (i in 0..10) {
            var textView: TextView = TextView(this)

            if (i % 2 == 0)
                textView.text = "我不同" + i
            else
                textView.text = "尘封的落叶" + i

            textView.setPadding(10, 10, 10, 10)
            var margin = ViewGroup.MarginLayoutParams(ActionMenuView.LayoutParams.WRAP_CONTENT, ActionMenuView.LayoutParams.WRAP_CONTENT)
            margin.rightMargin = 10
            margin.topMargin = 10
            margin.leftMargin = 10
            margin.bottomMargin = 10
            textView.layoutParams = margin

            textView.setBackgroundResource(R.drawable.dynamic_item_shap)
            views.add(textView)
        }
        flowLayout.addItems(views)
    }
}
