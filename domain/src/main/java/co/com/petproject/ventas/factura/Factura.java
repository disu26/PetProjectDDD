package co.com.petproject.ventas.factura;

import co.com.petproject.ventas.factura.events.*;
import co.com.petproject.ventas.factura.values.*;
import co.com.petproject.ventas.generic.values.Fecha;
import co.com.petproject.ventas.generic.values.NombreUsuario;
import co.com.petproject.ventas.producto.values.ProductoId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public final class Factura extends AggregateEvent<FacturaId> {
    protected ProductoId productoId;
    protected Vendedor vendedor;
    protected Comprador comprador;
    protected MedioPago medioPago;
    protected Fecha fecha;
    protected TotalPagar totalPagar;

    public Factura(FacturaId facturaId, Fecha fecha) {
        super(facturaId);
        appendChange(new FacturaCreada(fecha)).apply();
        subscribe(new FacturaEventChange(this));
    }

    private Factura(FacturaId facturaId){
        super(facturaId);
        subscribe(new FacturaEventChange(this));
    }

    public static Factura from(FacturaId facturaId, List<DomainEvent> events){
        var factura = new Factura(facturaId);
        events.forEach(factura::applyEvent);
        return factura;
    }

    public void agregarProducto(){

    }

    public void agregarVendedor(Nombre nombre, Ubicacion ubicacion, Telefono telefono){
        var vendedorId = new VendedorId();
        appendChange(new VendedorAgregado(vendedorId, nombre, ubicacion, telefono)).apply();
    }

    public void agregarComprador(Nombre nombre, NombreUsuario nombreUsuario, Telefono telefono, Direccion direccion){
        var compradorId = new CompradorId();
        appendChange(new CompradorAgregado(compradorId, nombre, nombreUsuario, telefono, direccion)).apply();
    }

    public void agregarMedioPago(MedioPago medioPago){
        appendChange(new MedioPagoAgregado(medioPago)).apply();
    }

    public void agregarTotalPagar(TotalPagar totalPagar){
        appendChange(new TotalPagarAgregado(totalPagar)).apply();
    }

    public void actualizarNombreVendedor(VendedorId vendedorId, Nombre nombre){
        appendChange(new NombreVendedorActualizado(vendedorId, nombre)).apply();
    }

    public MedioPago medioPago() {
        return medioPago;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Comprador comprador() {
        return comprador;
    }

    public Vendedor vendedor() {
        return vendedor;
    }

    public TotalPagar totalPagar() {
        return totalPagar;
    }
}
