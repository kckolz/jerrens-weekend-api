package jerrensweekend.repos;

import java.util.List;

import jerrensweekend.models.Voter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * Created by kckolz on 4/17/14.
 */
@Component
public interface VoterRepo extends MongoRepository<Voter, String> {
    public Voter findByName(String name);
}
