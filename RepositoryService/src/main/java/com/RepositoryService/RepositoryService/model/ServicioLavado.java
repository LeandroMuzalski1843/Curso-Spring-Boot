package com.RepositoryService.RepositoryService.model;

public class ServicioLavado {

    private ServicioNormal servicioNorm;
    private ServicioPremiun servicioPrem;

    /* Inyeccion de dependencias mediante un constructor
    public ServicioLavado(ServicioNormal servicioNorm, ServicioPremiun servicioPrem) {
        this.servicioNorm = servicioNorm;
        this.servicioPrem = servicioPrem;
    }*/

    //Mediante Setters

    public void setServicioNorm(ServicioNormal servicioNorm) {
        this.servicioNorm = servicioNorm;
    }

    public void setServicioPrem(ServicioPremiun servicioPrem) {
        this.servicioPrem = servicioPrem;
    }
}
