package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.*;
import co.com.petproject.ventas.generic.values.NombreUsuario;
import co.com.sofka.domain.generic.Command;

public final class AgregarComprador extends Command {
    private final FacturaId facturaId;
    private final CompradorId compradorId;
    private final Nombre nombre;
    private final NombreUsuario nombreUsuario;
    private final Telefono telefono;
    private final Direccion direccion;

    public AgregarComprador(FacturaId facturaId, CompradorId compradorId, Nombre nombre, NombreUsuario nombreUsuario,
                            Telefono telefono, Direccion direccion)
    {

        this.facturaId = facturaId;
        this.compradorId = compradorId;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public CompradorId getCompradorId() {
        return compradorId;
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
}
