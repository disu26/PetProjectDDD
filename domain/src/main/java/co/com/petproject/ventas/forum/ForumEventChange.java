package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.events.*;
import co.com.sofka.domain.generic.EventChange;

public final class ForumEventChange extends EventChange {
    public ForumEventChange(Forum forum) {
        apply((ForumCreado event) -> forum.fecha = event.getFecha());

        apply((PreguntaAgregada event) -> {
            var preguntaId = event.getPreguntaId();
            var pregunta = new Pregunta(preguntaId, event.getDescripcion(), event.getUsuario());
            forum.preguntas.put(preguntaId, pregunta);
        });

        apply((CriticaAgregada event) -> {
            var criticaId = event.getCriticaId();
            var critica = new Critica(criticaId, event.getComentario(), event.getUsuario(), event.getCalificacion());
            forum.criticas.put(criticaId, critica);
        });

        apply((DescripcionPreguntaActualizada event) -> forum.preguntas.get(event.getPreguntaId())
                                                        .actualizarDescripcion(event.getDescripcion().value()));

        apply((RespuestaAPreguntaAgregada event) -> forum.preguntas.get(event.getPreguntaId())
                .agregarRespuesta(event.getRespuesta()));

        apply((RespuestaAPreguntaActualizada event) -> forum.preguntas.get(event.getPreguntaId())
                .actualizarRespuesta(event.getRespuesta().value()));

        apply((ComentarioCriticaActualizado event) -> forum.criticas.get(event.getCriticaId())
                .actualizarComentario(event.getComentario().value()));

        apply((CalificacionCriticaActualizada event) -> forum.criticas.get(event.getCriticaId())
                .actualizarCalificacion(event.getCalificacion().value()));
    }
}
