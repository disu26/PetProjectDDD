package co.com.petproject.ventas.producto;

import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.producto.events.*;
import co.com.petproject.ventas.producto.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class Producto extends AggregateEvent<ProductoId> {
    protected ForumId forumId;
    protected Caracteristica caracteristica;
    protected Descripcion descripcion;
    protected Stock stock;
    protected Precio precio;

    public Producto(ProductoId productoId, ForumId forumId, Caracteristica caracteristica, Descripcion descripcion,
                    Stock stock, Precio precio)
    {
        super(productoId);
        appendChange(new ProductoCreado(forumId, caracteristica, descripcion, stock, precio)).apply();
        subscribe(new ProductoEventChange(this));
    }

    private Producto(ProductoId productoId){
        super(productoId);
        subscribe(new ProductoEventChange(this));
    }

    public Producto from(ProductoId productoId, List<DomainEvent> events){
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

    public void actualizarEspecificacionesDescripcion(DescripcionId descripcionId,Especificaciones especificaciones){
        appendChange(new EspecificacionesDescripcionActualizado(descripcionId, especificaciones)).apply();
    }

    public void actualizarIntroduccionDescripcion(DescripcionId descripcionId,Introduccion introduccion){
        appendChange(new IntroduccionDescripcionActualizado(descripcionId, introduccion)).apply();
    }

    public void actualizarEspecificacionesCaracteristica(CaracteristicaId caracteristicaId,Especificaciones especificaciones){
        appendChange(new EspecificacionesCaracteristicaActualizado(caracteristicaId, especificaciones)).apply();
    }

    public void actualizarOtrosCaracteristica(CaracteristicaId caracteristicaId,Otros otros){
        appendChange(new OtrosCaracteristicaActualizado(caracteristicaId, otros)).apply();
    }

    public ForumId forumId() {
        return forumId;
    }

    public Caracteristica caracteristica() {
        return caracteristica;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Stock stock() {
        return stock;
    }

    public Precio precio() {
        return precio;
    }
}
