package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.Nombre;
import co.com.petproject.ventas.factura.values.Telefono;
import co.com.petproject.ventas.factura.values.Ubicacion;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.DomainEvent;

public final class VendedorAgregado extends DomainEvent {
    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final Ubicacion ubicacion;
    private final Telefono telefono;

    public VendedorAgregado(VendedorId vendedorId, Nombre nombre, Ubicacion ubicacion, Telefono telefono) {
        super("co.com.petproject.ventas.factura.VendedorAgregado");
        this.vendedorId = vendedorId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
