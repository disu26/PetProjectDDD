package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.producto.values.DescripcionId;
import co.com.petproject.ventas.producto.values.Especificaciones;
import co.com.sofka.domain.generic.DomainEvent;

public final class EspecificacionesDescripcionActualizado extends DomainEvent {
    private final DescripcionId descripcionId;
    private final Especificaciones especificaciones;

    public EspecificacionesDescripcionActualizado(DescripcionId descripcionId, Especificaciones especificaciones) {
        super("co.com.petproject.ventas.producto.events.EspecificacionesDescripcionActualizado");
        this.descripcionId = descripcionId;
        this.especificaciones = especificaciones;
    }

    public DescripcionId getDescripcionId() {
        return descripcionId;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
