package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.factura.values.Nombre;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarNombreVendedor extends Command {
    private final FacturaId facturaId;
    private final VendedorId vendedorId;
    private final Nombre nombre;

    public ActualizarNombreVendedor(FacturaId facturaId, VendedorId vendedorId, Nombre nombre) {
        this.facturaId = facturaId;
        this.vendedorId = vendedorId;
        this.nombre = nombre;
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
}
