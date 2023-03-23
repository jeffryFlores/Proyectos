package sv.edu.utec.parcial2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Elementos extends RecyclerView.ViewHolder  {
    ImageView imgU;
    static  TextView tvnombre,tvcargo,tvcompani;
    public Elementos(@NonNull View itemView) {
        super(itemView);
        imgU = itemView.findViewById(R.id.imvu);
        tvnombre = itemView.findViewById(R.id.tvnombre);
        tvcargo = itemView.findViewById(R.id.tvcargo);
        tvcompani = itemView.findViewById(R.id.tvcompani);
    }
}
