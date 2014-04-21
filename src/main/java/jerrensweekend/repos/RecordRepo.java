package jerrensweekend.repos;

import jerrensweekend.models.Record;
import org.springframework.stereotype.Component;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by kckolz on 4/20/14.
 */

@Component
public interface RecordRepo extends MongoRepository<Record, String> {
    public Record findByName(String name);
}
