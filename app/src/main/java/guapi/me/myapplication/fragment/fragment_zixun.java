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

public class fragment_zixun extends Fragment {
    List<show> showList;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle saveInstanceState)
    {
        return inflater.inflate(R.layout.fragment_zixun,group,false);
    }
    @Override
    public void onViewCreated(View view,Bundle saveInstance){
        super.onViewCreated(view,saveInstance);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        showList = new ArrayList<>();
        showList.add(new show(1,this.getString(R.string.desc1),"2018-6-22",R.drawable.dd22f));
        showList.add(new show(2,getContext().getString(R.string.desc2),"2018-6-22",R.drawable.ss11f));
        showList.add(new show(3,getContext().getString(R.string.desc3),"2018-6-22",R.drawable.hhh));
        showList.add(new show(4,getContext().getString(R.string.desc4),"2018-6-22",R.drawable.jiji));
        showList.add(new show(5,getContext().getString(R.string.desc5),"2018-6-22",R.drawable.kkk));

        recyclerView.setAdapter(new showAdapter(this.getContext(),showList));
    }
}