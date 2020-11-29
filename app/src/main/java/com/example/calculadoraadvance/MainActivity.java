package com.example.calculadoraadvance;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_0;
    Button btn_suma;
    Button btn_resta;
    Button btn_multi;
    Button btn_divide;
    Button btn_clean;
    Button btn_coma;
    Button btn_igual;
    TextView resultado;
    Double resultado1;

    private String[] colores;
    private ConstraintLayout fondo;

        String operador="0",num1,num2;
    //Declaramos las variables que vamos a usar
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //registerForContextMenu(resultado); //asociamos el Textview con en contextMenu para que al mantener ese TextView se despliegue el menú  (A pesar de estar bien hecho porque lo probé en otra actividad me salta error)

        colores = getResources().getStringArray(R.array.fondo); //Es un array tipo String donde posteriormente usaremos para cambiar el color del fondo con un dialogo
        fondo=(ConstraintLayout)findViewById(R.id.background); //importante declarar un constraint layout para posteriormente cambiarle el color

        btn_1=(Button)findViewById(R.id.button1);
        btn_2=(Button)findViewById(R.id.button2);
        btn_3=(Button)findViewById(R.id.button3);
        btn_4=(Button)findViewById(R.id.button4);
        btn_5=(Button)findViewById(R.id.button5);
        btn_6=(Button)findViewById(R.id.button6);
        btn_7=(Button)findViewById(R.id.button7);
        btn_8=(Button)findViewById(R.id.button8);
        btn_9=(Button)findViewById(R.id.button9);
        btn_0=(Button)findViewById(R.id.button0);
        resultado=(TextView)findViewById(R.id.textView1);
        btn_coma=(Button)findViewById(R.id.buttonComa);
        btn_clean=(Button)findViewById(R.id.buttonclean) ;

btn_suma=(Button)findViewById(R.id.buttonsuma) ;
//Las asiciamos con sus respectivas ID de cada boton
btn_suma.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        num1=resultado.getText().toString();
        operador="+";
        resultado.setText("");
    }
});
// Si clicamos el boton mas el resultado mostrado en la TextView se guardará y el operador tendrá el signo + y vaciará el TextView mostrado
btn_resta=(Button)findViewById(R.id.buttonResta) ;
btn_resta.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        num1=resultado.getText().toString();
        operador="-";
        resultado.setText("");
    }
});

btn_multi=(Button)findViewById(R.id.buttonmulti);
btn_multi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        num1=resultado.getText().toString();
        operador="x";
        resultado.setText("");
    }
});

btn_divide=(Button)findViewById(R.id.buttonDivide);
btn_divide.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        num1=resultado.getText().toString();
        operador="/";
        resultado.setText("");
    }
});



btn_igual=(Button)findViewById(R.id.buttonigual);
btn_igual.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        num2=resultado.getText().toString();//Guardamos en el valor num2 lo recogido en la TextView

        if(operador.equals("0")){
            resultado.setText(resultado.getText().toString());
            Toast.makeText(MainActivity.this,"Falta introducir el operador",Toast.LENGTH_SHORT).show();
        }
                if(operador.equals("+")){
                    resultado1=Double.parseDouble(num1)+Double.parseDouble(num2);
                    resultado.setText(String.valueOf(resultado1));
                    operador="0";
                }//Cuando se da click en el boton + se mostrará el resultado de la suma del num1 guardado anteriormente y del numero 2

        if(operador.equals("-")){
            resultado1=Double.parseDouble(num1)-Double.parseDouble(num2);
            resultado.setText(String.valueOf(resultado1));
            operador="0";
        }

        if(operador.equals("x")){
            resultado1=Double.parseDouble(num1)*Double.parseDouble(num2);
            resultado.setText(String.valueOf(resultado1));
            operador="0";
        }


        if(operador.equals("/")){
            resultado1=Double.parseDouble(num1)/Double.parseDouble(num2);
            resultado.setText(String.valueOf(resultado1));
            operador="0";
        }


        if(resultado.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"El texto está en blanco falta introducir valores",Toast.LENGTH_SHORT).show();
                }

    }
});

    }
    public void bn1(View view){
        resultado.setText(resultado.getText().toString()+"1");
    }//Mostrar los numeros de cada boton

    public void bn2(View view){
        resultado.setText(resultado.getText().toString()+"2");
    }

    public void bn3(View view){
        resultado.setText(resultado.getText().toString()+"3");
    }

    public void bn4(View view){
        resultado.setText(resultado.getText().toString()+"4");
    }

    public void bn5(View view){
        resultado.setText(resultado.getText().toString()+"5");
    }

    public void bn6(View view){
        resultado.setText(resultado.getText().toString()+"6");
    }

    public void bn7(View view){
        resultado.setText(resultado.getText().toString()+"7");
    }

    public void bn8(View view){
        resultado.setText(resultado.getText().toString()+"8");
    }

    public void bn9(View view){
        resultado.setText(resultado.getText().toString()+"9");
    }

    public void bn0(View view){
        resultado.setText(resultado.getText().toString()+"0");
    }

    public void bnClean(View view){
        resultado.setText("");
    }

    public void bnpunto(View View)
    {
        resultado.setText(resultado.getText().toString()+".");
    }
//Cargamos el menu con el inflate
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.actionbar,menu);
        return true;
    }


//Introducimos las acciones cuando seleccionamos los Items
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.salir){
            CerrarAplicacion(); //LLamamos al método
        }

//Las tres subopciones de Color texto
        if(id==R.id.azul){
            btn_0.setTextColor(Color.BLUE);
            btn_1.setTextColor(Color.BLUE);
            btn_2.setTextColor(Color.BLUE);
            btn_3.setTextColor(Color.BLUE);
            btn_4.setTextColor(Color.BLUE);
            btn_5.setTextColor(Color.BLUE);
            btn_6.setTextColor(Color.BLUE);
            btn_7.setTextColor(Color.BLUE);
            btn_8.setTextColor(Color.BLUE);
            btn_9.setTextColor(Color.BLUE);
            btn_suma.setTextColor(Color.BLUE);
            btn_resta.setTextColor(Color.BLUE);
            btn_multi.setTextColor(Color.BLUE);
            btn_divide.setTextColor(Color.BLUE);
            btn_clean.setTextColor(Color.BLUE);
            btn_coma.setTextColor(Color.BLUE);
            btn_igual.setTextColor(Color.BLUE);
            resultado.setTextColor(Color.BLUE);
        }

        if(id==R.id.gris){
            btn_0.setTextColor(Color.GRAY);
            btn_1.setTextColor(Color.GRAY);
            btn_2.setTextColor(Color.GRAY);
            btn_3.setTextColor(Color.GRAY);
            btn_4.setTextColor(Color.GRAY);
            btn_5.setTextColor(Color.GRAY);
            btn_6.setTextColor(Color.GRAY);
            btn_7.setTextColor(Color.GRAY);
            btn_8.setTextColor(Color.GRAY);
            btn_9.setTextColor(Color.GRAY);
            btn_suma.setTextColor(Color.GRAY);
            btn_resta.setTextColor(Color.GRAY);
            btn_multi.setTextColor(Color.GRAY);
            btn_divide.setTextColor(Color.GRAY);
            btn_clean.setTextColor(Color.GRAY);
            btn_coma.setTextColor(Color.GRAY);
            btn_igual.setTextColor(Color.GRAY);
            resultado.setTextColor(Color.GRAY);
        }

        if(id==R.id.rojo){
            btn_0.setTextColor(Color.RED);
            btn_1.setTextColor(Color.RED);
            btn_2.setTextColor(Color.RED);
            btn_3.setTextColor(Color.RED);
            btn_4.setTextColor(Color.RED);
            btn_5.setTextColor(Color.RED);
            btn_6.setTextColor(Color.RED);
            btn_7.setTextColor(Color.RED);
            btn_8.setTextColor(Color.RED);
            btn_9.setTextColor(Color.RED);
            btn_suma.setTextColor(Color.BLACK); //Debido a que el background es rojo y sino no se verian los operadores
            btn_resta.setTextColor(Color.BLACK);
            btn_multi.setTextColor(Color.BLACK);
            btn_divide.setTextColor(Color.BLACK);
            btn_clean.setTextColor(Color.RED);
            btn_coma.setTextColor(Color.BLACK);
            btn_igual.setTextColor(Color.BLACK);
            resultado.setTextColor(Color.RED);
        }

        if(id==R.id.background){
            AlertDialog.Builder dialogo=new AlertDialog.Builder(this);// declaramos una variable Alert Dialog
            dialogo.setTitle("Colores");
            dialogo.setItems(R.array.fondo, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                         switch(which){
                             case 0: fondo.setBackgroundColor(Color.BLACK); //El array tipo string de antes si el wich es 0 lo pintará de negro
                             break;
                             case 1: fondo.setBackgroundColor(Color.WHITE);//El array tipo string de antes si el wich es 0 lo pintará de blanco
                                 break;
                             case 2: fondo.setBackgroundColor(Color.GRAY); //El array tipo string de antes si el wich es 0 lo pintará de gris
                                 break;
                            }
                                                                         }
            }).show();
        }

return super.onOptionsItemSelected(item);
    }

//Creamos e inflamos el meenu flotante
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.flotante,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    //Asociamos los item seleccionados con sus ID
        public boolean onContextItemSelected(MenuItem item){
        int id=item.getItemId();  //En una variable almacenamos los id de los item
                if(id==R.id.g){  //Si la id es igual a la del item grande el támaño del texto variará
                    resultado.setTextSize(30f);
                }
                else if(id==R.id.n){//Si la id es igual a la del item normal el támaño del texto variará
                    resultado.setTextSize(24f);
                }
                if (id==R.id.p){//Si la id es igual a la del item pequeño el támaño del texto variará
                    resultado.setTextSize(12f);
            }

        return true;
        }

//Método para cerrar la aplicación con un AlertDialog
        private void CerrarAplicacion(){
        new AlertDialog.Builder(this).setTitle("¿Realmente quieres cerrar la APP").setCancelable(false).setNegativeButton(android.R.string.cancel,null)
        .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { //Con el click listener le decimos que al dar click se cerrará la app
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();//Cerramos la app
            }
        }).show();//mostrar el AlertDialog

        }

}