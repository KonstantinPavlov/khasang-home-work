package ru.konstpavlov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight{
    public static void main(String[] args) throws IOException {
        double input=inputMethod();
        System.out.println(getLight(input));
    }

    private static String getLight(double input){
        switch ((int)(input % 5))
        {
            case 0 : return "Красный";
            case 1 : return "Зеленый";
            case 2 : return "Зеленый";
            case 3 : return "Желтый";
            case 4 : return "Красный";
        }
        return null;
    }

    private static double inputMethod(){
        System.out.println("Введите минуту, для определения света светофора:");
        double time= 0;
        try ( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            time = Double.parseDouble(reader.readLine());
            while (time>60.0)
            {
                System.out.println("В часе 60 минут, введите корректное время:");
                time=Double.parseDouble(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return time;
    }

}