package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.events.ForumCreado;
import co.com.petproject.ventas.forum.events.PreguntaAgregada;
import co.com.petproject.ventas.forum.events.ReseñaAgregada;
import co.com.petproject.ventas.forum.values.*;
import co.com.petproject.ventas.generic.values.Fecha;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public final class Forum extends AggregateEvent<ForumId> {
    protected Set<Pregunta> preguntas;
    protected Set<Reseña> reseñas;
    protected Fecha fecha;

    public Forum(ForumId forumId, Fecha fecha) {
        super(forumId);
        appendChange(new ForumCreado(fecha)).apply();
        subscribe(new ForumEventChange(this));
    }

    private Forum(ForumId forumId){
        super(forumId);
        subscribe(new ForumEventChange(this));
    }

    public static Forum from(ForumId forumId, List<DomainEvent> events){
        var forum = new Forum(forumId);
        events.forEach(forum::applyEvent);
        return forum;
    }

    public void agregarPregunta(Descripcion descripcion, Usuario usuario){
        var preguntaId = new PreguntaId();
        appendChange(new PreguntaAgregada(preguntaId, descripcion, usuario)).apply();
    }

    public void agregarReseña(Comentario comentario, Usuario usuario, Calificacion calificacion){
        var reseñaId = new ReseñaId();
        appendChange(new ReseñaAgregada(reseñaId, comentario, usuario, calificacion)).apply();
    }
}
