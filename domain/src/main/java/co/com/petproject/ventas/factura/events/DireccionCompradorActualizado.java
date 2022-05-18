package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.CompradorId;
import co.com.petproject.ventas.factura.values.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public final class DireccionCompradorActualizado extends DomainEvent {
    private final CompradorId compradorId;
    private final Direccion direccion;

    public DireccionCompradorActualizado(CompradorId compradorId, Direccion direccion) {
        super("co.com.petproject.ventas.factura.events.DireccionCompradorActualizado");
        this.compradorId = compradorId;
        this.direccion = direccion;
    }

    public CompradorId getCompradorId() {
        return compradorId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
