package br.com.fiap.pickersanddialogs;



import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actvPaises;
    String[] paises = new String[] {"Argentina", "Brasil", "Chile", "Dinamarca", "Escócia"};

   // DatePicker dpAniversario;

    TimePicker tmpHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actvPaises = (AutoCompleteTextView)findViewById(R.id.actvPaises);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,paises);
        actvPaises.setAdapter(adapter);


       // dpAniversario = (DatePicker)findViewById(R.id.dpAniversario);

        tmpHorario = (TimePicker)findViewById(R.id.tmpHorario);

    }

    public void salvar(View v){
//        int year = dpAniversario.getYear();
//        int month = dpAniversario.getMonth() + 1;
//        int day = dpAniversario.getDayOfMonth();

       // Calendar calendar = new GregorianCalendar(year, month, day);
       // calendar.getTimeInMillis();


//        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//        dialog.setTitle(getString(R.string.data_escolhida));
//        dialog.setMessage(day + "/" + month + "/" + year);
//        dialog.show();

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            int hour = tmpHorario.getHour();
            int minute = tmpHorario.getMinute();
        }

    }
}
