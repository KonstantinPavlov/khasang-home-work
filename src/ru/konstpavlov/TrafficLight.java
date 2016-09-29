package ru.konstpavlov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight implements Light {

    private String getLight(double input) {
        switch ((int) (input % 5)) {
            case 0:
                return Colors.RED.toString();
            case 1:
                return Colors.GREEN.toString();
            case 2:
                return Colors.GREEN.toString();
            case 3:
                return Colors.YELLOW.toString();
            case 4:
                return Colors.RED.toString();
        }
        return null;
    }

    private double inputMethod() {
        System.out.println("Введите минуту, для определения света светофора:");
        double time = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            time = Double.parseDouble(reader.readLine());
            while (time > 60.0) {
                System.out.println("В часе 60 минут, введите корректное время:");
                time = Double.parseDouble(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return time;
    }

    @Override
    public void start() {
        System.out.println(getLight(inputMethod()));
    }
}