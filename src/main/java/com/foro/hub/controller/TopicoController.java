package com.foro.hub.controller;

import com.foro.hub.model.Topico;
import com.foro.hub.service.TopicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    private final TopicoService service;

    public TopicoController(TopicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Topico> listar() {
        return service.listar();
    }

    @PostMapping
    public Topico crear(@RequestBody Topico topico) {
        return service.guardar(topico);
    }

    @GetMapping("/{id}")
    public Topico obtener(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Topico actualizar(@PathVariable Long id, @RequestBody Topico topico) {
        topico.setId(id);
        return service.actualizar(topico);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}