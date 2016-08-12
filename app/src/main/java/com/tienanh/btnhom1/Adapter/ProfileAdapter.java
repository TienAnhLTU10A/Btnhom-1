package com.tienanh.btnhom1.Adapter;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tienanh.btnhom1.Activities.Header;
import com.tienanh.btnhom1.Activities.ItemProfile;
import com.tienanh.btnhom1.R;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RecursiveAction;

/**
 * Created by Veteran Commander on 8/10/2016.
 */
public class ProfileAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public List<Object> itemList;
    int VIEWTYPE;
    public final int HEADER = 0;
    public final int ITEMPROFILE = 1;

    public class HeaderViewHolder extends RecyclerView.ViewHolder {
        public TextView userName, mota;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            userName = (TextView) itemView.findViewById(R.id.tvUserName);
            mota = (TextView) itemView.findViewById(R.id.tvMota);
        }
        public void bind(Header header){
            userName.setText(header.userName);
            mota.setText(header.mota);

        }
    }

    public ProfileAdapter(List<Object> items) {
        this.itemList = items;
    }

    public class ItemProfileViewHolder extends RecyclerView.ViewHolder {
        public TextView itemtitle, itemContent;

        public ItemProfileViewHolder(View itemView) {
            super(itemView);
            itemtitle = (TextView) itemView.findViewById(R.id.tv_item_title);
            itemContent = (TextView) itemView.findViewById(R.id.tv_item_desc);
        }
        public void bind(ItemProfile item){
            itemtitle.setText(item.Title);
            itemContent.setText(item.Content);

        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder vViewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case HEADER:
                vViewHolder = new HeaderViewHolder(inflater.inflate(R.layout.header, parent, false));
                break;
            case ITEMPROFILE:
                vViewHolder = new ItemProfileViewHolder(inflater.inflate(R.layout.item_profile, parent, false));
                break;
            default:
                vViewHolder = null;
                break;

        }
        return vViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()){
            case HEADER:
                HeaderViewHolder vh1 = (HeaderViewHolder) holder;
                Header hd = (Header)itemList.get(position);
                vh1.bind(hd);
                break;
            case ITEMPROFILE:
                ItemProfileViewHolder vh2 = (ItemProfileViewHolder) holder;
                ItemProfile itpf = (ItemProfile) itemList.get(position);
                vh2.bind(itpf);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HEADER;
        } else if (position != 0) {
            return ITEMPROFILE;
        }
        return -1;
    }
}
