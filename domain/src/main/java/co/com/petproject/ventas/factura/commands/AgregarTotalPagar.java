package co.com.petproject.ventas.factura.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.factura.values.TotalPagar;
import co.com.sofka.domain.generic.Command;

public final class AgregarTotalPagar extends Command {
    private final FacturaId facturaId;
    private final TotalPagar totalPagar;

    public AgregarTotalPagar(FacturaId facturaId, TotalPagar totalPagar) {
        this.facturaId = facturaId;
        this.totalPagar = totalPagar;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public TotalPagar getTotalPagar() {
        return totalPagar;
    }
}
