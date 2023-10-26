package br.ulbra.appvisualizaimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgFoto;
    Button btnFoto1, btnFoto2;
    TextView txtInformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);
        txtInformacao = (TextView) findViewById(R.id.textView);

        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFoto.setImageResource(R.drawable.shadow1);
                txtInformacao.setText("Foto 1");
            }
        });
        btnFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFoto.setImageResource(R.drawable.shadow2);
                txtInformacao.setText("Foto 2");
            }
        });
    }
}