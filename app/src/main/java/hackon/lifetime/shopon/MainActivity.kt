package hackon.lifetime.shopon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product

val products = mutableListOf(
    Product(
        1, "Wooden Chair", "4,900", R.drawable.wooden_chair,
        "FREE delivery by Wed, 10 Aug",
        "Acacia Wood and Natural Cane Weaving",
        4.5f, "1,210",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/chair.glb?alt=media&token=e32cf525-ee71-4490-a38e-0c42f49be3b2"
    ),
    Product(
        2, "Canteen Table", "4,500", R.drawable.table,
        "FREE delivery by Thu, 11 Aug",
        "Crafted of Oak wood legs, the sleek veneer top showcases a rick woodgrain finish.",
        4f, "895",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/canteenTable.glb?alt=media&token=c6d913d9-847c-4e4c-8907-51ccf0b56c96"
    ),
    Product(
        3, "Pedestal Fan", "3,200", R.drawable.pedestal_fan,
        "FREE delivery by Mon, 8 Aug",
        "Pedestal Fan Wind Storm 18 inch features a powerful energy efficient heavy duty motor, telescopic height adjustment and three-speed control.",
        3.5f, "4,752",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/coolerfan(without-defense).glb?alt=media&token=9ec989b7-82da-4892-b2b6-926fa7dd3f92"
    ),
    Product(
        4, "Mobile Tripod", "500", R.drawable.tripod_image,
        "FREE delivery by Wed, 10 Aug",
        "360 degree rotation, easy to carry, easy to use and Good Stability and has powerful absorption and deformation functions suitable for mobile phone up to 6 inches.",
        4f, "14,396",
        "https://firebasestorage.googleapis.com/v0/b/whatschat-1348c.appspot.com/o/Tripod%20Grip.glb?alt=media&token=c8c8650f-8980-4848-ba46-130b7d90cc83"
    ),
    Product(
        5, "Office Chair", "11,880", R.drawable.office_chair,
        "FREE delivery by Tue, 9 Aug",
        "Chair with lumbar support and pneumatic gas lift for height adjustment and 360 degree swivel.",
        4.5f, "257",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/chair.glb?alt=media&token=ca3b84fa-e8b2-4c85-bff1-1b0b63272c1e"
    ),
    Product(
        6, "Bar Chair", "5,500", R.drawable.bar_chair,
        "FREE delivery by Wed, 10 Aug",
        "Stable And Sturdy Bar chair - With a built-in 360 degree swivel. High density foam upholstered in leatherette.",
        4f, "1,664",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/bar_chair.glb?alt=media&token=f17deee7-1bff-4ff0-86ea-9542f68146cb"
    ),
    Product(
        7, "Park Bench", "12,500", R.drawable.park_bench_photo,
        "FREE delivery by Fri, 12 Aug",
        "The large garden bench seat pad offers the perfect mix of appearance and functionality",
        3.5f, "578",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/park_bench.glb?alt=media&token=8afb7436-7dc2-411e-9b9a-3583c076fc8f"
    ),
    Product(
        8, "Microwave Oven", "15,000", R.drawable.oven_photo,
        "FREE delivery by Thu, 11 Aug",
        "GRILL, BAKE & TOAST - Use the oven for baking cakes, pizzas and pastas, grilling vegetables, roasting potatoes, chicken, paneer or simply toasting bread.",
        4.5f, "734",
        "https://firebasestorage.googleapis.com/v0/b/aadhar-address-updation.appspot.com/o/oven.glb?alt=media&token=116d796f-9619-45c2-b170-9704520c7582"
    )
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}