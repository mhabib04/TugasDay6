package com.example.tugasday6;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PetAdapter petAdapter;
    private ArrayList<PetModel> petModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleView);
        petAdapter = new PetAdapter(petModel, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(petAdapter);
    }

    private void getData(){
        petModel = new ArrayList<>();
        petModel.add(new PetModel("Kucing Persia", "Umur : 1 tahun 3 bulan", "Jenis Kelamin : Jantan", "Harga : Rp1.450.000",getString(R.string.kucing_persia),R.drawable.cat_persia));
        petModel.add(new PetModel("Kucing British Shorthair", "Umur : 1 tahun 1 bulan", "Jenis Kelamin : Betina", "Harga : Rp1.250.000", getString(R.string.kucing_british_shorthair),R.drawable.cat_british_shorthair));
        petModel.add(new PetModel("Kucing Ragdoll", "Umur : 1 tahun 4 bulan", "Jenis Kelamin : Jantan", "Harga : Rp1.650.000", getString(R.string.kucing_ragdoll),R.drawable.cat_ragdoll));
        petModel.add(new PetModel("Kucing Sphynx", "Umur : 1 tahun 6 bulan", "Jenis Kelamin : Betina", "Harga : Rp1.500.000", getString(R.string.kucing_sphynx),R.drawable.cat_sphynx));
        petModel.add(new PetModel("Kucing Bengal", "Umur : 1 tahun 2 bulan", "Jenis Kelamin : Jantan", "Harga : Rp1.770.000", getString(R.string.kucing_bengal),R.drawable.cat_bengal));
        petModel.add(new PetModel("Anjing Beagle", "Umur : 1 tahun 8 bulan", "Jenis Kelamin : Jantan", "Harga : Rp1.250.000", getString(R.string.anjing_beagle),R.drawable.dog_beagle));
        petModel.add(new PetModel("Anjing Border Collie", "Umur : 1 tahun 10 bulan", "Jenis Kelamin : Jantan", "Harga : Rp1.350.000", getString(R.string.anjing_border_collie),R.drawable.dog_border_collie));
        petModel.add(new PetModel("Anjing Bulldog", "Umur : 1 tahun 6 bulan", "Jenis Kelamin : Jantan", "Harga : Rp1.600.000", getString(R.string.anjing_bulldog),R.drawable.dog_bulldog));
        petModel.add(new PetModel("Anjing Corgi", "Umur : 1 tahun 5 bulan", "Jenis Kelamin : Jantan", "Harga : Rp1.450.000", getString(R.string.anjing_corgi),R.drawable.dog_corgi));
        petModel.add(new PetModel("Anjing Pomeranian", "Umur : 1 tahun 3 bulan", "Jenis Kelamin : Betina", "Harga : Rp1.770.000", getString(R.string.anjing_pomeranian),R.drawable.dog_pomeranian));
        petModel.add(new PetModel("Ikan Cupang", "Umur : 5 bulan", "Jenis Kelamin : Jantan", "Harga : Rp255.000", getString(R.string.ikan_cupang),R.drawable.fish_cupang));
        petModel.add(new PetModel("Ikan Discus", "Umur : 8 bulan", "Jenis Kelamin : Jantan", "Harga : Rp430.000", getString(R.string.ikan_discus),R.drawable.fish_discus));
        petModel.add(new PetModel("Ikan Guppy", "Umur : 6 bulan", "Jenis Kelamin : Betina", "Harga : Rp360.000", getString(R.string.ikan_guppy),R.drawable.fish_guppy));
        petModel.add(new PetModel("Ikan Koi", "Umur : 5 bulan", "Jenis Kelamin : Jantan", "Harga : Rp250.000", getString(R.string.ikan_koi),R.drawable.fish_koi));
        petModel.add(new PetModel("Ikan Moorish Idol", "Umur : 10 bulan", "Jenis Kelamin : Betina", "Harga : Rp470.000", getString(R.string.ikan_moorish_idol),R.drawable.fish_moorish_idol));


    }
}