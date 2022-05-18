package co.com.petproject.ventas.factura.events;

import co.com.petproject.ventas.factura.values.MedioPago;
import co.com.sofka.domain.generic.DomainEvent;

public final class MedioPagoAgregado extends DomainEvent {
    private final MedioPago medioPago;

    public MedioPagoAgregado(MedioPago medioPago) {
        super("co.com.petproject.ventas.factura.MedioPagoAgregado");
        this.medioPago = medioPago;
    }

    public MedioPago getMedioPago() {
        return medioPago;
    }
}
