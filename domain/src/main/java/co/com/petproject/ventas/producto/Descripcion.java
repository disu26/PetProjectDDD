package co.com.petproject.ventas.producto;

import co.com.petproject.ventas.producto.values.*;
import co.com.sofka.domain.generic.Entity;

public class Descripcion extends Entity<DescripcionId> {
    protected Introduccion introduccion;
    protected Dimensiones dimensiones;
    protected Especificaciones especificaciones;
    protected Contenido contenido;

    public Descripcion(DescripcionId descripcionId, Introduccion introduccion, Dimensiones dimensiones,
                       Especificaciones especificaciones, Contenido contenido)
    {
        super(descripcionId);
        this.introduccion = introduccion;
        this.dimensiones = dimensiones;
        this.especificaciones = especificaciones;
        this.contenido = contenido;
    }

    public void actualizarEspecificaciones(String especificaciones){
        this.especificaciones = new Especificaciones(especificaciones);
    }

    public void actualizarIntroduccion(String introduccion){
        this.introduccion = new Introduccion(introduccion);
    }
}
