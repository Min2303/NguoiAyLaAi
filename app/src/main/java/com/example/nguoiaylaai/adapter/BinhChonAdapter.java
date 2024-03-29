package com.example.nguoiaylaai.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nguoiaylaai.R;
import com.example.nguoiaylaai.model.BinhChon;

import java.util.List;

public class BinhChonAdapter extends RecyclerView.Adapter<BinhChonAdapter.ViewHolder> {
    List<BinhChon> list;

    public BinhChonAdapter(List<BinhChon> listBinhChon) {
        this.list = listBinhChon;
    }


    @NonNull
    @Override
    public BinhChonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.profile,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BinhChonAdapter.ViewHolder holder, int position) {
        BinhChon i = list.get(position);
        holder.txtTen.setText(i.Ten);
        holder.txtDocThan.setText("Độc Thân : " + i.getCountDocThan());
        holder.txtDaCoChu.setText("Đã có chủ : " + i.getCountDaCoChu());
        holder.txtLGBT.setText("LGBT : "+ i.getCountLGBT());
        Context context = holder.HinhAnh.getContext();
        int imageID = context.getResources().getIdentifier(i.HinhAnh,"drawable", context.getPackageName());
        if(imageID != 0)
            holder.HinhAnh.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTen, txtDocThan, txtDaCoChu, txtLGBT ;
        ImageView HinhAnh;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTen = itemView.findViewById(R.id.txtTen);
            txtDocThan = itemView.findViewById(R.id.txtDocThan);
            txtDaCoChu = itemView.findViewById(R.id.txtDaCoChu);
            txtLGBT = itemView.findViewById(R.id.txtLGBT);
            HinhAnh = itemView.findViewById(R.id.HinhAnh);
        }
    }
}
