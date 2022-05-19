package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.forum.values.Descripcion;
import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.sofka.domain.generic.DomainEvent;

public final class DescripcionPreguntaActualizada extends DomainEvent {
    private final PreguntaId preguntaId;
    private final Descripcion descripcion;

    public DescripcionPreguntaActualizada(PreguntaId preguntaId, Descripcion descripcion) {
        super("co.com.petproject.ventas.forum.events.DescripcionPreguntaActualizada");
        this.preguntaId = preguntaId;
        this.descripcion = descripcion;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
