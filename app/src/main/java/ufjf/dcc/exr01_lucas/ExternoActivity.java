package ufjf.dcc.exr01_lucas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExternoActivity extends AppCompatActivity {

    private TextView txtExname;
    private TextView txtEmail;
    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externo);

        txtExname = (TextView) findViewById(R.id.txt_exname);
        txtEmail = (TextView) findViewById(R.id.txt_email);
        btnRegistrar = (Button) findViewById(R.id.btn_registrar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent response = new Intent();
                String nome = txtExname.getText().toString();
                String email = txtEmail.getText().toString();
                response.putExtra("name", nome);
                response.putExtra("email", email);
                if (!nome.isEmpty() && !email.isEmpty()) {
                    setResult(RESULT_OK, response);
                    finish();
                }

                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}
