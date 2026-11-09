class Parent {
    void dance() {
        System.out.println("Parent can dance");
    }
}

public class Child extends Parent {
    @Override
    void dance() {
        System.out.println("Child can dance");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.dance();
    }
}