package giovannilongo.U5S1L4110124.dao;

import giovannilongo.U5S1L4110124.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzaDAO extends JpaRepository<Pizza, Long> {

}

