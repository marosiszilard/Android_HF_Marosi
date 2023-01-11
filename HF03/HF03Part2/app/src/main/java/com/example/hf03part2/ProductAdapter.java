package com.example.hf03part2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    private ArrayList<Product> localDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nameTxtView;
        private final TextView codeTxtView;
        private final TextView priceTxtView;

        public ViewHolder(View view) {
            super(view);

            nameTxtView = (TextView) view.findViewById(R.id.txtName);
            codeTxtView = view.findViewById(R.id.txtCode);
            priceTxtView = view.findViewById(R.id.txtPrice);
        }

        public TextView getNameTxtView() {
            return nameTxtView;
        }
        public TextView getCodeTxtView(){
            return codeTxtView;
        }
        public TextView getPriceTxtView(){
            return  priceTxtView;
        }
    }

    public ProductAdapter(ArrayList<Product> dataSet) {
        localDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        viewHolder.getNameTxtView().setText(localDataSet.get(position).name);
        viewHolder.getCodeTxtView().setText(localDataSet.get(position).code);
        viewHolder.getPriceTxtView().setText(String.valueOf(localDataSet.get(position).price));
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
