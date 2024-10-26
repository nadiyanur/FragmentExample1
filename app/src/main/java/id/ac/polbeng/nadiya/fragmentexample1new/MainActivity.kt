package id.ac.polbeng.nadiya.fragmentexample1new


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsCompat
import id.ac.polbeng.nadiya.fragmentexample1new.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Coordinator  {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBookChanged(index:Int) {
        val frag =
            supportFragmentManager.findFragmentById(R.id.fragment_book_description)
        if (frag is BookDescription) {
            frag.changeDescription(index)
        }
    }
}

