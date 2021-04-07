package com.example.mljvc_kotlin

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        initView()
        setAction()


    }

    private var backUpStudentArrayList: ArrayList<Student>? = null
    private var currentStudentArrayList: ArrayList<Student>? = null

    private var studentAdapter: StudentAdapter =

    private var editing: Boolean = false
    private var indexEditing: Int = -1
    private var idIndexEditing: Int = -1
    private var currentKey: String? = ""


    private fun setAction() {
    }

    private fun initView() {
    }

    fun Context.hideKeyboard(view: View) {
        val inputMethodManager=getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }


}