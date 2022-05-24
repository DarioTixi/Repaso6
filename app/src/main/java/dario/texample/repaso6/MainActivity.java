package dario.texample.repaso6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText editTnombre;
private Button enviar;
private Button calcular;
private EditText base1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTnombre= findViewById(R.id.editTextNombre);
    enviar= findViewById(R.id.button_Enviar);
    calcular= findViewById(R.id.button_Calcular);



   if(editTnombre.getText().toString().equals("")){
        calcular.setEnabled(false);
    }else{
        calcular.setEnabled(true);
    }

    }
     public  void Enviar(View view){
         Intent intent= new Intent(this,Actividad2.class);
         String nombreenviar= editTnombre.getText().toString();
         intent.putExtra("nombre_usuario",nombreenviar);
         startActivity(intent);

     }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode == resultCode) && (resultCode == RESULT_OK)){
            editTnombre.setText(data.getDataString());

        }
    }

}