package co.com.petproject.ventas.producto.commands;

import co.com.petproject.ventas.producto.values.Precio;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarPrecio extends Command {
    private final ProductoId productoId;
    private final Precio precio;

    public ActualizarPrecio(ProductoId productoId, Precio precio) {
        this.productoId = productoId;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
