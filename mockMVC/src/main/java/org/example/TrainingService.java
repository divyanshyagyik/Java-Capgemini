package org.example;

import java.util.List;

public interface TrainingService {
    List<Training>findByTopic(String topic);
    Training findById(int trainingId);
    Training addTraining(Training training);
    Training updateTraining(Training training);
    Training deleteTraining(int trainingId);
}
