package ccom.ediddwi.ediactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindahActivityExplisit.setOnClickListener{
            startActivity(Intent(this, ExplisitIntentActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener{
            startActivity(Intent(this, ImplisitIntentActivity::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent: Intent = Intent(this, IntentBundleActivity::class.java)
            intent.putExtra("NAMAKU", "Edi Dwi Supratiyan")
            intent.putExtra("ALAMATKU", "Pati")
            intent.putExtra("HOBIKU", "Basketball")
            intent.putExtra("CITACITAKU", "Haji")
            intent.putExtra("FOTO", R.drawable.edi)
            intent.putExtra("EMAILKU", "edidwisupratiyan@gmail.com")
            startActivity(intent)
        }

    }
}

