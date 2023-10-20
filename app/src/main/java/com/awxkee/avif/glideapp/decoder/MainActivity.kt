package com.awxkee.avif.glideapp.decoder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.awxkee.avif.glideapp.decoder.databinding.ActivityMainBinding
import com.awxkee.avif.glideapp.decoder.ui.theme.AvifGlideAppDecoderTheme
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //https://wh.aimuse.online/creatives/IMUSE_03617fe2db82a584166_27/TT_a9d21ff1061d785347935fef/68f06252.avif
        //https://wh.aimuse.online/preset/federico-beccari.avif
        // https://wh.aimuse.online/preset/avif10bit.avif

        Glide.with(this)
            .load("https://wh.aimuse.online/preset/avif10bit.avif")
            .skipMemoryCache(true)
            .into(binding.imageView)
    }
}