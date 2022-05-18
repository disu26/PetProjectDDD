package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.Direccion;
import co.com.petproject.ventas.factura.values.Nombre;
import co.com.petproject.ventas.factura.values.Telefono;
import co.com.petproject.ventas.factura.values.CompradorId;
import co.com.petproject.ventas.generic.values.NombreUsuario;
import co.com.sofka.domain.generic.DomainEvent;

public final class CompradorAgregado extends DomainEvent {
    private final CompradorId compradorId;
    private final Nombre nombre;
    private final NombreUsuario nombreUsuario;
    private final Telefono telefono;
    private final Direccion direccion;

    public CompradorAgregado(CompradorId compradorId, Nombre nombre, NombreUsuario nombreUsuario,
                             Telefono telefono, Direccion direccion)
    {
        super("co.com.petproject.ventas.factura.CompradorAgregado");
        this.compradorId = compradorId;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public NombreUsuario getNombreUsuario() {
        return nombreUsuario;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public CompradorId getCompradorId() {
        return compradorId;
    }
}
