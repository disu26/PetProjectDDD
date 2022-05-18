package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.generic.values.Fecha;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public final class FacturaCreada extends DomainEvent {
    private final Fecha fecha;
    private final ProductoId productoId;

    public FacturaCreada(Fecha fecha, ProductoId productoId) {
        super("co.com.petproject.ventas.factura.FacturaCreada");
        this.fecha = fecha;
        this.productoId = productoId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public ProductoId getProductoId(){
        return productoId;
    }
}
