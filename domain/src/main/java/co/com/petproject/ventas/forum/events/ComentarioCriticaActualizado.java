package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.forum.values.Comentario;
import co.com.petproject.ventas.forum.values.CriticaId;
import co.com.sofka.domain.generic.DomainEvent;

public final class ComentarioCriticaActualizado extends DomainEvent {
    private final CriticaId criticaId;
    private final Comentario comentario;

    public ComentarioCriticaActualizado(CriticaId criticaId, Comentario comentario) {
        super("co.com.petproject.ventas.forum.events.CriticaAgregada");
        this.criticaId = criticaId;
        this.comentario = comentario;
    }

    public CriticaId getCriticaId() {
        return criticaId;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
