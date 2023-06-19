package repository;

import Entity.CitizenTo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Respository extends JpaRepository<CitizenTo , Integer> {

}
