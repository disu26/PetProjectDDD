package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.producto.values.Stock;
import co.com.sofka.domain.generic.DomainEvent;

public final class StockActualizado extends DomainEvent {
    private Stock stock;

    public StockActualizado(Stock stock) {
        super("co.com.petproject.ventas.producto.events.StockActualizado");
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }
}
