package com.ClinicaVeterinaria.ClinicaVeterinaria.service;

import com.ClinicaVeterinaria.ClinicaVeterinaria.model.Duenio;
import com.ClinicaVeterinaria.ClinicaVeterinaria.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DuenioService implements IDuenioService {
    @Autowired
    private IDuenioRepository duenioRepository;

    @Override
    public List<Duenio> getDuenio() {
        List<Duenio> listaDuenios = duenioRepository.findAll();
        return listaDuenios;
    }

    @Override
    public Duenio findDuenio(Long id_Duenio) {
        Duenio duenio =duenioRepository.findById(id_Duenio).orElse(null);
        return duenio;
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepository.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id_Duenio) {
        duenioRepository.deleteById(id_Duenio);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }
}
