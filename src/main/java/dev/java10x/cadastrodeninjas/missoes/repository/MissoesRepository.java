package dev.java10x.cadastrodeninjas.missoes.repository;

import dev.java10x.cadastrodeninjas.missoes.model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
