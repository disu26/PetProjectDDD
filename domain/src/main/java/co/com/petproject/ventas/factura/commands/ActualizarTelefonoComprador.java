package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.CompradorId;
import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.factura.values.Telefono;
import co.com.sofka.domain.generic.Command;

public final class ActualizarTelefonoComprador extends Command {
    private final FacturaId facturaId;
    private final CompradorId compradorId;
    private final Telefono telefono;

    public ActualizarTelefonoComprador(FacturaId facturaId, CompradorId compradorId, Telefono telefono) {
        this.facturaId = facturaId;
        this.compradorId = compradorId;
        this.telefono = telefono;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public CompradorId getCompradorId() {
        return compradorId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
