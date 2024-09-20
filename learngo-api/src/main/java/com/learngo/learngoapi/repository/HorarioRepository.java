package com.aprendeya.aprendeyaapi.repository;
import com.aprendeya.aprendeyaapi.model.entity.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {
    List<Horario> findByTutorIdTutor(Integer idTutor);
}