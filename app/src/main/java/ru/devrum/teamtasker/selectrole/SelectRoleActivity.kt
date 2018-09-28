package ru.devrum.teamtasker.selectrole

import android.content.Intent
import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import kotlinx.android.synthetic.main.activity_select_role.*
import com.arellomobile.mvp.presenter.InjectPresenter
import ru.devrum.teamtasker.R
import ru.devrum.teamtasker.masterlogin.MasterLoginActivity
import android.support.v4.content.ContextCompat.startActivity
import android.app.ActivityOptions
import android.os.Build




class SelectRoleActivity : MvpAppCompatActivity(), SelectRoleView {

    @InjectPresenter
    lateinit var mSelectRolePresenter: SelectRolePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_role)

        llCreateProject.isLongClickable = true
        llJoinProject.isLongClickable = true

        llCreateProject.setOnClickListener {mSelectRolePresenter.onCreateNewProject() }
        llJoinProject.setOnClickListener {mSelectRolePresenter.onJoinProject()}
    }

    override fun onSelectNewProjectRole() {
//        var bundle: Bundle? = null
//
//        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
//            if (tvLogo != null) {
//                val options = ActivityOptions.makeSceneTransitionAnimation(this, tvLogo, getString(R.string.trans_obj_logo))
//                bundle = options.toBundle()
//            }
//        }

        val intent = Intent(this, MasterLoginActivity::class.java)
//        if (bundle == null) {
            startActivity(intent)
//        } else {
//            startActivity(intent, bundle)
//        }



    }

    override fun onSelectJoinProjectRole() {

    }


}
