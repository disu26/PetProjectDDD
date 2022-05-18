package co.com.petproject.ventas.factura;

import co.com.petproject.ventas.factura.values.*;
import co.com.sofka.domain.generic.Entity;

public final class Comprador extends Entity<CompradorId> {
    protected Nombre nombre;
    protected NombreUsuario nombreUsuario;
    protected Telefono telefono;
    protected Direccion direccion;

    public Comprador(CompradorId compradorId, Nombre nombre, NombreUsuario nombreUsuario, Telefono telefono,
                     Direccion direccion)
    {
        super(compradorId);
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}
