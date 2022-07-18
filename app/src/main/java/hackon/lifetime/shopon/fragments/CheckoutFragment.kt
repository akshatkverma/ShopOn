package hackon.lifetime.shopon.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.databinding.FragmentCheckoutBinding
import hackon.lifetime.shopon.products

class CheckoutFragment : Fragment() {

    private var _binding: FragmentCheckoutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCheckoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var product: Product? = null
        arguments?.let { it ->
            val args = CheckoutFragmentArgs.fromBundle(it)
            product = products.find { args.id == it.id }
        }

        product?.let {

            with(it) {
                binding.productName.text = name
                binding.productPrice.text = getString(R.string.product_price, price)
                binding.orderTotal.text = getString(R.string.order_total, price)
                binding.productImage.setImageResource(imageId)

                binding.checkout.setOnClickListener {
                    findNavController().navigate(
                        CheckoutFragmentDirections.actionCheckoutToThanks(
                            this.id
                        )
                    )
                }
            }
        }
    }
}
