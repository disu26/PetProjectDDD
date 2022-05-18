package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.Nombre;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public final class NombreVendedorActualizado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Nombre nombre;

    public NombreVendedorActualizado(VendedorId vendedorId, Nombre nombre) {
        super("co.com.petproject.ventas.factura.NombreVendedorActualizado");
        this.vendedorId = vendedorId;
        this.nombre = nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
