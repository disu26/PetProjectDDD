package co.com.petproject.ventas.factura;

import co.com.petproject.ventas.factura.values.Nombre;
import co.com.petproject.ventas.factura.values.Telefono;
import co.com.petproject.ventas.factura.values.Ubicacion;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.Entity;

public final class Vendedor extends Entity<VendedorId> {
    protected Nombre nombre;
    protected Ubicacion ubicacion;
    protected Telefono telefono;

    public Vendedor(VendedorId entityId, Nombre nombre, Ubicacion ubicacion, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }

    public void actualizarNombre(String newNombre){
        this.nombre = this.nombre.actualizarNombre(newNombre);
    }
}
