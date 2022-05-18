package co.com.petproject.ventas.factura;

import co.com.petproject.ventas.factura.events.*;
import co.com.sofka.domain.generic.EventChange;

public final class FacturaEventChange extends EventChange {
    public FacturaEventChange(Factura factura) {
        apply((FacturaCreada event) -> factura.fecha = event.getFecha());

        apply((VendedorAgregado event) -> {
            var vendedorId = event.getVendedorId();
            factura.vendedor = new Vendedor(vendedorId, event.getNombre(), event.getUbicacion(), event.getTelefono());
        });

        apply((CompradorAgregado event) -> {
            var compradorId = event.getCompradorId();
            factura.comprador = new Comprador(compradorId, event.getNombre(), event.getNombreUsuario(), event.getTelefono(),
                    event.getDireccion());
        });

        apply((NombreVendedorActualizado event) -> factura.vendedor.actualizarNombre(event.getNombre().value()));

        apply((TelefonoVendedorActualizado event) -> factura.vendedor.actualizarTelefono(event.getTelefono().value()));

        apply((UbicacionVendedorActualizada event) -> factura.vendedor.actualizarUbicacion(event.getUbicacion().value()));

        apply((TelefonoCompradorActualizado event) -> factura.comprador.actualizarTelefono(event.getTelefono().value()));

        apply((DireccionCompradorActualizado event) -> factura.comprador.actualizarDireccion(event.getDireccion().value()));

        apply((MedioPagoAgregado event) -> factura.medioPago = event.getMedioPago());

        apply((TotalPagarAgregado event) -> factura.totalPagar = event.getTotalPagar());
    }
}
