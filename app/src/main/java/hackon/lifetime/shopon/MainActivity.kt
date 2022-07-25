package hackon.lifetime.shopon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hackon.lifetime.shopon.fragments.Product

val products = mutableListOf<Product>(
    Product(
        1, "Sony TV", "44,900", R.drawable.tv,
        "FREE delivery by Wed, 10 Aug",
        "Enjoy you movies and series in full hd and also in 4k in this latest model.",
        4.5f, "1,210"
    ),
    Product(
        2, "Washing Machine", "26,990", R.drawable.washing_machine,
        "FREE delivery by Thu, 11 Aug",
        "Wash your all clothes with ease in this latest automatic model of washing machine.",
        4f, "895"
    ),
    Product(
        3, "Wheeler Chair", "6,500", R.drawable.chair,
        "FREE delivery by Mon, 8 Aug",
        "Do your work by sitting in this comfortable chair and say goodbye to your  back pain.",
        3.5f, "4,752"
    ),
    Product(
        4, "Two Door Wardrobe", "2,500", R.drawable.wardrobe,
        "FREE delivery by Wed, 10 Aug",
        "Put your all clothes and some other materials in this wardrobe.",
        4f, "14,396"
    ),
    Product(
        5, "Comfy Sofa", "27,880", R.drawable.sofa1,
        "FREE delivery by Tue, 9 Aug",
        "Make your guest comfortable at home in this soft sofa..",
        4.5f, "257"
    ),
    Product(
        6, "Small Sofa", "6,500", R.drawable.sofa2,
        "FREE delivery by Wed, 10 Aug",
        "Make your guest comfortable at home in this soft sofa..",
        4f, "1,664"
    ),
    Product(
        7, "Cooking oven", "2,500", R.drawable.oven,
        "FREE delivery by Fri, 12 Aug",
        "Good oven.",
        3.5f, "578"
    ),
    Product(
        8, "Sitting Sofa", "15,000", R.drawable.sofa,
        "FREE delivery by Thu, 11 Aug",
        "Make your guest comfortable at home in this soft sofa.",
        4.5f, "734"
    )
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}