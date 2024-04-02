package com.example.tugasday6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.ViewHolder> {
    private ArrayList<PetModel> petModel;
    public Context context;
    public PetAdapter(ArrayList<PetModel> petModel, Context context) {
        this.petModel = petModel;
        this.context = context;
    }

    @NonNull
    @Override
    public PetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pet, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PetAdapter.ViewHolder holder, int position) {
        PetModel target = petModel.get(position);
        holder.jenisPet.setText(target.getJenis());
        holder.umurPet.setText(target.getUmur());
        holder.jenisKelaminPet.setText(target.getJenisKelamin());
        holder.hargaPet.setText(target.getHarga());
        holder.deskripsiPet.setText(target.getDeskripsi());
        holder.gambarPet.setImageResource(target.getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("jenis", target.getJenis());
                intent.putExtra("umur", target.getUmur());
                intent.putExtra("jenisKelamin", target.getJenisKelamin());
                intent.putExtra("harga", target.getHarga());
                intent.putExtra("deskripsi", target.getDeskripsi());
                intent.putExtra("gambar", target.getGambar());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return petModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView jenisPet, umurPet, jenisKelaminPet, hargaPet, deskripsiPet;
        ImageView gambarPet;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jenisPet = itemView.findViewById(R.id.txtJenisPet);
            umurPet = itemView.findViewById(R.id.txtUmurPet);
            jenisKelaminPet = itemView.findViewById(R.id.txtJenisKelaminPet);
            hargaPet = itemView.findViewById(R.id.txtHargaPet);
            deskripsiPet = itemView.findViewById(R.id.txtDeskripsiPet);
            gambarPet = itemView.findViewById(R.id.imgGambarPet);
        }
    }
}
