public class Clase_Enums {
    enum Level {
        LOW,
        MEDIUM,
        HIGH,
    }

    public static void main(String[] args){

        Level varLevel = Level.MEDIUM;

        System.out.println(varLevel);


        switch (varLevel) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            }

            for (Level i : Level.values()) {
                System.out.println(i);
            }

    }
}
