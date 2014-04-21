package jerrensweekend.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by kckolz on 4/20/14.
 */
public class Record {

    @Id
    private String id;
    private boolean didPiss;
    private int videosPlayed;
    private int hangmansPerformed;
    private int moneySpent;
    private boolean brokePhone;
    private boolean payedBills;
    private int loveConfessed;
    private String name;
    private Date timeRecorded;

    public Record(String id, boolean didPiss, int videosPlayed, int hangmansPerformed, int moneySpent, boolean brokePhone, boolean payedBills, int loveConfessed, String name) {
        this.id = id;
        this.didPiss = didPiss;
        this.videosPlayed = videosPlayed;
        this.hangmansPerformed = hangmansPerformed;
        this.moneySpent = moneySpent;
        this.brokePhone = brokePhone;
        this.payedBills = payedBills;
        this.loveConfessed = loveConfessed;
        this.name = name;
        this.timeRecorded = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDidPiss() {
        return didPiss;
    }

    public void setDidPiss(boolean didPiss) {
        this.didPiss = didPiss;
    }

    public int getVideosPlayed() {
        return videosPlayed;
    }

    public void setVideosPlayed(int videosPlayed) {
        this.videosPlayed = videosPlayed;
    }

    public int getHangmansPerformed() {
        return hangmansPerformed;
    }

    public void setHangmansPerformed(int hangmansPerformed) {
        this.hangmansPerformed = hangmansPerformed;
    }

    public int getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(int moneySpent) {
        this.moneySpent = moneySpent;
    }

    public boolean isBrokePhone() {
        return brokePhone;
    }

    public void setBrokePhone(boolean brokePhone) {
        this.brokePhone = brokePhone;
    }

    public boolean isPayedBills() {
        return payedBills;
    }

    public void setPayedBills(boolean payedBills) {
        this.payedBills = payedBills;
    }

    public int getLoveConfessed() {
        return loveConfessed;
    }

    public void setLoveConfessed(int loveConfessed) {
        this.loveConfessed = loveConfessed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }

}
