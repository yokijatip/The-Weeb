package eastbound.yokijatiperkasa.theweeb.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import eastbound.yokijatiperkasa.theweeb.R
import eastbound.yokijatiperkasa.theweeb.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTopAnimeSeeAll.setOnClickListener {
            Toast.makeText(requireContext(), "Waduh kamu klik aku 🫵😭", Toast.LENGTH_SHORT).show()
        }



    }

    companion object {
        fun newInstance(): HomeFragment {
            val fragment = HomeFragment()
            fragment.arguments = Bundle()
            return fragment
        }
    }
}