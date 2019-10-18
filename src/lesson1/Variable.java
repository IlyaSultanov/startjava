public class Variable {

    public static void main(String[] args) {
        byte myByte = 2;
        short myShort = 4;
        int myInt = 4096;
        long myLong = 240000000000000000L;
        float myFloat = 2.0F;
        double myDouble = 3.88;
        char myChar = 9398;
        boolean myBoolean = true;

        System.out.println("Количество ядер = "  + myByte           + "\n" +
                "количество потоков = "          + myShort          + "\n" +
                "оперативная память = "          + myInt    + " Мб" + "\n" +
                "частота процессора = "          + myLong   + " Гц" + "\n" +
                "количество жестких дисков = "   + myFloat          + "\n" +
                "свободное место на диске С: = " + myDouble + " Гб" + "\n" +
                "просто символ "                 + myChar           + "\n" +
                "это мой компьютер "             + myBoolean);
    }
}
