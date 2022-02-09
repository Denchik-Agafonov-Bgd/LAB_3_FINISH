package com.company;

public abstract class TrainingItem extends Inventory{
    private String coverage;

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }
}
