package dario.texample.repaso6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Actividad2 extends AppCompatActivity {
private Button regresar;
private EditText edtnombre;
private  EditText edtBase;
private  EditText edtExponente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        regresar= findViewById(R.id.buttonRegresar);
        edtnombre= findViewById(R.id.editTextNombre1);
        Bundle bundle = this.getIntent().getExtras();
        edtnombre.setText(bundle.getString("nombre_usuario"));
        edtExponente = findViewById(R.id.editTextExponente2);
        edtBase = findViewById(R.id.editTextBase3);

        String cad = edtBase.getText().toString();
                Intent data = new Intent();
        data.setData(Uri.parse(cad));
        setResult(RESULT_OK,data);
        finish();

    }

    public void Regresar(View view){


        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode == resultCode) && (resultCode == RESULT_OK)){
            edtnombre.setText(data.getDataString());

        }
    }
}