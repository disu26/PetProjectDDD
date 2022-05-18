package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.Telefono;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public final class TelefonoVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Telefono telefono;

    public TelefonoVendedorActualizado(VendedorId vendedorId, Telefono telefono) {
        super("co.com.petproject.ventas.factura.events.TelefonoVendedorActualizado");
        this.vendedorId = vendedorId;
        this.telefono = telefono;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
