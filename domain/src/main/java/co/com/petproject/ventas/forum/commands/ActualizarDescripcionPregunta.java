package co.com.petproject.ventas.forum.commands;

import co.com.petproject.ventas.forum.values.Descripcion;
import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarDescripcionPregunta extends Command {
    private final ForumId forumId;
    private final PreguntaId preguntaId;
    private final Descripcion descripcion;

    public ActualizarDescripcionPregunta(ForumId forumId, PreguntaId preguntaId, Descripcion descripcion) {
        this.forumId = forumId;
        this.preguntaId = preguntaId;
        this.descripcion = descripcion;
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
}
