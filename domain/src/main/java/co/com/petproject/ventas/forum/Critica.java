package co.com.petproject.ventas.forum;

import co.com.petproject.ventas.forum.values.Calificacion;
import co.com.petproject.ventas.forum.values.Comentario;
import co.com.petproject.ventas.forum.values.CriticaId;
import co.com.petproject.ventas.forum.values.Usuario;
import co.com.sofka.domain.generic.Entity;

public class Critica extends Entity<CriticaId> {
    protected Comentario comentario;
    protected Usuario usuario;
    protected Calificacion calificacion;

    public Critica(CriticaId criticaId, Comentario comentario, Usuario usuario, Calificacion calificacion) {
        super(criticaId);
        this.comentario = comentario;
        this.usuario = usuario;
        this.calificacion = calificacion;
    }

    public  void actualizarComentario(String comentario){
        this.comentario = new Comentario(comentario);
    }

    public  void actualizarCalificacion(Integer calificacion){
        this.calificacion = new Calificacion(calificacion);
    }
}
