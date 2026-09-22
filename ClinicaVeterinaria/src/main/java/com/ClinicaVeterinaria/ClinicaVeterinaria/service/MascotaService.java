package com.ClinicaVeterinaria.ClinicaVeterinaria.service;

import com.ClinicaVeterinaria.ClinicaVeterinaria.dto.MascotaDuenioDTO;
import com.ClinicaVeterinaria.ClinicaVeterinaria.model.Mascota;
import com.ClinicaVeterinaria.ClinicaVeterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascota() {
        List<Mascota> listamascotas = mascotaRepository.findAll();
        return listamascotas;
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota mascota = mascotaRepository.findById(id_mascota).orElse(null);
        return mascota;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascotaRepository.deleteById(id_mascota);
    }

    @Override
    public void editMascota(Mascota mascota) {
        this.saveMascota(mascota);
    }

    @Override
    public List<Mascota> getEspecieRazaMascota() {
        List<Mascota> listaMascotas = this.getMascota();
        List<Mascota> listaCaniche = new ArrayList<>();

        for (Mascota mascota: listaMascotas){
            if(mascota.getEspecie().equalsIgnoreCase("perro") && mascota.getRaza().equalsIgnoreCase("caniche")){
                listaCaniche.add(mascota);
            }
        }
        return listaCaniche;
    }

    @Override
    public List<MascotaDuenioDTO> getMascoDuenios() {
        List<Mascota> listaMascota =this.getMascota();
        List<MascotaDuenioDTO> listaMascotaDuenio =new ArrayList<>();
        MascotaDuenioDTO mascotaDuenio = new MascotaDuenioDTO();

        for (Mascota mascota: listaMascota){
            System.out.println(mascota.getNombre());
            mascotaDuenio.setNombre_duenio(mascota.getDuenio().getNombre());
            mascotaDuenio.setNombre_mascota(mascota.getNombre());
            mascotaDuenio.setApellido_duenio(mascota.getDuenio().getApellido());
            mascotaDuenio.setEspecie(mascota.getEspecie());
            mascotaDuenio.setRaza(mascota.getRaza());

            listaMascotaDuenio.add(mascotaDuenio);
            mascotaDuenio = new MascotaDuenioDTO();//reseteo
        }
        return listaMascotaDuenio;
    }
}
