package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.values.Descripcion;
import co.com.petproject.ventas.forum.values.PreguntaId;
import co.com.petproject.ventas.forum.values.Respuesta;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.Entity;

public class Pregunta extends Entity<PreguntaId> {
    protected Descripcion descripcion;
    protected Usuario usuario;
    protected Respuesta respuesta;

    public Pregunta(PreguntaId preguntaId, Descripcion descripcion, Usuario usuario) {
        super(preguntaId);
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public void actualizarDescripcion(String descripcion){
        this.descripcion = new Descripcion(descripcion);
    }

    public void agregarRespuesta(Respuesta respuesta){
        this.respuesta = respuesta;
    }

    public void actualizarRespuesta(String respuesta){
        this.respuesta = new Respuesta(respuesta);
    }
}
