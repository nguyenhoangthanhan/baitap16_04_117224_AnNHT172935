package com.andeptrai.assign9_4_annht20172935;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MailRCVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Mails> mailsList;
    ItemClickListenner listenner;

    public MailRCVAdapter(List<Mails> mailsList) {
        this.mailsList = mailsList;
    }

    public MailRCVAdapter(List<Mails> mailsList, ItemClickListenner listenner) {
        this.mailsList = mailsList;
        this.listenner = listenner;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_bt1, parent, false);
        return new MailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final Mails ma = mailsList.get(position);
        MailViewHolder viewHolder = (MailViewHolder)holder;
        String avt = String.valueOf(ma.getName().charAt(0));
        viewHolder.txt_avt.setText(avt);
        if (avt.equals("A") || avt.equals("B") || avt.equals("C") || avt.equals("D") || avt.equals("E") || avt.equals("F")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle);
        }
        else if(avt.equals("G") || avt.equals("H") || avt.equals("I") || avt.equals("J") || avt.equals("K")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle2);
        }
        else if(avt.equals("L") || avt.equals("M") || avt.equals("N") || avt.equals("O") || avt.equals("P")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle3);
        }
        else if(avt.equals("Q") || avt.equals("R") || avt.equals("S") || avt.equals("T") || avt.equals("U")){
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle4);
        }
        else{
            viewHolder.txt_avt.setBackgroundResource(R.drawable.img_circle5);
        }

        viewHolder.name.setText(ma.getName());
        viewHolder.content.setText(ma.getContent());
        if (ma.isSelect_star()){
            viewHolder.img_star.setImageResource(R.drawable.ic_star_yellow_24dp);
        }
        else{
            viewHolder.img_star.setImageResource(R.drawable.ic_star_border_gray_24dp);
        }

        viewHolder.img_star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mailsList.get(position).setSelect_star(!ma.isSelect_star());
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mailsList.size();
    }

    class MailViewHolder extends RecyclerView.ViewHolder{
        TextView txt_avt;
        TextView name;
        TextView content;
        ImageView img_star;



        public MailViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_avt = itemView.findViewById(R.id.img_circle1);
            name = itemView.findViewById(R.id.txt_fullname);
            content = itemView.findViewById(R.id.txt_content);
            img_star = itemView.findViewById(R.id.img_star);



        }
    }
}
