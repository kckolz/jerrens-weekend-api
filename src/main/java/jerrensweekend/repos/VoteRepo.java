package jerrensweekend.repos;

import jerrensweekend.models.Vote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * Created by kckolz on 4/19/14.
 */
@Component
public interface VoteRepo extends MongoRepository<Vote, String> {

}
