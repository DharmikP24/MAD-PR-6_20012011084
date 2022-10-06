import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import androidx.core.view.WindowCompat
import com.example.mad_pr_6_20012011084_myvideo.databinding.ActivityMainBinding
import java.net.URI
class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initVideoPlayer()
        binding.btnSwitch.setOnClickListener{
            Intent(this,youtubeActivity::class.java).apply {

                startActivity(this) }

        }
    }
    private fun initVideoPlayer(){
        var mediaController = MediaController(this)
        var

                uri=Uri.parse("android.resource://"+packageName+"/"+R.raw.thes
                toryoflight)

        binding.MyVideoView2.setMediaController(mediaControlle

                r)

        mediaController.setAnchorView(binding.MyVideoView2)
        binding.MyVideoView2.setVideoURI(uri)
        binding.MyVideoView2.requestFocus()
        binding.MyVideoView2.start()
    }
}