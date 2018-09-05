package ufjf.dcc.exr01_lucas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TelaInicial extends AppCompatActivity {

    private TextView txtAluno;
    private TextView txtServidor;
    private TextView txtExterno;
    private Button  btnAluno;
    private Button btnServidor;
    private Button btnExterno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial);

        txtAluno = (TextView) findViewById(R.id.txt_aluno);
        txtServidor = (TextView) findViewById(R.id.txt_servidor);
        txtExterno = (TextView) findViewById(R.id.txt_externo);
        btnAluno = (Button) findViewById(R.id.btn_aluno);
        btnServidor = (Button) findViewById(R.id.btn_servidor);
        btnExterno = (Button) findViewById(R.id.btn_externo);
        
    }
}
