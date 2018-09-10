package ufjf.dcc.exr01_lucas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;


public class TelaInicial extends AppCompatActivity {

    private TextView txtAluno;
    private TextView txtServidor;
    private TextView txtExterno;
    private Button  btnAluno;
    private Button btnServidor;
    private Button btnExterno;

    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Servidor> listaServidor;
    private ArrayList<Externo> listaExterno;


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

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alunoPage = new Intent(TelaInicial.this, AlunoActivity.class);
                startActivity(alunoPage);

            }
        });

    }
}
