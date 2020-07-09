package com.example.sprintpressing.ui.washandiron

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.sprintpressing.R
import com.example.sprintpressing.ui.washandiron.annimations.ZoomOutPageTransformer
import com.example.sprintpressing.ui.washandiron.children.ChildrenFragmen
import com.example.sprintpressing.ui.washandiron.men.MenFragment
import com.example.sprintpressing.ui.washandiron.other.OtherFragment
import com.example.sprintpressing.ui.washandiron.women.WomenFragment
import kotlinx.android.synthetic.main.wash_and_iron_fragment.*


class WashAndIronFragment : Fragment() {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private  val NUM_PAGES = 5
    companion object {
        fun newInstance() = WashAndIronFragment()
    }
    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private lateinit var mPager: ViewPager

    private lateinit var viewModel: WashAndIronViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wash_and_iron_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Instantiate a ViewPager and a PagerAdapter.
        mPager = vpPager as ViewPager

        // The pager adapter, which provides the pages to the view pager widget.
        val pagerAdapter = MyPagerAdapter(fragmentManager!!)
        mPager.setPageTransformer(true, ZoomOutPageTransformer())
        mPager.adapter = pagerAdapter
    }
    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
        class MyPagerAdapter(fragmentManager: FragmentManager?) :
            FragmentPagerAdapter(fragmentManager!!) {
            // Returns total number of pages
            override fun getCount(): Int {
                return NUM_ITEMS
            }

            // Returns the fragment to display for that page
            override fun getItem(position: Int): Fragment {
                return when (position) {
                    0 -> MenFragment.newInstance(0, "Men")
                    1 -> WomenFragment.newInstance(1, "Women")
                    2 -> ChildrenFragmen.newInstance(2, "Children")
                    3 -> OtherFragment.newInstance(3, "Other")
                    else -> MenFragment.newInstance(0, "Men")
                }
            }

            // Returns the page title for the top indicator
            override fun getPageTitle(position: Int): CharSequence? {
                return when (position) {
                    0 -> "Men"
                    1 -> "Women"
                    2 -> "Children"
                    3 -> "Other"
                    else -> "Men"
                }
            }

            companion object {
                private const val NUM_ITEMS = 4
            }
        }

}
