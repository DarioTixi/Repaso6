package dario.texample.repaso6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText editTnombre;
private Button enviar;
    private int codigoRequerido=1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTnombre= findViewById(R.id.editTextNombre);


    }
     public  void Enviar(View view){
         Intent intent = new Intent(this,Actividad2.class);
         startActivityForResult(intent,codigoRequerido);

     }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == codigoRequerido) && (resultCode == RESULT_OK)) {
            editTnombre.setText(data.getStringExtra("nombre"));

        }
    }


}