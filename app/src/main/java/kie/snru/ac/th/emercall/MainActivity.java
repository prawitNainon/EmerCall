package kie.snru.ac.th.emercall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kie.snru.ac.th.emercall.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//     add Fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment()).commit();

        }



    } //main Method

}  // main Class
