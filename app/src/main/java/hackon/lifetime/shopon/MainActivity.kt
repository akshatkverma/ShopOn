package hackon.lifetime.shopon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hackon.lifetime.shopon.fragments.Product

val products = mutableListOf<Product>(
    Product(
        1, "Wooden Chair", "4,900", R.drawable.wooden_chair,
        "FREE delivery by Wed, 10 Aug",
        "Acacia Wood and Natural Cane Weaving",
        4.5f, "1,210",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/chair.glb?alt=media&token=e32cf525-ee71-4490-a38e-0c42f49be3b2"
    ),
    Product(
        2, "Table", "9,999", R.drawable.table,
        "FREE delivery by Thu, 11 Aug",
        "Crafted of Oak wood legs, the sleek veneer top showcases a rick woodgrain finish.",
        4f, "895",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/canteenTable.glb?alt=media&token=c6d913d9-847c-4e4c-8907-51ccf0b56c96"
    ),
    Product(
        3, "Pedestal Fan", "6,500", R.drawable.pedestal_fan,
        "FREE delivery by Mon, 8 Aug",
        "Pedestal Fan Wind Storm 18 inch features a powerful energy efficient heavy duty motor, telescopic height adjustment and three-speed control.",
        3.5f, "4,752",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/coolerfan(without-defense).glb?alt=media&token=9ec989b7-82da-4892-b2b6-926fa7dd3f92"
    ),
    Product(
        4, "Two Door Wardrobe", "2,500", R.drawable.wardrobe,
        "FREE delivery by Wed, 10 Aug",
        "Put your all clothes and some other materials in this wardrobe.",
        4f, "14,396","https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Evian.glb?alt=media&token=f9af2017-4154-4a6a-b961-ac1fec5e8bd3"
    ),
    Product(
        5, "Comfy Sofa", "27,880", R.drawable.sofa1,
        "FREE delivery by Tue, 9 Aug",
        "Make your guest comfortable at home in this soft sofa..",
        4.5f, "257","https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Evian.glb?alt=media&token=f9af2017-4154-4a6a-b961-ac1fec5e8bd3"
    ),
    Product(
        6, "Small Sofa", "6,500", R.drawable.sofa2,
        "FREE delivery by Wed, 10 Aug",
        "Make your guest comfortable at home in this soft sofa..",
        4f, "1,664","https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Evian.glb?alt=media&token=f9af2017-4154-4a6a-b961-ac1fec5e8bd3"
    ),
    Product(
        7, "Cooking oven", "2,500", R.drawable.oven,
        "FREE delivery by Fri, 12 Aug",
        "Good oven.",
        3.5f, "578","https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Evian.glb?alt=media&token=f9af2017-4154-4a6a-b961-ac1fec5e8bd3"
    ),
    Product(
        8, "Sitting Sofa", "15,000", R.drawable.sofa,
        "FREE delivery by Thu, 11 Aug",
        "Make your guest comfortable at home in this soft sofa.",
        4.5f, "734","https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Evian.glb?alt=media&token=f9af2017-4154-4a6a-b961-ac1fec5e8bd3"
    )
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}