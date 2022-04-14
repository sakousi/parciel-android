package fr.dc.parciel_TD;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import fr.dc.parciel_TD.databinding.LaunchMainBinding;


public class LaunchActivity extends AppCompatActivity {
    private LaunchMainBinding ui;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = LaunchMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());


    }
}
