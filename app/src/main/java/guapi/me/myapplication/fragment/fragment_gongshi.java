package guapi.me.myapplication.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import guapi.me.myapplication.R;

/**
 * Created by apple on 2018/6/21.
 */

public class fragment_gongshi extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saveInstanceState)
    {
        return inflater.inflate(R.layout.fragment_gongshi,group,false);
    }
}