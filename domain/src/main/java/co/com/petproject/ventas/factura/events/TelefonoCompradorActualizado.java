package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.CompradorId;
import co.com.petproject.ventas.factura.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public final class TelefonoCompradorActualizado extends DomainEvent {
    private final CompradorId compradorId;
    private final Telefono telefono;

    public TelefonoCompradorActualizado(CompradorId compradorId, Telefono telefono) {
        super("co.com.petproject.ventas.factura.events.TelefonoCompradorActualizado");
        this.compradorId = compradorId;
        this.telefono = telefono;
    }

    public CompradorId getCompradorId() {
        return compradorId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
