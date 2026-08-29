class SampleArrayPrograms {

    public static void main(String[] args) {

        // 1. Array initialization
        int a[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length-1; i++) {
            System.out.println(a[i]);
        }

        // 2. Creating an array using new
        int[] b = new int[5];

        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b[4] = 5;

        System.out.println("Array b:");

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}