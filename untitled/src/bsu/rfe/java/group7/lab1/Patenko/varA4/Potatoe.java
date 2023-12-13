package bsu.rfe.java.group7.lab1.Patenko.varA4;

public class Potatoe extends Food{
    private String property;
    public Potatoe(String property) {
        super("Картофель");
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public void setFilling(String property) {
        this.property = property;
    }

    @Override
    public void consume() {
        System.out.println(  this.toString()+  " съедена");
    }
    @Override
    public String toString(){
        return "картошка " + property;
    }
}

