package br.com.modularpam1raiarmazenamento;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    //nome do arquivo de preferencias para salvar
    private static final String PREFS_NAME = "user_prefs";

    //Chaves que serão utilizadas no SharedPreferences
    private static final String KEY_NOME = "nome";
    private static final String KEY_IDADE = "idade";
    private static final String KEY_CONTADOR = "contador";

    //Variaveis da tela
    private SharedPreferences sharedPreferences;
    private EditText nomeEditText;
    private EditText idadeEditText;
    private TextView displayTextView;
    private Button btnSalvar;
    private Button btnCarregar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //inicializar a variavel do chave-valor
        sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        //linkar variaveis do java com as do form da tela
        nomeEditText = findViewById(R.id.nomeEditText);
        idadeEditText = findViewById(R.id.idadeEditText);
        displayTextView = findViewById(R.id.displayTextView);
        btnCarregar = findViewById(R.id.btnCarregar);
        btnSalvar = findViewById(R.id.btnSalvar);

        //ação nos botoões chamando os metodos
        btnSalvar.setOnClickListener(v -> salvarDadosUsuario());
        btnCarregar.setOnClickListener(v -> carregarDadosUsuario());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void salvarDadosUsuario() {
        String nome = nomeEditText.getText().toString().trim();
        String idadeStr = idadeEditText.getText().toString().trim();

        if (nome.isEmpty() || idadeStr.isEmpty()) {
            displayTextView.setText("Preencha todos os campos.");
            return;
        }
        //vamos tentar...
        try {
            int idade = Integer.parseInt(idadeStr);
            //nossa especie de DML
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(KEY_NOME, nome);
            editor.putInt(KEY_IDADE, idade);

            //Contar a quantidade de contatos salvos (n vai funcionar pra muitos)

            int contadorAtual = sharedPreferences.getInt(KEY_CONTADOR, 0);
            editor.putInt(KEY_CONTADOR, +1);
            editor.apply();

            //limpa os campos
            nomeEditText.setText("");
            idadeEditText.setText("");

            //colocar um foco no campo
            nomeEditText.requestFocus();

        } catch (NumberFormatException e) {
            displayTextView.setText("Idade invalida.");
        }
    }

    private void carregarDadosUsuario() {
        String nome = sharedPreferences.getString(KEY_NOME, null);
        int   idade = sharedPreferences.getInt(KEY_IDADE, -1);

        if(nome == null || idade == -1){
            displayTextView.setText("Nenhum contato salvo ainda");
        }else{
            displayTextView.setText("Nome: " + nome + "\nIdade: " + idade);
        }

    }
}