package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.values.Calificacion;
import co.com.petproject.ventas.forum.values.Comentario;
import co.com.petproject.ventas.forum.values.ReseñaId;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.Entity;

public final class Reseña extends Entity<ReseñaId> {
    protected Comentario comentario;
    protected Usuario usuario;
    protected Calificacion calificacion;

    public Reseña(ReseñaId entityId, Comentario comentario, Usuario usuario, Calificacion calificacion) {
        super(entityId);
        this.comentario = comentario;
        this.usuario = usuario;
        this.calificacion = calificacion;
    }
}
