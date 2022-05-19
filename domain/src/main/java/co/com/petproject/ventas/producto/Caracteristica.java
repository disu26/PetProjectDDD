package co.com.petproject.ventas.producto;

import co.com.petproject.ventas.producto.values.*;
import co.com.sofka.domain.generic.Entity;

public class Caracteristica extends Entity<CaracteristicaId> {
    protected Marca marca;
    protected Modelo modelo;
    protected Especificaciones especificaciones;
    protected Otros otros;

    public Caracteristica(CaracteristicaId caracteristicaId, Marca marca, Modelo modelo, Especificaciones especificaciones,
                          Otros otros) {
        super(caracteristicaId);
        this.marca = marca;
        this.modelo = modelo;
        this.especificaciones = especificaciones;
        this.otros = otros;
    }

    public void actualizarEspecificaciones(String especificaciones){
        this.especificaciones = new Especificaciones(especificaciones);
    }

    public void actualizarOtros(String otros){
        this.otros = new Otros(otros);
    }
}
