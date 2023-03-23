package sv.edu.utec.parcial2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Elementos>   {
    Context context;
    ArrayList<Agendas> agendas;

    public Adaptador(Context context, ArrayList<Agendas> agendas) {
        this.context = context;
        this.agendas = agendas;
    }

    @NonNull
    @Override
    public Elementos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.activity_agendas,null);
        return new Elementos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Elementos holder, int position) {
        Elementos.tvnombre.setText(agendas.get(position).getNombre());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
