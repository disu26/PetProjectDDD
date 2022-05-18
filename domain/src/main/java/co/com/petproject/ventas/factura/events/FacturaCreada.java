package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.Fecha;
import co.com.sofka.domain.generic.DomainEvent;

public final class FacturaCreada extends DomainEvent {
    private final Fecha fecha;

    public FacturaCreada(Fecha fecha) {
        super("co.com.petproject.ventas.factura.FacturaCreada");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
