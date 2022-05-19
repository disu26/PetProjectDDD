package co.com.petproject.ventas.producto.commands;

import co.com.petproject.ventas.producto.values.CaracteristicaId;
import co.com.petproject.ventas.producto.values.Otros;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.Command;

public final class ActualizarOtrasCaracteristicas extends Command {
    private final ProductoId productoId;
    private final CaracteristicaId caracteristicaId;
    private final Otros otros;

    public ActualizarOtrasCaracteristicas(ProductoId productoId, CaracteristicaId caracteristicaId, Otros otros) {
        this.productoId = productoId;
        this.caracteristicaId = caracteristicaId;
        this.otros = otros;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public CaracteristicaId getCaracteristicaId() {
        return caracteristicaId;
    }

    public Otros getOtros() {
        return otros;
    }
}
