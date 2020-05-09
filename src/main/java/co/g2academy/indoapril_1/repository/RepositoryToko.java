package co.g2academy.indoapril_1.repository;

import co.g2academy.indoapril_1.model.ModelToko;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryToko extends JpaRepository<ModelToko, Integer> {
    List<ModelToko> findByStatus (String Status);


}
