package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger сhernoAlpha = new Jaeger();

        сhernoAlpha.setModelName("Cherno Alpha");
        сhernoAlpha.setMark("Mark-1");
        сhernoAlpha.setOrigin("Russia");
        сhernoAlpha.setHeight(85.34f);
        сhernoAlpha.setWeight(2.412f);
        сhernoAlpha.setSpeed(3);
        сhernoAlpha.setStrength(10);
        сhernoAlpha.setArmor(10);
        сhernoAlpha.setWeapon("Incinerator turbines, Z-14 Tesla fists");
        сhernoAlpha.setKaijuKilled(6);

        System.out.println("Первый Егерь: " + "name: " + сhernoAlpha.getModelName() + " " + "mark: " + сhernoAlpha.getMark() + " " + "origin: " + сhernoAlpha.getOrigin()
            + " " + "height: " + сhernoAlpha.getHeight() + "m " + "weight: " + сhernoAlpha.getWeight() + "tons " + "speed: " + сhernoAlpha.getSpeed() + " " + "strength: " + сhernoAlpha.getStrength()
            + " " + "armor: " + сhernoAlpha.getArmor() + " " + "weapon: " + сhernoAlpha.getWeapon() + " " + "killed Kaiju: " + сhernoAlpha.getKaijuKilled());

        сhernoAlpha.move();
        сhernoAlpha.fight();
        сhernoAlpha.drift();
        сhernoAlpha.scanKaiju();
        сhernoAlpha.useVortexCannon();

        Jaeger strikerEureka = new Jaeger();
        
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2f);
        strikerEureka.setWeight(1.850f);
        strikerEureka.setSpeed(10);
        strikerEureka.setStrength(10);
        strikerEureka.setArmor(9);
        strikerEureka.setWeapon("Assault Mount 3.25 \"Sting-Blades\", WMB2x90 AKM Chest launcher");
        strikerEureka.setKaijuKilled(11);

        System.out.println();
        System.out.println("Второй Егерь: " + "name: " + strikerEureka.getModelName() + " " + "mark: " + strikerEureka.getMark() + " " + "origin: " + strikerEureka.getOrigin()
            + " " + "height: " + strikerEureka.getHeight() + "m " + "weight: " + strikerEureka.getWeight() + "tons " + "speed: " + strikerEureka.getSpeed() + " " + "strength: " + strikerEureka.getStrength()
            + " " + "armor: " + strikerEureka.getArmor() + " " + "weapon: " + strikerEureka.getWeapon() + " " + "killed Kaiju: " + strikerEureka.getKaijuKilled());

        strikerEureka.move();
        strikerEureka.fight();
        strikerEureka.drift();
        strikerEureka.scanKaiju();
        strikerEureka.useVortexCannon();
    }
}
