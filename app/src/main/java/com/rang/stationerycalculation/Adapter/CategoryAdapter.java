package com.rang.stationerycalculation.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.rang.stationerycalculation.Brouchers;
import com.rang.stationerycalculation.Envelope;
import com.rang.stationerycalculation.Flyers;
import com.rang.stationerycalculation.LetterHead;
import com.rang.stationerycalculation.MenuDesgin;
import com.rang.stationerycalculation.Model.CategoryModel;
import com.rang.stationerycalculation.MainActivity;
import com.rang.stationerycalculation.Posters;
import com.rang.stationerycalculation.R;
import com.rang.stationerycalculation.VistingCard;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {


        private List<CategoryModel> categoryModels;
        private  Context context;

//        public CategoryAdapter(List<CategoryModel> categoryModels1, Context applicationContext) {
//            this.categoryModels = categoryModels1;
//        }

    public CategoryAdapter(MainActivity mainActivity, List<CategoryModel> categoryModels) {
        this.categoryModels = categoryModels;
    }


    @Override
        public CategoryAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_category, parent, false);

            return new CategoryAdapter.ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(CategoryAdapter.ViewHolder holder, final int position) {
            holder.tvCatName.setText(categoryModels.get(position).getCatName());
            holder.ivCatImage.setImageResource(categoryModels.get(position).getCatImage());
//            holder.ivRemove.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    String itemLabel = String.valueOf(categoryModels.get(position));
//                    categoryModels.remove(position);
//                    notifyItemRemoved(position);
//                    notifyItemRangeChanged(position,categoryModels.size());
//
//                }
//            });
        }

        @Override
        public int getItemCount() {
            return categoryModels.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public TextView tvCatName;
            public ImageView ivCatImage;

            public ViewHolder(View view) {
                super(view);
                context = itemView.getContext();
                tvCatName = view.findViewById(R.id.tvCatName);
                ivCatImage = view.findViewById(R.id.ivCatImage);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = getAdapterPosition();

                        final Intent intent;
                        switch (position){
                            case 0:
                                intent =  new Intent(context, LetterHead.class);
                                break;

                            case 1:
                                intent =  new Intent(context, VistingCard.class);
                                break;
                            case 2:
                                intent =  new Intent(context, Envelope.class);
                                break;
                            case 3:
                                intent =  new Intent(context, Brouchers.class);
                                break;
                            case 4:
                                intent =  new Intent(context, Flyers.class);
                                break;
                            case 5:
                                intent =  new Intent(context, MenuDesgin.class);
                                break;
                            case 6:
                                intent =  new Intent(context, Posters.class);
                                break;
//                            case 7:
//                                intent =  new Intent(context, Ban.class);
//                                break;
                            default:
                                intent =  new Intent(context, MainActivity.class);
                                break;
                        }
                        context.startActivity(intent);

//                    Snackbar.make(v, "Click detected on item " + position,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
                    }
                });
            }
        }

    }



