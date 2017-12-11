package za.web.skerwe.adventofcode;

public class Day10 {

    private static byte[] standardLengthSuffixValues = {17, 31, 73, 47, 23};

    public static void main(String[] args) {
        String input = "120,93,0,90,5,80,129,74,1,165,204,255,254,2,50,113";

        System.out.println("\nKnot Hash = " + new Day10().process(combine(input.getBytes(), standardLengthSuffixValues)));
    }

    public static int[] combine(byte[] a, byte[] b) {
        int length = a.length + b.length;
        int[] result = new int[length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = a.length, j = 0; j < b.length; i++, j++) {
            result[i] = b[j];
        }
        return result;
    }

    private String process(int[] lengths) {
        int currentPosition = 0, skipSize = 0, count = 0;

        int[] hashString = new int[256];
        for (int i = 0; i < hashString.length; i++) {
            hashString[i] = i;
        }

        while (count < 64) {
            for (int i = 0; i < lengths.length; i++) {

                int[] hashStringClone = hashString.clone();

                int b = currentPosition + lengths[i] - 1;
                if (b >= hashString.length) {
                    b = b - hashString.length;
                }
                for (int step = 0, c = currentPosition; step < lengths[i]; step++, c++, b--) {
                    if (b == -1) {
                        b = hashString.length - 1;
                    }
                    if (c == hashString.length) {
                        c = 0;
                    }
                    hashString[c] = hashStringClone[b];
                }
                currentPosition += lengths[i] + skipSize;
                skipSize++;

                while (currentPosition >= hashString.length) {
                    currentPosition = currentPosition - hashString.length;
                }
            }
            count++;
        }

        int[] sparseHash = new int[16];
        for (int hash = 0; hash < 16; hash++) {
            int value = 0;
            for (int i = (hash * 16), j = (hash * 16) + 16; i < j; i++) {
                value = value ^ hashString[i];
            }
            sparseHash[hash] = value;

        }

        StringBuilder buffer = new StringBuilder();
        for (int v : sparseHash) {
            String h = Integer.toHexString(v);
            buffer.append(h.length() == 1 ? ("0" + h) : h);
        }

        return buffer.toString();
    }
}
