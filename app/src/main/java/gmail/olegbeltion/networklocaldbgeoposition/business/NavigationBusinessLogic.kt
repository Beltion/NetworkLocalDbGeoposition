package gmail.olegbeltion.networklocaldbgeoposition.business

import androidx.fragment.app.Fragment
import gmail.olegbeltion.core.business.logic.BasePresenter
import gmail.olegbeltion.core.business.logic.BaseView

//  NavigationActivity runs when App start.
//  This activity responsible for changing content, navigation
//  between NetworkFragment, StorageFragment, GeoFragment

interface NavigationPresenter: BasePresenter{
    fun initView(view: NavigationView)
    fun onBottomNavClick(id: Int)
}

interface NavigationView: BaseView {
    fun changeFragment(f: Fragment)
    fun showToast(s: String)
    fun getStringFromId(id: Int)
}