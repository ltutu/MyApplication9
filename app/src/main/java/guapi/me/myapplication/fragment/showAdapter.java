package guapi.me.myapplication.fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import guapi.me.myapplication.R;



/**
 * Created by apple on 2018/6/23.
 * 资讯页面recyclerView的Adapter
 */

public class showAdapter extends RecyclerView.Adapter<showAdapter.showViewHolder>{
    private Context mCtx;
    private List<show> showList;

    public showAdapter(Context mCtx,List<show> showList){
        this.mCtx = mCtx;
        this.showList = showList;
    }

    @Override
    public showViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout,null);
        return new showViewHolder(view);

    }

    @Override
    public void onBindViewHolder(showViewHolder holder,int position){
        show mshow = showList.get(position);
        holder.textViewShortDesc.setText(mshow.getShortdesc());
        holder.imageView.setImageDrawable(mCtx.getDrawable(mshow.getImage()));
        holder.textViewDate.setText(mshow.getDate());
    }

    @Override
    public int getItemCount(){
        return showList.size();
    }

    class showViewHolder extends RecyclerView.ViewHolder{
        TextView textViewShortDesc,textViewDate;
        ImageView imageView;
        public showViewHolder(View itemView ){
            super(itemView);
            textViewShortDesc = itemView.findViewById(R.id.textViewTitle);
            textViewDate = itemView.findViewById(R.id.textViewDate);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
