package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.producto.values.DescripcionId;
import co.com.petproject.ventas.producto.values.Introduccion;
import co.com.sofka.domain.generic.DomainEvent;

public final class IntroduccionDescripcionActualizado extends DomainEvent {
    private final DescripcionId descripcionId;
    private final Introduccion introduccion;

    public IntroduccionDescripcionActualizado(DescripcionId descripcionId, Introduccion introduccion) {
        super("co.com.petproject.ventas.producto.events.EspecificacionesDescripcionActualizado");
        this.descripcionId = descripcionId;
        this.introduccion = introduccion;
    }

    public DescripcionId getDescripcionId() {
        return descripcionId;
    }

    public Introduccion getIntroduccion() {
        return introduccion;
    }
}
