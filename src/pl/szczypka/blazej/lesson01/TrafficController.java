package pl.szczypka.blazej.lesson01;

import java.util.Scanner;

public class TrafficController {

    public static void main(String[] args) {
        Highway highwayE37 = new Highway();
        Scanner reader = new Scanner(System.in);
        highwayE37.setName(reader.nextLine());
        //highwayE37.setName("Highway E37");
        highwayE37.setLength(378.88);
        System.out.println("Highway name: " + highwayE37.getName() + "\nHighway length: " + highwayE37.getLength());
        System.out.println(highwayE37.totalVehiclesWeight());
    }
}
