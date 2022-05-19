package co.com.petproject.ventas.producto.commands;

import co.com.petproject.ventas.producto.values.CaracteristicaId;
import co.com.petproject.ventas.producto.values.Especificaciones;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarEspecificacionesCaracteristica extends Command {
    private final ProductoId productoId;
    private final CaracteristicaId caracteristicaId;
    private final Especificaciones especificaciones;

    public ActualizarEspecificacionesCaracteristica(ProductoId productoId, CaracteristicaId caracteristicaId,
                                                    Especificaciones especificaciones)
    {
        this.productoId = productoId;
        this.caracteristicaId = caracteristicaId;
        this.especificaciones = especificaciones;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public CaracteristicaId getCaracteristicaId() {
        return caracteristicaId;
    }

    public Especificaciones getEspecificaciones() {
        return especificaciones;
    }
}
