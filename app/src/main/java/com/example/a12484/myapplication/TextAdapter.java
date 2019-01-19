package com.example.a12484.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class TextAdapter extends RecyclerView.Adapter<TextAdapter.ViewHolder> {
    private List<Text> mText;
    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView text;
        public ViewHolder(View view){
            super(view);
            text = (TextView) view.findViewById(R.id.text);
        }
    }
    public TextAdapter(List<Text> textList){
        mText=textList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Text texts = mText.get(position);
        holder.text.setText(texts.getContent());
        if (（getItemCount()-position）%2==0){
            holder.text.setBackgroundColor(0xffff00ff);
        }
        else{
            holder.text.setBackgroundColor(0xff00ff00);
    }

    @Override
    public int getItemCount() {
        return mText.size();
    }
}
