
package it.pontedoro.hce
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.LinearLayout
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL; setPadding(50,200,50,100) }
        val tv = TextView(this).apply { text = "Residenza Ponte d'Oro\nVia Sardegna 10\n\n${BuildConfig.NOME}\nID: ${BuildConfig.BADGE_ID}\n\nAvvicina questo telefono al tablet in reception per timbrare."; textSize = 20f }
        layout.addView(tv)
        setContentView(layout)
    }
}
