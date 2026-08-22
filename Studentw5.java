class Studentw5 {
    String name;
    int age;

    public static void main(String[] args) {

        Studentw5 s1 = new Studentw5();
        Studentw5 s2 = new Studentw5();

        s1.name = "Rahul";
        s1.age = 20;

        s2.name = "Priya";
        s2.age = 21;

        System.out.println("Student 1");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}