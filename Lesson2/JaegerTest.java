public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();

        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(85.34f);
        jaeger1.setWeight(2.412f);
        jaeger1.setSpeed(3);
        jaeger1.setStrength(10);
        jaeger1.setArmor(10);
        jaeger1.setWeapon("Incinerator turbines, Z-14 Tesla fists");
        jaeger1.setKaijuKilled(6);

        System.out.println("Первый Егерь: " + "name: " + jaeger1.getModelName() + " " + "mark: " + jaeger1.getMark() + " " + "origin: " + jaeger1.getOrigin()
            + " " + "height: " + jaeger1.getHeight() + "m " + "weight: " + jaeger1.getWeight() + "tons " + "speed: " + jaeger1.getSpeed() + " " + "strength: " + jaeger1.getStrength()
            + " " + "armor: " + jaeger1.getArmor() + " " + "weapon: " + jaeger1.getWeapon() + " " + "killed Kaiju: " + jaeger1.getKaijuKilled());

        jaeger1.move();
        jaeger1.fight();
        jaeger1.drift();
        jaeger1.scanKaiju();
        jaeger1.useVortexCannon();



        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setOrigin("Australia");
        jaeger2.setHeight(76.2f);
        jaeger2.setWeight(1.850f);
        jaeger2.setSpeed(10);
        jaeger2.setStrength(10);
        jaeger2.setArmor(9);
        jaeger2.setWeapon("Assault Mount 3.25 \"Sting-Blades\", WMB2x90 AKM Chest launcher");
        jaeger2.setKaijuKilled(11);

        System.out.println();
        System.out.println("Второй Егерь: " + "name: " + jaeger2.getModelName() + " " + "mark: " + jaeger2.getMark() + " " + "origin: " + jaeger2.getOrigin()
            + " " + "height: " + jaeger2.getHeight() + "m " + "weight: " + jaeger2.getWeight() + "tons " + "speed: " + jaeger2.getSpeed() + " " + "strength: " + jaeger2.getStrength()
            + " " + "armor: " + jaeger2.getArmor() + " " + "weapon: " + jaeger2.getWeapon() + " " + "killed Kaiju: " + jaeger2.getKaijuKilled());

        jaeger2.move();
        jaeger2.fight();
        jaeger2.drift();
        jaeger2.scanKaiju();
        jaeger2.useVortexCannon();
    }
}
