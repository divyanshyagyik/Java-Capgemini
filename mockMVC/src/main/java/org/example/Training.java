package org.example;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Training {
    public Training(int trainingId, String startDate, String endDate, String topic, String trainername) {
        this.trainingId = trainingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.topic = topic;
        this.trainername = trainername;
    }

    public Training(){
        super();
    }

    @Id
    @GeneratedValue
    private int trainingId;

    private String startDate;
    private String endDate;
    private String topic;
    private String trainername;

    public int getTrainingId() {
        return trainingId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getTopic() {
        return topic;
    }

    public String getTrainername() {
        return trainername;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setTrainername(String trainername) {
        this.trainername = trainername;
    }

}
