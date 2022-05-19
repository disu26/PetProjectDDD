package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.forum.values.Calificacion;
import co.com.petproject.ventas.forum.values.CriticaId;
import co.com.sofka.domain.generic.DomainEvent;

public final class CalificacionCriticaActualizada extends DomainEvent {
    private final CriticaId criticaId;
    private final Calificacion calificacion;

    public CalificacionCriticaActualizada(CriticaId criticaId, Calificacion calificacion) {
        super("co.com.petproject.ventas.forum.events.CalificacionCriticaActualizada");
        this.criticaId = criticaId;
        this.calificacion = calificacion;
    }

    public CriticaId getCriticaId() {
        return criticaId;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
