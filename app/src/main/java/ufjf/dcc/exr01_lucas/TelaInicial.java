package ufjf.dcc.exr01_lucas;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;


public class TelaInicial extends AppCompatActivity {

    public static final int REQUEST_ALUNO = 1;
    public static final int REQUEST_SERVIDOR = 2;
    public static final int REQUEST_EXTERNO = 3;

    private TextView txtAluno;
    private TextView txtQtAluno;
    private TextView txtServidor;
    private TextView txtQtServidor;
    private TextView txtExterno;
    private TextView txtQtExterno;
    private Button  btnAluno;
    private Button btnServidor;
    private Button btnExterno;

    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
    private ArrayList<Servidor> listaServidor = new ArrayList<Servidor>();
    private ArrayList<Externo> listaExterno = new ArrayList<Externo>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial);

        txtAluno = (TextView) findViewById(R.id.txt_aluno);
        txtQtAluno = (TextView) findViewById(R.id.txt_qtaluno);

        txtServidor = (TextView) findViewById(R.id.txt_servidor);
        txtQtServidor = (TextView) findViewById(R.id.txt_qtservidor);

        txtExterno = (TextView) findViewById(R.id.txt_externo);
        txtQtExterno = (TextView) findViewById(R.id.txt_qtexterno);

        btnAluno = (Button) findViewById(R.id.btn_aluno);
        btnServidor = (Button) findViewById(R.id.btn_servidor);
        btnExterno = (Button) findViewById(R.id.btn_externo);

        btnAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alunoPage = new Intent(TelaInicial.this, AlunoActivity.class);
                startActivityForResult(alunoPage, REQUEST_ALUNO);
            }
        });

        btnServidor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent servidorPage = new Intent(TelaInicial.this, ServidorActivity.class);
                startActivityForResult(servidorPage, REQUEST_SERVIDOR);
            }
        });

        btnExterno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent externoPage = new Intent(TelaInicial.this, ExternoActivity.class);
                startActivityForResult(externoPage, REQUEST_EXTERNO);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == TelaInicial.RESULT_OK && data != null) {
            Bundle bundleResult = data.getExtras();
            if (bundleResult.isEmpty()) {
                return;
            }

            switch (requestCode) {
                case 1:
                    Aluno novoAluno = new Aluno();
                    String nome = bundleResult.getString("name");
                    String matricula = bundleResult.getString("mat");
                    novoAluno.registrarAluno(nome, matricula);
                    this.listaAlunos.add(novoAluno);
                    txtQtAluno.setText(Integer.toString(this.listaAlunos.size()));
                    Toast.makeText(getApplicationContext(),"Aluno Registrado " + nome + " " + matricula,Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    Servidor novoServidor = new Servidor();
                    String svnome = bundleResult.getString("name");
                    String siape = bundleResult.getString("siape");
                    novoServidor.registrarServidor(svnome, siape);
                    this.listaServidor.add(novoServidor);
                    txtQtServidor.setText(Integer.toString(this.listaServidor.size()));
                    Toast.makeText(getApplicationContext(),"Servidor Registrado " + svnome + " " + siape,Toast.LENGTH_LONG).show();
                    break;
                case 3:
                    Externo novoExterno = new Externo();
                    String exname = bundleResult.getString("name");
                    String email = bundleResult.getString("email");
                    novoExterno.registrarExterno(exname, email);
                    this.listaExterno.add(novoExterno);
                    txtQtExterno.setText(Integer.toString(this.listaExterno.size()));
                    Toast.makeText(getApplicationContext(),"Externo Registrado " + exname + " " + email,Toast.LENGTH_LONG).show();
                    break;
            }

        }
    }
}
