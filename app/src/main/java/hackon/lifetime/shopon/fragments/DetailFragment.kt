package hackon.lifetime.shopon.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.databinding.FragmentDetailBinding
import hackon.lifetime.shopon.products


class DetailFragment : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var product: Product? = null


        arguments?.let{
            val args = DetailFragmentArgs.fromBundle(it)
            product = products.find {args.id == it.id }
        }

        product?.let{
            with(it){
                binding.include.productName.text = name
                binding.include.productPrice.text = getString(R.string.product_price, price)
                binding.include.productDescription.text = shortDescription
                binding.include.productDescription.text = longDescription
                binding.include.productImage.setImageResource(imageId)

                binding.buy.setOnClickListener {
                    findNavController().navigate(DetailFragmentDirections.actionDetailToCheckout(this.id))
                }
            }
        }
    }
}
