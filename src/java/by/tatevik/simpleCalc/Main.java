package by.tatevik.simpleCalc;

import by.tatevik.simpleCalc.service.ResultWriterService;
import by.tatevik.simpleCalc.util.Calculator;

public class Main {
    public static void main(String[] args) {
        int result1 = Calculator.sum(5, 5);
        int result2 = Calculator.multiply(55, 55);
        int result3 = Calculator.substract(1055, 55);

        ResultWriterService.printResult(5, 5, "сложение", result1);
        ResultWriterService.printResult(55, 55, "умножение", result2);
        ResultWriterService.printResult(1055, 55, "вычитание", result3);
    }
}
