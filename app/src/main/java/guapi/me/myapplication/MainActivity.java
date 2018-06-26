package guapi.me.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.app.Fragment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import guapi.me.myapplication.fragment.fragment_gongshi;
import guapi.me.myapplication.fragment.fragment_jindu;
import guapi.me.myapplication.fragment.fragment_wode;
import guapi.me.myapplication.fragment.fragment_zixun;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;
    private List<Fragment> mFragments = new ArrayList<>();
    private Fragment mzixun;
    private Fragment mgongshi;
    private Fragment mjindu;
    private Fragment mwode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mzixun = new fragment_zixun();
        mgongshi = new fragment_gongshi();
        mjindu = new fragment_jindu();
        mwode = new fragment_wode();

        mFragments.add(mzixun);
        mFragments.add(mgongshi);
        mFragments.add(mjindu);
        mFragments.add(mwode);

        initView();
    }

    private void initView() {
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        //mBottomNavigationView.getMaxItemCount()

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                onTabItemSelected(item.getItemId());
                return true;
            }
        });

        // 由于第一次进来没有回调onNavigationItemSelected，因此需要手动调用一下切换状态的方法
        onTabItemSelected(R.id.navigation_zixun);
    }

    private void onTabItemSelected(int id) {
        Fragment fragment = null;
        switch (id) {
            case R.id.navigation_zixun:
                fragment = mFragments.get(0);
                break;
            case R.id.navigation_gongshi:
                fragment = mFragments.get(1);
                break;

            case R.id.navigation_jindu:
                fragment = mFragments.get(2);
                break;
            case R.id.navigation_wode:
                fragment = mFragments.get(3);
                break;
        }
        if (fragment != null) {
            getFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
        }
    }
}
