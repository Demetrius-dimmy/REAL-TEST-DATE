package com.example.demetrius.projetoambv;


import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main2Activity extends AppCompatActivity {
    private TextView tvData;
    private Button btnData;
    private EditText etDate;
    private Spinner spProdutos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnData=(Button)findViewById(R.id.btnData);
        tvData = (TextView) findViewById(R.id.tvData);
        etDate=(EditText)findViewById(R.id.etDate);
        final long date = System.currentTimeMillis();
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        final String dateString = sdf.format(date);
        tvData.setText(dateString);
        spProdutos=(Spinner)findViewById(R.id.spProdutos);

                spProdutos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected( AdapterView<?> parent, View view, int position, long id ) {


                        if (position==0){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+270);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade do Guarana Antarctica");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime()));
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==1){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+180);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade do Guarana Zero");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime()));
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==2){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                                    Calendar data1 = Calendar.getInstance();
                                    Calendar data2 = Calendar.getInstance();
                                    try {
                                        data2.setTime(sd.parse(String.valueOf(tvData.getText())));
                                        data1.setTime(sd.parse(String.valueOf(etDate.getText())));
                                    } catch (java.text.ParseException e ) {}
                                    int dias = data2.get(Calendar.DAY_OF_YEAR) -
                                            data1.get(Calendar.DAY_OF_YEAR);
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+270);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Pepsi");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime())+"\nDias do caleendario Juliano  "+dias);
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==3){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                                    Calendar data1 = Calendar.getInstance();
                                    Calendar data2 = Calendar.getInstance();
                                    try {
                                        data2.setTime(sd.parse(String.valueOf(tvData.getText())));
                                        data1.setTime(sd.parse(String.valueOf(etDate.getText())));
                                    } catch (java.text.ParseException e ) {}
                                    int dias = data2.get(Calendar.DAY_OF_YEAR) -
                                            data1.get(Calendar.DAY_OF_YEAR);
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+120);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Pepsi Light");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime())+"\nDias do caleendario Juliano  "+dias);
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==4){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                                    Calendar data1 = Calendar.getInstance();
                                    Calendar data2 = Calendar.getInstance();
                                    try {
                                        data2.setTime(sd.parse(String.valueOf(tvData.getText())));
                                        data1.setTime(sd.parse(String.valueOf(etDate.getText())));
                                    } catch (java.text.ParseException e ) {}
                                    int dias = data2.get(Calendar.DAY_OF_YEAR) -
                                            data1.get(Calendar.DAY_OF_YEAR);
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+270);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Pepsi Twist");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime())+"\nDias do caleendario Juliano  "+dias);
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==5){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+270);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Soda Limonada");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime()));
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==6){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+270);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Sukita");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime()));
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==7){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+180);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Sukita Uva");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime()));
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==8){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                                    Calendar data1 = Calendar.getInstance();
                                    Calendar data2 = Calendar.getInstance();
                                    try {
                                        data2.setTime(sd.parse(String.valueOf(tvData.getText())));
                                        data1.setTime(sd.parse(String.valueOf(etDate.getText())));
                                    } catch (java.text.ParseException e ) {}
                                    int dias = data2.get(Calendar.DAY_OF_YEAR) -
                                            data1.get(Calendar.DAY_OF_YEAR);
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+270);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Teen");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime())+"\nDias do caleendario Juliano  "+dias);
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==9){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+270);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade da Tonica");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime()));
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                        if (position==10){
                            btnData.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick( View v ) {
                                    Calendar c = Calendar.getInstance();
                                    c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH)+180);
                                    AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
                                    dialog.setTitle("Data de validade de todas as Cervejas");
                                    dialog.setMessage(c.getTime()+"\nCS "+sdf.format(c.getTime()));
                                    dialog.setIcon(R.drawable.imagesambev);
                                    dialog.setNeutralButton("OK", null);
                                    dialog.show();
                                }
                            });
                        }
                    }

                    @Override
                    public void onNothingSelected( AdapterView<?> parent ) {

                    }
                });




    }




}
