package bsu.rfe.java.group7.lab1.Patenko.varA4;
public class Apple extends Food {
    private String size;
    public Apple(String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Яблоко");
// Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}