package hackon.lifetime.shopon.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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


        arguments?.let { it ->
            val args = DetailFragmentArgs.fromBundle(it)
            product = products.find { args.id == it.id }
        }

        product?.let {
            with(it) {
                binding.productName.text = name
                binding.productPrice.text = price
                binding.productFullDescription.text = longDescription
                binding.productImage.setImageResource(imageId)

                binding.virtual.setOnClickListener {
                    val sceneViewerIntent = Intent(Intent.ACTION_VIEW)
                    sceneViewerIntent.data =
                        Uri.parse("https://arvr.google.com/scene-viewer/1.0?file=https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Avocado/glTF/Avocado.gltf")
                    sceneViewerIntent.setPackage("com.google.android.googlequicksearchbox")
                    startActivity(sceneViewerIntent)
                }
            }
        }
    }
}
