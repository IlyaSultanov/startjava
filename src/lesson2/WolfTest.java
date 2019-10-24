public class WolfTest {

    public static void main(String[] args) {
        Wolf woolfy = new Wolf();
        woolfy.age = 7;
        woolfy.color = "white";
        woolfy.gender = "suka";
        woolfy.weight = 15;
        woolfy.name = "Woolfy";

        System.out.println(woolfy.age + " " + woolfy.color + " " + woolfy.gender + " " + woolfy.weight + " " + woolfy.name);

        woolfy.go();
        woolfy.howl();
        woolfy.hunt();
        woolfy.run();
        woolfy.sit();
    }
}
