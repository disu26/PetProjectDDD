package co.com.petproject.ventas.factura;

import co.com.petproject.ventas.factura.values.Nombre;
import co.com.petproject.ventas.factura.values.Telefono;
import co.com.petproject.ventas.factura.values.Ubicacion;
import co.com.petproject.ventas.factura.values.VendedorId;
import co.com.sofka.domain.generic.Entity;

public class Vendedor extends Entity<VendedorId> {
    protected Nombre nombre;
    protected Ubicacion ubicacion;
    protected Telefono telefono;

    public Vendedor(VendedorId entityId, Nombre nombre, Ubicacion ubicacion, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }

    public void actualizarNombre(String nombre){
        this.nombre = new Nombre(nombre);
    }

    public void actualizarUbicacion(String ubicacion){
        this.ubicacion = new Ubicacion(ubicacion);
    }

    public void actualizarTelefono(String telefono){
        this.telefono = new Telefono(telefono);
    }
}
