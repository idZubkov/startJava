public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;
    private String weapon;
    private int kaijuKilled;

    public void move() {
        System.out.println("Идёт");
    }

    public void fight() {
        System.out.println("Сражается");
    }

    public boolean drift() {
        System.out.println("Вошёл в дрифт");
        return false;
    }

    public String scanKaiju() {
        System.out.println("Сканирует кайдзю");
        return "Сканирует кайдзю";
    }

    public void useVortexCannon() {
        System.out.println("Использует вихревую пушку");
    }



    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }
}