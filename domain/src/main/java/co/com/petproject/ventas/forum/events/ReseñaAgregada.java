package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.forum.values.Calificacion;
import co.com.petproject.ventas.forum.values.Comentario;
import co.com.petproject.ventas.forum.values.ReseñaId;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public final class ReseñaAgregada extends DomainEvent {
    private ReseñaId reseñaId;
    private Comentario comentario;
    private Usuario usuario;
    private Calificacion calificacion;

    public ReseñaAgregada(ReseñaId reseñaId, Comentario comentario, Usuario usuario, Calificacion calificacion) {
        super("co.com.petproject.ventas.forum.events.ReseñaAgregada");
        this.reseñaId = reseñaId;
        this.comentario = comentario;
        this.usuario = usuario;
        this.calificacion = calificacion;
    }

    public ReseñaId getReseñaId() {
        return reseñaId;
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
