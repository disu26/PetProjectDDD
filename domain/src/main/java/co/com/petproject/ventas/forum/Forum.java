package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.events.*;
import co.com.petproject.ventas.forum.values.*;
import co.com.petproject.ventas.generic.values.Fecha;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Map;

public class Forum extends AggregateEvent<ForumId> {
    protected Map<PreguntaId, Pregunta> preguntas;
    protected Map<CriticaId, Critica> criticas;
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

    public void agregarCritca(Comentario comentario, Usuario usuario, Calificacion calificacion){
        var criticaId = new CriticaId();
        appendChange(new CriticaAgregada(criticaId, comentario, usuario, calificacion)).apply();
    }

    public void actualizarDescripcionPregunta(PreguntaId preguntaId, Descripcion descripcion){
        appendChange(new DescripcionPreguntaActualizada(preguntaId, descripcion)).apply();
    }

    public void agregarRespuestaPregunta(PreguntaId preguntaId, Respuesta respuesta){
        appendChange(new RespuestaAPreguntaAgregada(preguntaId, respuesta)).apply();
    }

    public void actualizarRespuestaPregunta(PreguntaId preguntaId, Respuesta respuesta){
        appendChange(new RespuestaAPreguntaActualizada(preguntaId, respuesta)).apply();
    }

    public void actualizarComentarioCritica(CriticaId criticaId, Comentario comentario){
        appendChange(new ComentarioCriticaActualizado(criticaId, comentario)).apply();
    }

    public void actualizarCalificacionCritica(CriticaId criticaId, Calificacion calificacion){
        appendChange(new CalificacionCriticaActualizada(criticaId, calificacion)).apply();
    }

    public Fecha fecha() {
        return fecha;
    }

    public Map<PreguntaId, Pregunta> preguntas() {
        return preguntas;
    }

    public Map<CriticaId, Critica> criticas() {
        return criticas;
    }
}
