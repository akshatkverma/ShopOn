package hackon.lifetime.shopon.fragments

data class Product
    (val id: Int,
     val name: String,
     val price: Float,
     val imageId: Int,
     val shortDescription: String,
     val longDescription: String)