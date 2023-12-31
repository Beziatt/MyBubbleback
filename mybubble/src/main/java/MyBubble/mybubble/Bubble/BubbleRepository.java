package MyBubble.demo.Bubble;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BubbleRepository extends JpaRepository<Bubble, Long> {

}
