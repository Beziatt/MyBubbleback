package MyBubble.demo.rentActivities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentActivitiesRepository extends JpaRepository<RentActivities, Long> {

}
