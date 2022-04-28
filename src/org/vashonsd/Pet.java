package org.vashonsd;

import java.time.LocalDate;

public class Pet {
    String name;
    String breed;
    LocalDate dateOfBirth;
    boolean needsRestraint;
    typeOfAnimal type;

    public enum typeOfAnimal{
        DOG,
        CAT,
        CHICKEN
    }

    public Pet(String name, String breed, LocalDate dateOfBirth, boolean needsRestraint, typeOfAnimal type) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.needsRestraint = needsRestraint;
        this.type = type;
    }
    public Pet(typeOfAnimal type){
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean needsRestraint() {
        return needsRestraint || getAge()>=13;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public typeOfAnimal getType() {
        return type;
    }

    public void setType(typeOfAnimal type) {
        this.type = type;
    }
    public int getAge(){
        int age = LocalDate.now().getYear()-dateOfBirth.getYear();
        if(LocalDate.now().getMonthValue()<dateOfBirth.getMonthValue()){
            age--;
        }
        return age;
    }
}