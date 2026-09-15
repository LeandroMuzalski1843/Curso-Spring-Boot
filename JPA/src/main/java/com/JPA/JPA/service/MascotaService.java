package com.JPA.JPA.service;

import com.JPA.JPA.model.Mascota;
import com.JPA.JPA.model.Persona;
import com.JPA.JPA.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository repoMasco;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = repoMasco.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        repoMasco.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        //aca si no encuentro la persoa, devuelvo vull por eso va el orElse
        Mascota mascota = repoMasco.findById(id_mascota).orElse(null);
        return mascota;
    }

    @Override
    public void editMascota(Long idOriginal, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        //busco el objeto original
        Mascota mascota = this.findMascota(idOriginal);

        //proceso de modificacion a nivel logico
        mascota.setNombre(nuevoNombre);
        mascota.setEspecie(nuevaEspecie);
        mascota.setRaza(nuevaRaza);
        mascota.setColor(nuevoColor);

        //guardo los cambios
        this.saveMascota(mascota);
    }
}
