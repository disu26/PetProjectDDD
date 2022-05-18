package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.values.Descripcion;
import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.petproject.ventas.forum.values.Respuesta;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.Entity;

public final class Pregunta extends Entity<PreguntaId> {
    protected Descripcion descripcion;
    protected Usuario usuario;
    protected Respuesta respuesta;

    public Pregunta(PreguntaId preguntaId, Descripcion descripcion, Usuario usuario) {
        super(preguntaId);
        this.descripcion = descripcion;
        this.usuario = usuario;
    }


}
