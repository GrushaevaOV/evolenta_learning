package com.company;

public class StudentWithTimer implements Learner {
    private Learner learner;

    public StudentWithTimer(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        long start = System.currentTimeMillis();
        learner.learn();
        System.out.println("Время учёбы: "+ (System.currentTimeMillis() - start) +"ms" );
    }
}