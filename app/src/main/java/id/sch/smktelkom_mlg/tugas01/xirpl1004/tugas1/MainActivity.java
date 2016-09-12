package id.sch.smktelkom_mlg.tugas01.xirpl1004.tugas1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nama;
    Button buttonOK;
    TextView hasil;
    Spinner provinsi;
    RadioGroup jk;
    RadioButton lk, pr;
    CheckBox rpl, tkj, mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        hasil = (TextView) findViewById(R.id.hasil);
        provinsi = (Spinner) findViewById(R.id.provinsi);
        jk = (RadioGroup) findViewById(R.id.jk);
        lk = (RadioButton) findViewById(R.id.lk);
        pr = (RadioButton) findViewById(R.id.pr);
        rpl = (CheckBox) findViewById(R.id.rpl);
        tkj = (CheckBox) findViewById(R.id.tkj);
        mm = (CheckBox) findViewById(R.id.mm);


        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {

        String namaa = nama.getText().toString();
        String prov = provinsi.getSelectedItem().toString();
        String jenis = lk.getText().toString();
        pr.getText().toString();
        String minat = "";

        if (rpl.isChecked()) {
            minat += rpl.getText() + "";
        } else if (tkj.isChecked()) {
            minat += tkj.getText() + "";
        } else if (mm.isChecked()) {
            minat += mm.getText() + "";
        }

        hasil.setText("Nama Anda " + namaa + "\nAsal Anda " + prov + "\nJenis Kelamin " + jenis + "\nBidang Yang Dipilih " + minat);

    }
}