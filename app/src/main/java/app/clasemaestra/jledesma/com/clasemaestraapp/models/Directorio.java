package app.clasemaestra.jledesma.com.clasemaestraapp.models;

/**
 * Created by JUAN JOSE LEDESMA on 12/10/2015.
 */
public class Directorio {

    private String nombre;
    private String especialidad;
    private String anexo;

    public Directorio(){}

    public Directorio(String nombre, String especialidad, String anexo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.anexo = anexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
}
