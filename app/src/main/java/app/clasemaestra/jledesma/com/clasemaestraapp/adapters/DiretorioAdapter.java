package app.clasemaestra.jledesma.com.clasemaestraapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import app.clasemaestra.jledesma.com.clasemaestraapp.R;
import app.clasemaestra.jledesma.com.clasemaestraapp.models.Directorio;

/**
 * Created by JUAN JOSE LEDESMA on 12/10/2015.
 */
public class DiretorioAdapter extends RecyclerView.Adapter<DiretorioAdapter.DirectorioViewHolder>{

    ArrayList<Directorio> lstDirectorio;
    int itemLayout;

    public DiretorioAdapter(int itemLayout, ArrayList<Directorio> lstDirectorio) {
        this.itemLayout = itemLayout;
        this.lstDirectorio = lstDirectorio;
    }

    @Override
    public DirectorioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout,parent,false);

        return new DirectorioViewHolder(v);

    }

    @Override
    public void onBindViewHolder(DirectorioViewHolder holder, int position) {

        Directorio directorio = lstDirectorio.get(position);

        holder.nombre.setText(directorio.getNombre());
        holder.especialidad.setText(directorio.getEspecialidad());
        holder.anexo.setText(directorio.getAnexo());
    }

    @Override
    public int getItemCount() {
        return lstDirectorio.size();
    }

    public class DirectorioViewHolder extends RecyclerView.ViewHolder{

        TextView nombre;
        TextView especialidad;
        TextView anexo;

        public DirectorioViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.nombre);
            especialidad = (TextView) itemView.findViewById(R.id.especialidad);
            anexo = (TextView) itemView.findViewById(R.id.anexo);
        }
    }


}
