package co.com.petproject.ventas.producto;

import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.producto.events.PrecioActualizado;
import co.com.petproject.ventas.producto.events.ProductoCreado;
import co.com.petproject.ventas.producto.events.StockActualizado;
import co.com.petproject.ventas.producto.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public final class Producto extends AggregateEvent<ProductoId> {
    protected ForumId forumId;
    protected Caracteristica caracteristica;
    protected Descripcion descripcion;
    protected Stock stock;
    protected Precio precio;

    public Producto(ProductoId productoId, Caracteristica caracteristica, Descripcion descripcion, Stock stock,
                    Precio precio)
    {
        super(productoId);
        appendChange(new ProductoCreado(caracteristica, descripcion, stock, precio)).apply();
        subscribe(new ProductoEventChange(this));
    }

    private Producto(ProductoId productoId){
        super(productoId);
        subscribe(new ProductoEventChange(this));
    }

    private Producto from(ProductoId productoId, List<DomainEvent> events){
        var producto = new Producto(productoId);
        events.forEach(producto::applyEvent);
        return producto;
    }

    public void actualizarPrecio(Precio precio){
        appendChange(new PrecioActualizado(precio)).apply();
    }

    public void actualizarStock(Stock stock){
        appendChange(new StockActualizado(stock)).apply();
    }
}
