package hackon.lifetime.shopon.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.databinding.FragmentThanksBinding
import hackon.lifetime.shopon.products

class ThanksFragment : Fragment() {

    private var _binding: FragmentThanksBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThanksBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var product: Product? = null
        arguments?.let{
            val args = CheckoutFragmentArgs.fromBundle(it)
            product = products.find {args.id == it.id }
        }

        product?.let{

            with(it){
                binding.thanks.text = getString(R.string.thank_you_message, this.name)
                binding.continueShopping.setOnClickListener {
                    findNavController().navigate(R.id.action_thanks_to_home)
                }
            }
        }
    }
}