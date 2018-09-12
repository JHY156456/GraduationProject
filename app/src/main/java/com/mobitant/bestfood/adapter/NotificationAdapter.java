package com.mobitant.bestfood.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobitant.bestfood.MyApp;
import com.mobitant.bestfood.R;
import com.mobitant.bestfood.item.FoodInfoItem;
import com.mobitant.bestfood.item.NotificationItem;
import com.mobitant.bestfood.model.User;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter <NotificationAdapter.ViewHolder>{
    private Context context;
    private int resource;
    private ArrayList<NotificationItem> itemList;
    User memberInfoItem;
    /**
     * 어댑터 생성자
     * @param context 컨텍스트 객체
     * @param resource 아이템을 보여주기 위해 사용할 리소스 아이디
     * @param itemList 아이템 리스트
     */
    public NotificationAdapter(Context context, int resource, ArrayList<NotificationItem> itemList) {
        this.context = context;
        this.resource = resource;
        this.itemList = itemList;

        memberInfoItem = ((MyApp) context.getApplicationContext()).getUserItem();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.notification_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }
    /**
     * 현재 아이템 리스트에 새로운 아이템 리스트를 추가한다.
     * @param itemList 새로운 아이템 리스트
     */
    public void addItemList(ArrayList<NotificationItem> itemList) {
        this.itemList.addAll(itemList);
        notifyDataSetChanged();
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText("쉬벌");
    }

    @Override
    public int getItemCount() {
        return 2;
    }



    class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(View itemView) {

            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.notification_text);
        }
    }
}