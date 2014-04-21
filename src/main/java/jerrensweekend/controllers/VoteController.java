package jerrensweekend.controllers;

import jerrensweekend.models.Vote;
import jerrensweekend.models.Voter;
import jerrensweekend.repos.VoterRepo;
import jerrensweekend.services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kckolz on 4/17/14.
 */

@Controller
public class VoteController {

    @Autowired
    VoteService voteService;

    @RequestMapping(value="/canVote",method=RequestMethod.GET)
    public @ResponseBody boolean vote(@RequestParam String name) {
        return voteService.canVote(name);
    }

    @RequestMapping(value="/submitVote",method=RequestMethod.POST)
    public @ResponseBody ResponseEntity<Vote> vote(@RequestBody Vote vote) {

        if(voteService.canVote(vote.getName())) {
            voteService.submitVote(vote);
            return new ResponseEntity<Vote>(vote, HttpStatus.OK);
        } else {
            return new ResponseEntity<Vote>(HttpStatus.UNAUTHORIZED);
        }
    }

}