package co.com.petproject.ventas.forum.commands;

import co.com.petproject.ventas.forum.values.*;
import co.com.sofka.domain.generic.Command;

public final class AgregarCritica extends Command {
    private final ForumId forumId;
    private final CriticaId criticaId;
    private final Comentario comentario;
    private final Usuario usuario;
    private final Calificacion calificacion;

    public AgregarCritica(ForumId forumId, CriticaId criticaId, Comentario comentario, Usuario usuario, Calificacion calificacion) {
        this.forumId = forumId;
        this.criticaId = criticaId;
        this.comentario = comentario;
        this.usuario = usuario;
        this.calificacion = calificacion;
    }

    public ForumId getForumId() {
        return forumId;
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
