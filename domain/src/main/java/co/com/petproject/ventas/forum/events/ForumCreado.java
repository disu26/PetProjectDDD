package co.com.petproject.ventas.forum.events;

import co.com.petproject.ventas.generic.values.Fecha;
import co.com.sofka.domain.generic.DomainEvent;


public final class ForumCreado extends DomainEvent {
    private final Fecha fecha;

    public ForumCreado(Fecha fecha){
        super("co.com.petproject.ventas.forum.events.ForumCreado");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
