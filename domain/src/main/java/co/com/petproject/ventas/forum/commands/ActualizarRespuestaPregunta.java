package co.com.petproject.ventas.forum.commands;

import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.petproject.ventas.forum.values.Respuesta;
import co.com.sofka.domain.generic.Command;

public final class ActualizarRespuestaPregunta extends Command {
    private final ForumId forumId;
    private final PreguntaId preguntaId;
    private final Respuesta respuesta;

    public ActualizarRespuestaPregunta(ForumId forumId, PreguntaId preguntaId, Respuesta respuesta) {
        this.forumId = forumId;
        this.preguntaId = preguntaId;
        this.respuesta = respuesta;
    }

    public ForumId getForumId() {
        return forumId;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }
}
