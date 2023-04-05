public class EncapsulatedShape {
    private String name;
    private int countOfLines;
    private double value;
    
    public EncapsulatedShape(String name, int countOfLines, double value) {
        this.name = name;
        this.countOfLines = countOfLines;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCountOfLines() {
        return countOfLines;
    }
    
    public double getValue() {
        return value;
    }
    
    public void info() {
        System.out.println("Shape: " + name);
        System.out.println("Count of lines: " + countOfLines);
    }
}
public static void main(String[] args) {
    EncapsulatedShape shape1 = new EncapsulatedShape("Square", 4, 5.0);
    EncapsulatedShape shape2 = new EncapsulatedShape("Triangle", 3, 3.0);
    EncapsulatedShape shape3 = new EncapsulatedShape("Pentagon", 5, 7.5);
    
    shape1.info();  // Shape: Square, Count of lines: 4
    shape2.info();  // Shape: Triangle, Count of lines: 3
    shape3.info();  // Shape: Pentagon, Count of lines: 5
}
