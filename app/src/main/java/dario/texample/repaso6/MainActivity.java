package dario.texample.repaso6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText nombre;
private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    nombre= findViewById(R.id.editTextNombre);
    enviar= findViewById(R.id.button_Enviar);
    if(nombre.getText().toString()==""){
        enviar.setEnabled(false);
    }else{
        enviar.setEnabled(true);
    }
    }

}