package hackon.lifetime.shopon.models

data class Product
    (
    val id: Int,
    val name: String,
    val price: String,
    val imageId: Int,
    val delivery: String,
    val longDescription: String,
    val rating: Float,
    val ratingCount: String,
    val modelURL: String
)