package hackon.lifetime.shopon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hackon.lifetime.shopon.fragments.Product

val products = mutableListOf<Product>(Product(1, "Sony Tv", 45000F, R.drawable.tv,
    "Latest Model of Sony tv.",
    "Enjoy you movies and series in full hd and also in 4k in this latest model."),
    Product(2, "Washing Machine", 27000F, R.drawable.washing_machine,
        "washing help is here.",
        "Wash your all clothes with ease in this latest automatic model of washing machine."),
    Product(3, "Wheeler Chair", 6500F, R.drawable.chair,
        "Comfortable chair.",
        "Do your work by sitting in this comfortable chair and say goodbye to your  back pain."),
    Product(4, "2 Door Wardrobe", 2500F, R.drawable.wardrobe,
        "Small and Durable Wardrobe.",
        "Put your all clothes and some other materials in this wardrobe."),
    Product(5, "Beautiful Sofa", 27000F, R.drawable.sofa1,
        "washing help is here.",
        "Make your guest comfortable at home in this soft sofa.."),
    Product(6, "Small Sofa", 6500F, R.drawable.sofa2,
        "Small Sofa.",
        "Make your guest comfortable at home in this soft sofa.."),
    Product(7, "Cooking oven", 2500F, R.drawable.oven,
        "Something for kitchen.",
        "Good oven."),
    Product(8, "Sitting Sofa", 15000F, R.drawable.sofa,
        "Meet new sofa",
        "Make your guest comfortable at home in this soft sofa.")
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}