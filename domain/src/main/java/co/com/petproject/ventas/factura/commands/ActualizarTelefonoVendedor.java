package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.factura.values.Telefono;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarTelefonoVendedor extends Command {
    private final FacturaId facturaId;
    private final VendedorId vendedorId;
    private final Telefono telefono;

    public ActualizarTelefonoVendedor(FacturaId facturaId, VendedorId vendedorId, Telefono telefono) {
        this.facturaId = facturaId;
        this.vendedorId = vendedorId;
        this.telefono = telefono;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
