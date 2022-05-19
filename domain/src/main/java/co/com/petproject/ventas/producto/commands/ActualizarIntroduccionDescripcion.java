package co.com.petproject.ventas.producto.commands;

import co.com.petproject.ventas.producto.values.DescripcionId;
import co.com.petproject.ventas.producto.values.Introduccion;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarIntroduccionDescripcion extends Command {
    private final ProductoId productoId;
    private final DescripcionId descripcionId;
    private final Introduccion introduccion;

    public ActualizarIntroduccionDescripcion(ProductoId productoId, DescripcionId descripcionId, Introduccion introduccion) {
        this.productoId = productoId;
        this.descripcionId = descripcionId;
        this.introduccion = introduccion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public DescripcionId getDescripcionId() {
        return descripcionId;
    }

    public Introduccion getIntroduccion() {
        return introduccion;
    }
}
