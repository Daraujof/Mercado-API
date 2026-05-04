package com.fiap.mercado_api;

import com.fiap.mercado_api.model.Setor;
import com.fiap.mercado_api.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/setores")
public class SetorController {

    @Autowired
    private SetorRepository setorRepository;

    @GetMapping
    public List<Setor> listarTodos() {
        return setorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Setor> buscarPorId(@PathVariable Long id) {
        return setorRepository.findById(id);
    }

    @PostMapping
    public Setor criar(@RequestBody Setor setor) {
        return setorRepository.save(setor);
    }

    @PutMapping("/{id}")
    public Setor atualizar(@PathVariable Long id, @RequestBody Setor setor) {
        setor.setId(id);
        return setorRepository.save(setor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        setorRepository.deleteById(id);
    }
}