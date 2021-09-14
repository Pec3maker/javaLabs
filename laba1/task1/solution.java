class Kata {
    public static int[] foldArray(int[] array, int runs) {
        if (runs == 0) {
            return array;
        }

        int newLength = array.length / 2 + array.length % 2;
        int[] result = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            if(i != array.length - i - 1) {
                result[i] = array[i] + array[array.length - i - 1];
            } else {
                result[i] = array[i];
            }
        }

        return foldArray(result, runs - 1);
    }
}
