package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.producto.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public final class PrecioActualizado extends DomainEvent {
    private Precio precio;

    public PrecioActualizado(Precio precio) {
        super("co.com.petproject.ventas.producto.events.PrecioActualizado");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
