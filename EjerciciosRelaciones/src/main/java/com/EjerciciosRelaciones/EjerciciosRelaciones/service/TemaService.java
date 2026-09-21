package com.EjerciciosRelaciones.EjerciciosRelaciones.service;

import com.EjerciciosRelaciones.EjerciciosRelaciones.model.Tema;
import com.EjerciciosRelaciones.EjerciciosRelaciones.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {
    @Autowired
    private ITemaRepository temaRepository;

    @Override
    public List<Tema> getTemas() {
        List<Tema> listaTemas = temaRepository.findAll();
        return listaTemas;
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepository.save(tema);
    }

    @Override
    public void deleteTema(Long id_tema) {
        temaRepository.deleteById(id_tema);
    }

    @Override
    public Tema findTema(Long id_tma) {
        Tema tema = temaRepository.findById(id_tma).orElse(null);
        return tema;
    }

    @Override
    public void editTema(Tema tema) {
        this.saveTema(tema);
    }
}
