package ui.detalhesFilme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import br.com.leandro.filmesapp.R;
import br.com.leandro.filmesapp.data.model.Filme;
import ui.listaFilmes.ListaFilmesActivity;

public class DetalhesFilmeActivity extends AppCompatActivity {

    public static final String EXTRA_FILME = "EXTRA_FILME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_filme);

        TextView textTituloFilme = findViewById(R.id.textTituloFilme);

        TextView textdataLancamento = findViewById(R.id.text_data_lancamento);

        TextView textIdiomaOriginal = findViewById(R.id.text_idioma_original);
        TextView textOverview = findViewById(R.id.text_overview);

        ImageView imagePosterFilme = findViewById(R.id.image_poster_filme);

        final Filme filme = (Filme) getIntent().getSerializableExtra(EXTRA_FILME);
        textTituloFilme.setText(filme.getTitulo());

        textdataLancamento.setText(filme.getDataLancamento());
        textIdiomaOriginal.setText(filme.getIdiomaFilme());
        textOverview.setText(filme.getOverview());

        Picasso.get()
                .load("https://image.tmdb.org/t/p/w342/" + filme
                        .getCaminhoPoster())
                .into(imagePosterFilme);

        ImageButton BotaoBack = (ImageButton) findViewById(R.id.imageButtonBack);
        BotaoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), ListaFilmesActivity.class);
                startActivity(b);
            }

        });
    }

}
