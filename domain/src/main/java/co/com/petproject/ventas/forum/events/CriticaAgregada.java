package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.forum.values.Calificacion;
import co.com.petproject.ventas.forum.values.Comentario;
import co.com.petproject.ventas.forum.values.CriticaId;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public final class CriticaAgregada extends DomainEvent {
    private final CriticaId criticaId;
    private final Comentario comentario;
    private final Usuario usuario;
    private final Calificacion calificacion;

    public CriticaAgregada(CriticaId criticaId, Comentario comentario, Usuario usuario, Calificacion calificacion) {
        super("co.com.petproject.ventas.forum.events.CriticaAgregada");
        this.criticaId = criticaId;
        this.comentario = comentario;
        this.usuario = usuario;
        this.calificacion = calificacion;
    }

    public CriticaId getCriticaId() {
        return criticaId;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
