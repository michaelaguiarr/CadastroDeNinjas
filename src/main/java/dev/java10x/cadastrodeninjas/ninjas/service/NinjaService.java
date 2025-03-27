package dev.java10x.cadastrodeninjas.ninjas.service;

import dev.java10x.cadastrodeninjas.ninjas.model.NinjaModel;
import dev.java10x.cadastrodeninjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }


    // Listar todos os meus ninjas por id
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    // Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // Deletar o ninja - Tem que ser um metodo void
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }
    

    // Atualizar o ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}
