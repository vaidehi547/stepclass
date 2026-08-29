class SampleArrayPrograms {

    public static void main(String[] args) {

        // 1. Array initialization
        int a[] = {1, 2, 3, 4, 5};

        for (int c : a) {
            System.out.println(c);
        }

        // 2. Creating an array using new
        int[] b = new int[5];

        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b[4] = 5;

        System.out.println("Array b:");

        for (int d : b) {
            System.out.println(d);
        }
    }
}
