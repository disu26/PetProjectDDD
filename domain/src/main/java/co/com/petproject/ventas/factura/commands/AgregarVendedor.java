package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.*;
import co.com.sofka.domain.generic.Command;

public final class AgregarVendedor extends Command {
    private final FacturaId facturaId;
    private final VendedorId vendedorId;
    private final Nombre nombre;
    private final Ubicacion ubicacion;
    private final Telefono telefono;

    public AgregarVendedor(FacturaId facturaId, VendedorId vendedorId, Nombre nombre, Ubicacion ubicacion,
                           Telefono telefono)
    {
        this.facturaId = facturaId;
        this.vendedorId = vendedorId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }

    public FacturaId getFacturaId() {
        return facturaId;
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
