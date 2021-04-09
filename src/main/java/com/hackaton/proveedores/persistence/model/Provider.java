package com.hackaton.proveedores.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "proveedores")
public class Provider implements Serializable {

    @Id
    private String id;

    private String cif;

    private String nombre;

    private String direccion;

    private String poblacion;

    private String provincia;

    private String codigo_postal;

    private String fecha_alta;

    private String fecha_baja;

    private String observaciones;

    private String persona_contacto;

    private String contacto;

    private String id_tipo_proveedor;

    public Provider() {

    }

    public Provider(String id, String cif, String nombre, String direccion, String poblacion, String provincia, String codigo_postal, String fecha_alta, String fecha_baja, String observaciones, String persona_contacto, String contacto, String id_tipo_proveedor) {
        this.id = id;
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.codigo_postal = codigo_postal;
        this.fecha_alta = fecha_alta;
        this.fecha_baja = fecha_baja;
        this.observaciones = observaciones;
        this.persona_contacto = persona_contacto;
        this.contacto = contacto;
        this.id_tipo_proveedor = id_tipo_proveedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(String fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPersona_contacto() {
        return persona_contacto;
    }

    public void setPersona_contacto(String persona_contacto) {
        this.persona_contacto = persona_contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getId_tipo_proveedor() {
        return id_tipo_proveedor;
    }

    public void setId_tipo_proveedor(String id_tipo_proveedor) {
        this.id_tipo_proveedor = id_tipo_proveedor;
    }
}