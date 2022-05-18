package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.producto.Caracteristica;
import co.com.petproject.ventas.producto.Descripcion;
import co.com.petproject.ventas.producto.values.Precio;
import co.com.petproject.ventas.producto.values.Stock;
import co.com.sofka.domain.generic.DomainEvent;

public final class ProductoCreado extends DomainEvent {
    private Caracteristica caracteristica;
    private Descripcion descripcion;
    private Stock stock;
    private Precio precio;

    public ProductoCreado(Caracteristica caracteristica, Descripcion descripcion, Stock stock, Precio precio) {
        super("co.com.petproject.ventas.producto.events.ProductoCreado");
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Stock getStock() {
        return stock;
    }

    public Precio getPrecio() {
        return precio;
    }
}
