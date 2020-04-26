package com.kai.navigationdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * The below code can be used to disable host fragment
         * Scenario: If host is login fragment post login you don't want to open login fragment.
         */
//        Navigation.findNavController(this,R.id.nav_host_fragment).navigate(R.id.action_firstFragment_to_secondFragment);
    }
}
