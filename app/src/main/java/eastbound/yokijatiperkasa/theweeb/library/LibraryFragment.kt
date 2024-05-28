package eastbound.yokijatiperkasa.theweeb.library

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eastbound.yokijatiperkasa.theweeb.R
import eastbound.yokijatiperkasa.theweeb.home.HomeFragment

class LibraryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): LibraryFragment {
            val fragment = LibraryFragment()
            fragment.arguments = Bundle()
            return fragment
        }
    }
}