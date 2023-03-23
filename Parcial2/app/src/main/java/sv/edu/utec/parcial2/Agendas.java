package sv.edu.utec.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Agendas  {
    private String Nombre;
    private String Cargo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getCampani() {
        return Campani;
    }

    public void setCampani(String campani) {
        Campani = campani;
    }

    private String Campani;


}