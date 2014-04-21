package jerrensweekend.models;

import org.springframework.data.annotation.Id;

/**
 * Created by kckolz on 4/17/14.
 */
public class Voter {

    @Id
    private String id;
    private String name;

    public Voter() {}

    public Voter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
