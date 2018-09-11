package ufjf.dcc.exr01_lucas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ServidorActivity extends AppCompatActivity {

    private TextView txtNome;
    private TextView txtSiape;
    private Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor);

        txtNome = (TextView) findViewById(R.id.txt_nome);
        txtSiape = (TextView) findViewById(R.id.txt_siape);
        registrar = (Button) findViewById(R.id.btn_registrar);


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent response = new Intent();
                String nome = txtNome.getText().toString();
                String siape = txtSiape.getText().toString();
                response.putExtra("name", nome);
                response.putExtra("siape", siape);
                if (!nome.isEmpty() && !siape.isEmpty()) {
                    setResult(RESULT_OK, response);
                    finish();
                }

                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}
