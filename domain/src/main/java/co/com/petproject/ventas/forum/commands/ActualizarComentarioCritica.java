package co.com.petproject.ventas.forum.commands;

import co.com.petproject.ventas.factura.values.FacturaId;
import co.com.petproject.ventas.forum.values.Comentario;
import co.com.petproject.ventas.forum.values.CriticaId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarComentarioCritica extends Command {
    private final FacturaId facturaId;
    private final CriticaId criticaId;
    private final Comentario comentario;

    public ActualizarComentarioCritica(FacturaId facturaId, CriticaId criticaId, Comentario comentario) {
        this.facturaId = facturaId;
        this.criticaId = criticaId;
        this.comentario = comentario;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public CriticaId getCriticaId() {
        return criticaId;
    }

    public Comentario getComentario() {
        return comentario;
    }
}
