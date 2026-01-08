package com.foro.hub.service;

import com.foro.hub.model.Topico;
import com.foro.hub.repository.TopicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    private final TopicoRepository repository;

    public TopicoService(TopicoRepository repository) {
        this.repository = repository;
    }

    public List<Topico> listar() {
        return repository.findAll();
    }

    public Topico guardar(Topico topico) {
        return repository.save(topico);
    }

    public Topico buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Topico actualizar(Topico topico) {
        return repository.save(topico);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}