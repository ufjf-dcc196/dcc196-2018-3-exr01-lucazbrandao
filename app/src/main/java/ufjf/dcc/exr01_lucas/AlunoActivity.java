package ufjf.dcc.exr01_lucas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlunoActivity extends AppCompatActivity {

    private TextView txtNome;
    private TextView txtMatricula;
    private Button registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        txtNome = (TextView) findViewById(R.id.txt_name);
        txtMatricula = (TextView) findViewById(R.id.txt_matricula);
        registrar = (Button) findViewById(R.id.btn_aluno);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent response = new Intent();
                String nome = txtNome.getText().toString();
                String matricula = txtMatricula.getText().toString();
                response.putExtra("name", nome);
                response.putExtra("mat", matricula);
                if (!nome.isEmpty() && !matricula.isEmpty()) {
                    setResult(RESULT_OK, response);
                    finish();
                }

                setResult(RESULT_CANCELED);
                finish();

            }
        });
    }
}
