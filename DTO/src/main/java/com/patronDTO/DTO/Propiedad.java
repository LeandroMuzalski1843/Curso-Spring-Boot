package com.patronDTO.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Propiedad {
    private Long id_propiedad;
    private String tipo_Propiedad;
    private String direccion;
    private Double metros_cuadrados;
    private Double valor_alquiler;

    public Propiedad() {
    }

    public Propiedad(Long id_propiedad, String tipo_Propiedad, String direccion, Double metros_cuadrados, Double valor_alquiler) {
        this.id_propiedad = id_propiedad;
        this.tipo_Propiedad = tipo_Propiedad;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.valor_alquiler = valor_alquiler;
    }

    public Long getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(Long id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getTipo_Propiedad() {
        return tipo_Propiedad;
    }

    public void setTipo_Propiedad(String tipo_Propiedad) {
        this.tipo_Propiedad = tipo_Propiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(Double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public Double getValor_alquiler() {
        return valor_alquiler;
    }

    public void setValor_alquiler(Double valor_alquiler) {
        this.valor_alquiler = valor_alquiler;
    }
}
