package jerrensweekend.controllers;

import jerrensweekend.models.Record;
import jerrensweekend.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kckolz on 4/20/14.
 */
@Controller
public class RecordController {

    @Autowired
    RecordService recordService;

    @RequestMapping(value="/submitRecord",method=RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<Record> record(@RequestBody Record record) {
        recordService.submitRecord(record);
        return new ResponseEntity<Record>(record, HttpStatus.OK);
    }

}
