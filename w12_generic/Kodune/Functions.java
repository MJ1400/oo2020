package Kodune;

public class Functions<T extends Number> { //Number: all number types(int, float, jne)

    T input;

    Functions(T input) {
        this.input = input;
    }
    
    double ruut() {
        return input.doubleValue() * input.doubleValue();
    }
}