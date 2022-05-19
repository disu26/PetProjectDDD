package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.petproject.ventas.forum.values.Respuesta;
import co.com.sofka.domain.generic.DomainEvent;

public final class RespuestaAPreguntaAgregada extends DomainEvent {
    private final PreguntaId preguntaId;
    private final Respuesta respuesta;

    public RespuestaAPreguntaAgregada(PreguntaId preguntaId, Respuesta respuesta) {
        super("co.com.petproject.ventas.forum.events.RespuestaAPreguntaAgregada");
        this.preguntaId = preguntaId;
        this.respuesta = respuesta;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }
}
