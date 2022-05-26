package dario.texample.repaso6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Actividad2 extends AppCompatActivity {
private Button regresar;
private EditText edtotro;
    private int codigoRequerido=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        regresar= findViewById(R.id.buttonRegresar);
        edtotro= findViewById(R.id.otro);

    }

    public void Regresar(View view){
String nombre=  edtotro.getText().toString();
Intent intent = new Intent();
intent.putExtra("nombre",nombre);
setResult(Activity.RESULT_OK,intent);
        finish();

    }


}