package co.com.petproject.ventas.producto;

import co.com.petproject.ventas.producto.events.PrecioActualizado;
import co.com.petproject.ventas.producto.events.ProductoCreado;
import co.com.petproject.ventas.producto.events.StockActualizado;
import co.com.sofka.domain.generic.EventChange;

public final class ProductoEventChange extends EventChange {
    public ProductoEventChange(Producto producto) {
        apply((ProductoCreado event) -> {
            producto.caracteristica = event.getCaracteristica();
            producto.descripcion = event.getDescripcion();
            producto.stock = event.getStock();
            producto.precio = event.getPrecio();
        });

        apply((PrecioActualizado event) -> producto.precio = event.getPrecio());

        apply((StockActualizado event) -> producto.stock = event.getStock());
    }
}
