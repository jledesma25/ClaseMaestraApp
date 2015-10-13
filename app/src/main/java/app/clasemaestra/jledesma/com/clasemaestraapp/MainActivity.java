package app.clasemaestra.jledesma.com.clasemaestraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import app.clasemaestra.jledesma.com.clasemaestraapp.adapters.DiretorioAdapter;
import app.clasemaestra.jledesma.com.clasemaestraapp.models.Directorio;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    ArrayList<Directorio> lstDirectorio;
   // RecyclerView recycler;

    @Bind(R.id.my_recycler)
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scrolling);
        ButterKnife.bind(this);


        setDataDummy();
        setup();
    }

    private void setDataDummy() {

        lstDirectorio = new  ArrayList<Directorio>();

        Directorio a1 = new Directorio();
        a1.setNombre("Juan José");
        a1.setEspecialidad("Android");
        a1.setAnexo("123-321");

        lstDirectorio.add(a1);

        Directorio a2 = new Directorio();
        a2.setNombre("Fredy Ascencios");
        a2.setEspecialidad("IOS");
        a2.setAnexo("123-111");

        lstDirectorio.add(a2);
    }

    private void setup() {

      //  recycler = (RecyclerView) findViewById(R.id.my_recycler);
        recycler.setAdapter(new DiretorioAdapter(R.layout.row_direcotorio, lstDirectorio));
        recycler.setLayoutManager(new LinearLayoutManager(this));

    }
}
