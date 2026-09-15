package com.JPA.JPA.service;

import com.JPA.JPA.model.Mascota;


import java.util.List;

public interface IMascotaService {

    //Meto para traer todas las mascotas
    //Lectura
    public List<Mascota> getMascotas();

    //Alta
    public void saveMascota(Mascota masco);

    //Baja
    public void deleteMascota(Long id_mascota);

    //Lectura de un solo objeto
    public Mascota findMascota(Long id_mascota);

    //edidicon
    public void editMascota(Long idOriginal,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor);
}
