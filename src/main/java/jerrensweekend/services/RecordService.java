package jerrensweekend.services;

import jerrensweekend.models.Record;
import jerrensweekend.repos.RecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by kckolz on 4/20/14.
 */
@Component
public class RecordService {

    @Autowired
    RecordRepo recordRepo;

    public RecordService() {}

    public void submitRecord(Record record) {
        Record storedRecord = recordRepo.findByName(record.getName());
        if(storedRecord == null) {
            recordRepo.save(record);
        }
        else {
            updateRecord(storedRecord, record);
        }
    }

    public void updateRecord(Record record, Record newRecord) {
        record.setBrokePhone(newRecord.isBrokePhone());
        record.setDidPiss(newRecord.isDidPiss());
        record.setHangmansPerformed(newRecord.getHangmansPerformed());
        record.setLoveConfessed(newRecord.getLoveConfessed());
        record.setMoneySpent(newRecord.getMoneySpent());
        record.setPayedBills(newRecord.isPayedBills());
        record.setVideosPlayed(newRecord.getVideosPlayed());
        record.setTimeRecorded(new Date());
        recordRepo.save(record);
    }
}
