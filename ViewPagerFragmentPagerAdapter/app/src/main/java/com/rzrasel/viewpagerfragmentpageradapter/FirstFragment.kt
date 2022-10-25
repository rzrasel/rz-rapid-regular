package com.rzrasel.viewpagerfragmentpageradapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment : Fragment() {
    private var title: String? = null
    private var page = 0

    companion object {
        //fun newInstance(position: Int): FirstFragment {
        fun newInstance(page: Int, title: String): FirstFragment {
            val fragment = FirstFragment()
            val args = Bundle()
            args.putInt("some_int_value", page)
            args.putString("some_text_value", title)
            fragment.arguments = args
            return fragment
        }
    }

    // newInstance constructor for creating fragment with arguments
    /*fun newInstance(page: Int, title: String?): FirstFragment? {
        val fragmentFirst = FirstFragment()
        val args = Bundle()
        args.putInt("someInt", page)
        args.putString("someTitle", title)
        fragmentFirst.arguments = args
        return fragmentFirst
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        page = arguments?.getInt("some_int_value", 0)!!
        title = arguments?.getString("some_text_value")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)

        //val view = inflater.inflate(android.R.layout.fragment_first, container, false)
        val rootView = inflater.inflate(R.layout.fragment_first, container, false)
        val sysTextView = rootView!!.findViewById(R.id.sysTextView) as TextView
        sysTextView.text = "$page -- $title"
        return rootView
    }
}