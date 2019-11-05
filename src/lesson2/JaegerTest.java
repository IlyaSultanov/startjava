public class JaegerTest {

    public static void main(String[] args) {
        Jaeger samovar = new Jaeger();
        samovar.setOrigin("Russia");
        samovar.setModelName("RussianSamovar");
        samovar.setMark("СН256ПРГ/251.42М");
        samovar.setHeight(65.2F);
        samovar.setWeight(15.1F);
        samovar.setSpeed(2);
        samovar.setStrength(5);
        samovar.setArmor(28);

        Jaeger spaceX = new Jaeger();
        spaceX.setOrigin("USA");
        spaceX.setModelName("SpaceX");
        spaceX.setMark("Mark-8");
        spaceX.setHeight(82.4F);
        spaceX.setWeight(8.9F);
        spaceX.setSpeed(12);
        spaceX.setStrength(7);
        spaceX.setArmor(7);

        samovar.setArmor(spaceX.getArmor() + 15);

        System.out.println(samovar.getHeight() + spaceX.getHeight());
    }
}
