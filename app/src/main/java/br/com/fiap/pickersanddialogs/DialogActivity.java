package br.com.fiap.pickersanddialogs;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }


    public void salvar(View v){


        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(DialogActivity.this, i2 + "/" + i1 + "/" + i, Toast.LENGTH_SHORT).show();
            }
        },2017, 03, 02);
        datePickerDialog.show();



//        ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setTitle("Carregando");
//        progressDialog.setMessage("Aguarde...");
//        progressDialog.show();



//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle(R.string.titulo);
//        builder.setMessage(R.string.msg);
//        builder.setCancelable(false);
//        builder.setIcon(android.R.drawable.ic_dialog_alert);
//        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int i) {
//                Toast.makeText(DialogActivity.this, getString(R.string.clicou_ok), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        builder.setNegativeButton(R.string.fechar, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int i) {
//                Toast.makeText(DialogActivity.this, getString(R.string.clicou_fechar), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        builder.show();
    }
}
