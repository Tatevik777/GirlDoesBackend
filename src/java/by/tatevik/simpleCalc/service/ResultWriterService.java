package by.tatevik.simpleCalc.service;

public class ResultWriterService {
    public static void printResult(int num1, int num2, String operationName, int result) {
        System.out.println("операция" + " " + operationName + " " + "Число " + " "
                + num1 + " " + "Число " + " " + num2 + " " + "Результат" + " " + result);

    }
}
