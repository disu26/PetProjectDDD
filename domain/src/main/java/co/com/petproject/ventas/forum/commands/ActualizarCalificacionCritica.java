package co.com.petproject.ventas.forum.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.forum.values.Calificacion;
import co.com.petproject.ventas.forum.values.CriticaId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarCalificacionCritica extends Command {
    private final FacturaId facturaId;
    private final CriticaId criticaId;
    private final Calificacion calificacion;

    public ActualizarCalificacionCritica(FacturaId facturaId, CriticaId criticaId, Calificacion calificacion) {
        this.facturaId = facturaId;
        this.criticaId = criticaId;
        this.calificacion = calificacion;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public CriticaId getCriticaId() {
        return criticaId;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
