package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.TotalPagar;
import co.com.sofka.domain.generic.DomainEvent;

public final class TotalPagarAgregado extends DomainEvent {
    private final TotalPagar totalPagar;

    public TotalPagarAgregado(TotalPagar totalPagar) {
        super("co.com.petproject.ventas.factura.events.TotalPagarAgregado");
        this.totalPagar = totalPagar;
    }

    public TotalPagar getTotalPagar() {
        return totalPagar;
    }
}
