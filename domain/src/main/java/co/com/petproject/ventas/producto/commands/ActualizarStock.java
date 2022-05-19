package co.com.petproject.ventas.producto.commands;

import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.petproject.ventas.producto.values.Stock;
import co.com.sofka.domain.generic.Command;

public final class ActualizarStock extends Command {
    private final ProductoId productoId;
    private final Stock stock;

    public ActualizarStock(ProductoId productoId, Stock stock) {
        this.productoId = productoId;
        this.stock = stock;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Stock getStock() {
        return stock;
    }
}
