package co.com.petproject.ventas.producto.commands;

import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.producto.Caracteristica;
import co.com.petproject.ventas.producto.Descripcion;
import co.com.petproject.ventas.producto.values.Precio;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.petproject.ventas.producto.values.Stock;
import co.com.sofka.domain.generic.Command;

public final class CrearProducto extends Command {
    private final ProductoId productoId;
    private final ForumId forumId;
    private final Caracteristica caracteristica;
    private final Descripcion descripcion;
    private final Stock stock;
    private final Precio precio;

    public CrearProducto(ProductoId productoId, ForumId forumId, Caracteristica caracteristica, Descripcion descripcion,
                         Stock stock, Precio precio)
    {
        this.productoId = productoId;
        this.forumId = forumId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
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
