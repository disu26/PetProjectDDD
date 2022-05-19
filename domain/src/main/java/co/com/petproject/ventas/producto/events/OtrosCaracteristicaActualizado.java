package co.com.petproject.ventas.producto.events;

import co.com.petproject.ventas.producto.values.CaracteristicaId;
import co.com.petproject.ventas.producto.values.Otros;
import co.com.sofka.domain.generic.DomainEvent;

public final class OtrosCaracteristicaActualizado extends DomainEvent {
    private final CaracteristicaId caracteristicaId;
    private final Otros otros;

    public OtrosCaracteristicaActualizado(CaracteristicaId caracteristicaId, Otros otros) {
        super("co.com.petproject.ventas.producto.events.EspecificacionesDescripcionActualizado");
        this.caracteristicaId = caracteristicaId;
        this.otros = otros;
    }

    public CaracteristicaId getCaracteristicaId() {
        return caracteristicaId;
    }

    public Otros getOtros() {
        return otros;
    }
}
