package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.factura.values.Ubicacion;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarUbicacionVendedor extends Command {
    private final FacturaId facturaId;
    private final VendedorId vendedorId;
    private final Ubicacion ubicacion;

    public ActualizarUbicacionVendedor(FacturaId facturaId, VendedorId vendedorId, Ubicacion ubicacion) {
        this.facturaId = facturaId;
        this.vendedorId = vendedorId;
        this.ubicacion = ubicacion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
