package homework;

public class Lesson2 {
    public static void main(String[] args) {
        byte bDec = 12;
        byte bBin = 0b1100;
        byte bOct = 014;
        byte bHex = 0xc;
        System.out.println("dec: " + bDec + "\n" + "bin: 0b1100 = " + bBin + "\n" + "oct: 014 = " + bOct
                + "\n" + "hex: 0xc = " + bHex + "\n");

        short sDec = -1300;
        short sBin = -0b10100010100;
        short sOct = -02424;
        short sHex = -0x514;
        System.out.println("dec: " + sDec + "\n" + "bin: -0b10100010100 = " + sBin + "\n"
                + "oct: -02424 = " + sOct + "\n" + "hex: -0x514 = " + sHex + "\n");

        int iDec = 0;
        int iBin = 0b0;
        int iOct = 00;
        int iHex = 0x0;
        System.out.println("dec: " + iDec + "\n" + "bin: 0b0 = " + iBin + "\n"
                + "oct: 00 = " + iOct + "\n" + "hex: 0x0 = " + iHex + "\n");

        long lDec = 123456789L;
        long lBin = 0b111010110111100110100010101L;
        long lOct = 0726746425L;
        long lHex = 0x75BCD15L;
        System.out.println("dec: " + lDec + "\n" + "bin: 0b111010110111100110100010101 = " + lBin + "\n"
                + "oct: 0726746425 = " + lOct + "\n" + "hex: 0x75BCD15 = " + lHex + "\n");

        float f1 = 25.2356F;
        float f2 = 2.23F;
        double d1 = 2.23;
        double d2 = 85236.26548963;
        boolean b1 = d1 == f2;
        boolean b2 = f2 == f2;
        System.out.println("f1 = " + f1 + "\nf2 = " + f2 + "\nd1 = " + d1 + "\nd2 = " + d2
                + "\nd1==f2: " + b1 + "\nf2==f2: " + b2 + "\n");

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        System.out.println(c1 + " " + c2 + " " + c3);
    }
}
