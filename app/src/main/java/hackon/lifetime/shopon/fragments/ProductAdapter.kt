package hackon.lifetime.shopon.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import hackon.lifetime.shopon.R


class ProductAdapter(private val listener: (Product) -> Unit) :
    ListAdapter<Product, ProductAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductAdapter.ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(val containerView: View) :
        RecyclerView.ViewHolder(containerView) {

        init {
            itemView.setOnClickListener {
                listener.invoke(getItem(adapterPosition))
            }
        }

        val product_image: ImageView = containerView.findViewById(R.id.product_image)
        val product_name: TextView = containerView.findViewById(R.id.product_name)
        val product_price: TextView = containerView.findViewById(R.id.product_price)
        val product_description: TextView = containerView.findViewById(R.id.product_description)

        fun bind(countryData: Product) {
            with(countryData) {
                product_image.setImageResource(imageId)
                product_name.text = name
                product_price.text = itemView.context.getString(R.string.product_price, price)
                product_description.text = shortDescription
            }
        }
    }
}

class DiffCallback : DiffUtil.ItemCallback<Product>() {
    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.imageId == newItem.imageId
    }

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }
}