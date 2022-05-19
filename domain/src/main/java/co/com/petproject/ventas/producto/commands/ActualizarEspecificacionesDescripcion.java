package co.com.petproject.ventas.producto.commands;

import co.com.petproject.ventas.producto.values.DescripcionId;
import co.com.petproject.ventas.producto.values.Especificaciones;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarEspecificacionesDescripcion extends Command {
    private final ProductoId productoId;
    private final DescripcionId descripcionId;
    private final Especificaciones especificaciones;

    public ActualizarEspecificacionesDescripcion(ProductoId productoId, DescripcionId descripcionId,
                                                 Especificaciones especificaciones)
    {
        this.productoId = productoId;
        this.descripcionId = descripcionId;
        this.especificaciones = especificaciones;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public DescripcionId getDescripcionId() {
        return descripcionId;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
