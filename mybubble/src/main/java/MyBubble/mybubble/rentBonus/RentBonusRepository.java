package MyBubble.demo.rentBonus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RentBonusRepository extends JpaRepository<RentBonus, Long> {

}
