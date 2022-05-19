package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.factura.values.MedioPago;
import co.com.sofka.domain.generic.Command;

public final class AgregarMedioPago extends Command {
    private final FacturaId facturaId;
    private final MedioPago medioPago;

    public AgregarMedioPago(FacturaId facturaId, MedioPago medioPago) {
        this.facturaId = facturaId;
        this.medioPago = medioPago;
    }

    public MedioPago getMedioPago() {
        return medioPago;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
