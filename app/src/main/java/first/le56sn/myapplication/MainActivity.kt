package first.le56sn.myapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

const val TAG="MainActivity"

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    Log.d(TAG,"Буря мглою небо кроет")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Вихри снежные крутя")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"То, как зверь, она завоет")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"То заплачет, как дитя")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"То по кровле обветшалой")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"Буря мглою небо кроет")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Вдруг соломой зашумит")

    }
}

