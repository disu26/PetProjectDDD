package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.Ubicacion;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public final class UbicacionVendedorActualizada extends DomainEvent {
    private final VendedorId vendedorId;
    private final Ubicacion ubicacion;

    public UbicacionVendedorActualizada(VendedorId vendedorId, Ubicacion ubicacion) {
        super("co.com.petproject.ventas.factura.events.DireccionCompradorActualizado");
        this.vendedorId = vendedorId;
        this.ubicacion = ubicacion;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
