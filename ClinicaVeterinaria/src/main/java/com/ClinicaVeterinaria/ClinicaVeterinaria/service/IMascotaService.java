package com.ClinicaVeterinaria.ClinicaVeterinaria.service;

import com.ClinicaVeterinaria.ClinicaVeterinaria.dto.MascotaDuenioDTO;
import com.ClinicaVeterinaria.ClinicaVeterinaria.model.Mascota;

import java.util.List;

public interface IMascotaService {

    //Metodos para Mascotas

    //Lectura
    public List<Mascota>getMascota();

    //Lectura de una sola Mascota
    public Mascota findMascota(Long id_mascota);

    //Alta
    public void saveMascota(Mascota mascota);

    //Baja
    public void deleteMascota(Long id_mascota);

    //Edicion
    public void editMascota(Mascota mascota);

    //Filtro por Especie y Raza
    public List<Mascota> getEspecieRazaMascota();

    //Datos convinados Mascota y del Dueño
    public List<MascotaDuenioDTO> getMascoDuenios();
}
