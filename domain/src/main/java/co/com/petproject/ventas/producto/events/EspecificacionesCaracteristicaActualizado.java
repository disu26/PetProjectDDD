package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.producto.values.CaracteristicaId;
import co.com.petproject.ventas.producto.values.Especificaciones;
import co.com.sofka.domain.generic.DomainEvent;

public final class EspecificacionesCaracteristicaActualizado extends DomainEvent {
    private final CaracteristicaId caracteristicaId;
    private final Especificaciones especificaciones;

    public EspecificacionesCaracteristicaActualizado(CaracteristicaId caracteristicaId, Especificaciones especificaciones) {
        super("co.com.petproject.ventas.producto.events.EspecificacionesCaracteristicaActualizado");
        this.caracteristicaId = caracteristicaId;
        this.especificaciones = especificaciones;
    }

    public CaracteristicaId getCaracteristicaId() {
        return caracteristicaId;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
