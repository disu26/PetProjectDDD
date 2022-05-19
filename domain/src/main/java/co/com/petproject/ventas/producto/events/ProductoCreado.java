package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.producto.Caracteristica;
import co.com.petproject.ventas.producto.Descripcion;
import co.com.petproject.ventas.producto.values.Precio;
import co.com.petproject.ventas.producto.values.Stock;
import co.com.sofka.domain.generic.DomainEvent;

public final class ProductoCreado extends DomainEvent {
    private final ForumId forumId;
    private final Caracteristica caracteristica;
    private final Descripcion descripcion;
    private final Stock stock;
    private final Precio precio;

    public ProductoCreado(ForumId forumId, Caracteristica caracteristica, Descripcion descripcion, Stock stock,
                          Precio precio)
    {
        super("co.com.petproject.ventas.producto.events.ProductoCreado");
        this.forumId = forumId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public ForumId getForumId() {
        return forumId;
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
