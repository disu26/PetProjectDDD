package co.com.petproject.ventas.forum.commands;

import co.com.petproject.ventas.forum.values.Descripcion;
import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.Command;

public final class AgregarPregunta extends Command {
    private final ForumId forumId;
    private final PreguntaId preguntaId;
    private final Descripcion descripcion;
    private final Usuario usuario;

    public AgregarPregunta(ForumId forumId, PreguntaId preguntaId, Descripcion descripcion, Usuario usuario) {
        this.forumId = forumId;
        this.preguntaId = preguntaId;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public ForumId getForumId() {
        return forumId;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
