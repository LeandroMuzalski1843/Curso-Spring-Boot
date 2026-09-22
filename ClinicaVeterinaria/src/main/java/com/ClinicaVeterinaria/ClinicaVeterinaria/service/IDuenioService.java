package com.ClinicaVeterinaria.ClinicaVeterinaria.service;

import com.ClinicaVeterinaria.ClinicaVeterinaria.model.Duenio;

import java.util.List;

public interface IDuenioService {
    //Metodos para Dueño

    //Lectura
    public List<Duenio> getDuenio();

    //Lectura de una sola Duenio
    public Duenio findDuenio(Long id_Duenio);
    
    //Alta
    public void saveDuenio(Duenio duenio);

    //Baja
    public void deleteDuenio(Long id_Duenio);

    //Edicion
    public void editDuenio(Duenio duenio);


}
