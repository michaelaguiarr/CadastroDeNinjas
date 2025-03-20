package dev.java10x.cadastrodeninjas.ninjas.repository;

import dev.java10x.cadastrodeninjas.ninjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
