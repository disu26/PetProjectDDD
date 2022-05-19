package co.com.petproject.ventas.producto;

import co.com.petproject.ventas.producto.events.*;
import co.com.sofka.domain.generic.EventChange;

public final class ProductoEventChange extends EventChange {
    public ProductoEventChange(Producto producto) {
        apply((ProductoCreado event) -> {
            producto.forumId = event.getForumId();
            producto.caracteristica = event.getCaracteristica();
            producto.descripcion = event.getDescripcion();
            producto.stock = event.getStock();
            producto.precio = event.getPrecio();
        });

        apply((PrecioActualizado event) -> producto.precio = event.getPrecio());

        apply((StockActualizado event) -> producto.stock = event.getStock());

        apply((EspecificacionesDescripcionActualizado event) -> producto.descripcion
                .actualizarEspecificaciones(event.getEspecificaciones().value()));

        apply((IntroduccionDescripcionActualizado event) -> producto.descripcion
                .actualizarIntroduccion(event.getIntroduccion().value()));

        apply((EspecificacionesCaracteristicaActualizado event) -> producto.caracteristica
                .actualizarEspecificaciones(event.getEspecificaciones().value()));

        apply((OtrosCaracteristicaActualizado event) -> producto.caracteristica
                .actualizarOtros(event.getOtros().value()));
    }
}
