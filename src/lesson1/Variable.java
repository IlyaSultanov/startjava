public class Variable {

    public static void main(String[] args) {
        byte coreQuantity = 2;
        short threadCuantity = 4;
        int ram = 4096;
        long procFrequency = 240000000000000000L;
        float hardDiscQuantity = 2.0F;
        double spaceOnC = 3.88;
        char justChar = 9398;
        boolean isComputerOfMine = true;

        System.out.println("Количество ядер = "  + coreQuantity              + "\n" +
                "количество потоков = "          + threadCuantity            + "\n" +
                "оперативная память = "          + ram               + " Мб" + "\n" +
                "частота процессора = "          + procFrequency     + " Гц" + "\n" +
                "количество жестких дисков = "   + hardDiscQuantity          + "\n" +
                "свободное место на диске С: = " + spaceOnC          + " Гб" + "\n" +
                "просто символ "                 + justChar                  + "\n" +
                "это мой компьютер "             + isComputerOfMine);
    }
}
