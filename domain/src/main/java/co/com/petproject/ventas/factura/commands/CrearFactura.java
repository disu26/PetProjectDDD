package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.generic.values.Fecha;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public final class CrearFactura extends Command {
    private final FacturaId facturaId;
    private final ProductoId productoId;
    private final Fecha fecha;

    public CrearFactura(FacturaId facturaId, ProductoId productoId, Fecha fecha) {
        this.facturaId = facturaId;
        this.productoId = productoId;
        this.fecha = fecha;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
