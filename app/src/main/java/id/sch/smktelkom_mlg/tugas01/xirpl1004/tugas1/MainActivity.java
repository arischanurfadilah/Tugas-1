package id.sch.smktelkom_mlg.tugas01.xirpl1004.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    Button buttonOK;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        hasil = (TextView) findViewById(R.id.hasil);


        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {

        String namaa = nama.getText().toString();

        hasil.setText("Nama Anda " + namaa + " ");

    }
}