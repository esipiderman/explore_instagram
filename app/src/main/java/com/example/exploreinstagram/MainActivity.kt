package com.example.exploreinstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.exploreinstagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val URL = listOf<String>(
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food1.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food2.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food3.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food4.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food5.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food6.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food7.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food8.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food9.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food10.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food11.jpg",
            "https://dunijet.ir/YaghootAndroidFiles/DuniFoodSimple/food12.jpg",
            "https://images.all-free-download.com/images/graphiclarge/food_picture_03_hd_pictures_167556.jpg",
            "https://images.squarespace-cdn.com/content/v1/5c477351f8370ad5312a4088/1548192258528-WF6X0KEV81AA7DB7P0ZL/all+food.jpg",
            "https://images.squarespace-cdn.com/content/v1/574c5073f8baf34bebdaf961/1624528867854-94KFAM0RWIZ8GKP6YGK4/_DSC9387.jpg",
            "https://images.squarespace-cdn.com/content/v1/574c5073f8baf34bebdaf961/1624528867854-94KFAM0RWIZ8GKP6YGK4/_DSC9387.jpg",
            "https://images.saymedia-content.com/.image/t_share/MTc0NDI3ODYxNzA3NDY2MDg4/30-foods-you-should-eat-in-kenya.jpg",
            "https://arasbaran.org/en/mi_news/show/1393/09/Big/72-92.jpg"
        )
        if ( NetworkChecker(this).isNetworkConnected ){

            val glide = Glide.with(this)

            glide
                .load(URL[0])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView)

            glide
                .load(URL[1])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView2)

            glide
                .load(URL[2])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView3)

            glide
                .load(URL[3])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView4)

            glide
                .load(URL[4])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView5)

            glide
                .load(URL[5])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView6)

            glide
                .load(URL[6])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView7)

            glide
                .load(URL[7])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView8)

            glide
                .load(URL[8])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView9)

            glide
                .load(URL[9])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView10)

            glide
                .load(URL[10])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView11)

            glide
                .load(URL[11])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView12)

            glide
                .load(URL[12])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView13)

            glide
                .load(URL[13])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView14)

            glide
                .load(URL[14])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView15)

            glide
                .load(URL[15])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView16)

            glide
                .load(URL[16])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView17)

            glide
                .load(URL[17])
                .placeholder(R.drawable.img_loading)
                .error(R.drawable.img_error)
                .into(binding.imageView18)

        }else{
            Toast.makeText(this, "turn on your internet", Toast.LENGTH_LONG).show()
        }
    }
}