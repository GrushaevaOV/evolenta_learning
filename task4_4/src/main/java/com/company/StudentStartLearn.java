package com.company;

import javax.xml.crypto.Data;
import java.util.Date;

public class StudentStartLearn implements Learner {
    private Learner learner;

    public StudentStartLearn(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        long startLearning = System.currentTimeMillis();
        Date date = new Date(startLearning);
        learner.learn();
        System.out.println("Время начала обучения " + date);
    }
}
