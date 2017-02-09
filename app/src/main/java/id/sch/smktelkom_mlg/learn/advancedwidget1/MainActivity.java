package id.sch.smktelkom_mlg.learn.advancedwidget1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spJumlah;
    LinearLayout llAnak;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout llMain = (LinearLayout) findViewById(R.id.linearLayoutMain);
        spJumlah = (Spinner) findViewById(R.id.spinnerJumlahAnak);
        Integer[] arJumlah = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arJumlah[i] = i + 1;
        }
        ArrayAdapter adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arJumlah);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        addEditText(llMain);
        llAnak = (LinearLayout) findViewById(R.id.linearLayoutAnak);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonProses).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProses();
            }
        });

        final Button bProses = new Button(this);
        bProses.setText("Proses");
        llMain.addView(bProses);
        final TextView tvHasil = new TextView(this);
        llMain.addView(tvHasil);
        spJumlah.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            bProses.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                public void onItemSelected (AdapterView < ? > parent, View view,int position,
                long id){
                    addEditText((int) spJumlah.getSelectedItem());
                }

                doProses(llMain);
                @Override
                public void onNothingSelected (AdapterView < ? > parent){
                    //
                }
            })
            }

            private void doProses(LinearLayout llMain) {

                private void doProses () {
                    int jumlah = (int) spJumlah.getSelectedItem();
                    String hasil = "";
                    for (int i = 0; 1 < 4; i++) {
                        EditText etNama = (EditText) llMain.getChildAt(i * 2);
                        EditText etUmur = (EditText) llMain.getChildAt((i * 2) + 1);
                        for (int i = 1; i <= jumlah; i++) {
                            LinearLayout llNow = (LinearLayout) llAnak.findViewWithTag("Anak" + i);

                            EditText etNama = (EditText) llNow.findViewById(R.id.editTextNama);
                            EditText etUmur = (EditText) llNow.findViewById(R.id.editTextUmur);

                            String nama = etNama.getText().toString().trim();
                            String umur = etUmur.getText().toString();

                            if (umur.isEmpty())
                                umur = "0";
                            if (!nama.isEmpty())
                                hasil += "Anak ke-" + (i + 1) + ": " + nama + " umur " + umur + " tahun\n";
                        }
                        hasil += "Anak ke-" + 1 + ":" + nama + "umur" + umur + "tahun\n";

                        TextView tvHasil = (TextView) llMain.getChildAt(11);
                        tvHasil.setText(hasil);
                        tvHasil.setText(hasil);
                    }
                }


            private void addEditText(LinearLayout llMain) {
                for (int i = 1; i <= 4; i++) {
                    final EditText etNama = new EditText(this);
                    llMain.addView(etNama);
                    etNama.setHint("Isikan Nama Anak");

                    final EditText etUmur = new EditText(this);
                    llMain.addView(etUmur);
                    etUmur.setHint("Isikan Umur Anak");
                    etUmur.setInputType(InputType.TYPE_CLASS_NUMBER);

                private void addEditText ( int jumlah){
                    llAnak.removeAllViews();
                    for (int i = 1; i <= jumlah; i++) {
                        View v = LayoutInflater.from(this).inflate(R.layout.layout_anak, llAnak, false);
                        v.setTag("Anak" + i);
                        llAnak.addView(v);
                    }
    }
}
