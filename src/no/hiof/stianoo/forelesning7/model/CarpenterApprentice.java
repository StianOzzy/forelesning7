package no.hiof.stianoo.forelesning7.model;

import java.time.LocalDate;

public class CarpenterApprentice extends Carpenter {


    public CarpenterApprentice(String firstName, String lastName, int age, int numHousesBuilt,
                               LocalDate trainingStartDate, LocalDate trainingEndDate) {

        super(firstName, lastName, age, numHousesBuilt);

        this.trainingStartDate = trainingStartDate;
        this.trainingEndDate = trainingEndDate;
    }

    private LocalDate trainingStartDate;

    private LocalDate trainingEndDate;

    public LocalDate getTrainingStartDate() {
        return trainingStartDate;
    }

    public void setTrainingStartDate(LocalDate trainingStartDate) {
        this.trainingStartDate = trainingStartDate;
    }

    public LocalDate getTrainingEndDate() {
        return trainingEndDate;
    }

    public void setTrainingEndDate(LocalDate trainingEndDate) {
        this.trainingEndDate = trainingEndDate;
    }
}
