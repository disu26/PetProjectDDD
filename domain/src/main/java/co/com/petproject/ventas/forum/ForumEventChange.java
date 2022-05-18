package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.events.ForumCreado;
import co.com.petproject.ventas.forum.events.PreguntaAgregada;
import co.com.petproject.ventas.forum.events.ReseñaAgregada;
import co.com.sofka.domain.generic.EventChange;

public final class ForumEventChange extends EventChange {
    public ForumEventChange(Forum forum) {
        apply((ForumCreado event) -> forum.fecha = event.getFecha());

        apply((PreguntaAgregada event) -> {
            var preguntaId = event.getPreguntaId();
            var pregunta = new Pregunta(preguntaId, event.getDescripcion(), event.getUsuario());
            forum.preguntas.add(pregunta);
        });

        apply((ReseñaAgregada event) -> {
            var reseñaId = event.getReseñaId();
            var reseña = new Reseña(reseñaId, event.getComentario(), event.getUsuario(), event.getCalificacion());
            forum.reseñas.add(reseña);
        });
    }
}
