package fr.dc.parciel_TD;

import static java.lang.Integer.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;

import fr.dc.parciel_TD.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ui.nbDices.getText() != null | ui.nbFaces.getText() != null) {

                    if (Integer.parseInt(ui.nbDices.getText().toString()) >= 1 & Integer.parseInt(ui.nbDices.getText().toString()) <= 6) {
                        if (Integer.parseInt(ui.nbFaces.getText().toString()) >= 4 & Integer.parseInt(ui.nbFaces.getText().toString()) <= 12) {

                            Intent dices = new Intent();
                            dices.putExtra( "DICES" , Integer.parseInt(ui.nbDices.getText().toString()));
                            Intent faces = new Intent();
                            faces.putExtra("FACES", Integer.parseInt(ui.nbFaces.getText().toString()));

                        } else {
                            ui.nbFaces.setText("");
                            ui.nbFaces.setHint("Le nombre doit etre compris entre 4 et 12");
                        }
                    } else {
                        ui.nbDices.setText("");
                        ui.nbDices.setHint("Le nombre doit etre compris entre 1 et 6");
                    }
                }else{
                    String toast = "Il faut des entres des valeurs dans toute les cases";
                    Toast.makeText(MainActivity.this, toast, Toast.LENGTH_LONG).show();
                    ui.nbFaces.setText("");
                    ui.nbDices.setText("");
                }
            }
        });
    }
}