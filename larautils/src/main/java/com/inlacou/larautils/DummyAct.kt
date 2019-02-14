package com.inlacou.larautils

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem

class DummyAct : Activity() {

	companion object {
		var layoutResId: Int? = null
		fun navigate(activity: Activity, layoutResId: Int) {
			activity.startActivity(intent(activity, layoutResId))
		}

		fun intent(activity: Activity, layoutResId: Int): Intent {
			val intent = Intent(activity, DummyAct::class.java)

			this.layoutResId = layoutResId

			return intent
		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		layoutResId.let {
			if(it==null){
				finish()
			}else{
				setContentView(it)
			}
		}
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			android.R.id.home -> {
				// app icon in action bar clicked; goto parent activity.
				this.finish()
				true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}
}
