package eastbound.yokijatiperkasa.theweeb.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eastbound.yokijatiperkasa.theweeb.R
import eastbound.yokijatiperkasa.theweeb.home.HomeFragment

class ExploreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): ExploreFragment {
            val fragment = ExploreFragment()
            fragment.arguments = Bundle()
            return fragment
        }
    }
}