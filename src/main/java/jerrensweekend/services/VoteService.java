package jerrensweekend.services;

import jerrensweekend.models.Vote;
import jerrensweekend.models.Voter;
import jerrensweekend.repos.VoteRepo;
import jerrensweekend.repos.VoterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kckolz on 4/19/14.
 */
@Component
public class VoteService {

    @Autowired
    private VoterRepo voterRepo;
    @Autowired
    private VoteRepo voteRepo;

    public VoteService() {}

    public boolean canVote(String name) {
        Voter savedName = voterRepo.findByName(name);
        return savedName == null;
    }

    public void submitVote(Vote vote) {
        voterRepo.save(new Voter(vote.getName()));
        voteRepo.save(vote);
    }

}
