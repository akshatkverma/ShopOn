package hackon.lifetime.shopon.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.models.Product


class ProductAdapter(private val listener: (Product) -> Unit) :
    ListAdapter<Product, ProductAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(containerView: View) :
        RecyclerView.ViewHolder(containerView) {

        init {
            itemView.setOnClickListener {
                listener.invoke(getItem(adapterPosition))
            }
        }

        private val productImage: ImageView = containerView.findViewById(R.id.product_image)
        private val productName: TextView = containerView.findViewById(R.id.product_name)
        private val productPrice: TextView = containerView.findViewById(R.id.product_price)
        private val productDelivery: TextView = containerView.findViewById(R.id.product_delivery)
        private val rating4: ImageView = containerView.findViewById(R.id.rating4)
        private val rating5: ImageView = containerView.findViewById(R.id.rating5)
        private val productRatingCount: TextView = containerView.findViewById(R.id.rating_count)

        fun bind(countryData: Product) {
            with(countryData) {
                productImage.setImageResource(imageId)
                productName.text = name
                productPrice.text = price
                productDelivery.text = delivery
                if (rating <= 4) rating5.setImageResource(R.drawable.ic_baseline_star_outline_24)
                if (rating < 4) rating4.setImageResource(R.drawable.ic_baseline_star_half_24)
                productRatingCount.text = ratingCount
            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.imageId == newItem.imageId
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}