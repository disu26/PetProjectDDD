package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.CompradorId;
import co.com.petproject.ventas.factura.values.Direccion;
import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarDireccionComprador extends Command {
    private final FacturaId facturaId;
    private final CompradorId compradorId;
    private final Direccion direccion;

    public ActualizarDireccionComprador(FacturaId facturaId, CompradorId compradorId, Direccion direccion) {
        this.facturaId = facturaId;
        this.compradorId = compradorId;
        this.direccion = direccion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public CompradorId getCompradorId() {
        return compradorId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
