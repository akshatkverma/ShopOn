package hackon.lifetime.shopon.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hackon.lifetime.shopon.R
import hackon.lifetime.shopon.adapters.ProductAdapter
import hackon.lifetime.shopon.products


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_list, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val productList = view.findViewById<RecyclerView>(R.id.product_list).apply {

            layoutManager = LinearLayoutManager(activity)

            adapter = ProductAdapter {

                findNavController().navigate(ListFragmentDirections.actionHomeToDetail(it.id))
            }
            setHasFixedSize(true)
        }
        (productList.adapter as ProductAdapter).submitList(products)
    }
}
