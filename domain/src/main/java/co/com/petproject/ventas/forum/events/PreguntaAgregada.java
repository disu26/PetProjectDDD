package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.forum.values.Descripcion;
import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public final class PreguntaAgregada extends DomainEvent {
    private PreguntaId preguntaId;
    private Descripcion descripcion;
    private Usuario usuario;

    public PreguntaAgregada(PreguntaId preguntaId, Descripcion descripcion, Usuario usuario) {
        super("co.com.petproject.ventas.forum.events.PreguntaAgregada");
        this.preguntaId = preguntaId;
        this.descripcion = descripcion;
        this.usuario = usuario;
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
