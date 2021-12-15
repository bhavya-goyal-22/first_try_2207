 class Foo {
    public void method1() {
        System.out.println("foo 1");
    }
    public void method2() {
        System.out.println("foo 2");
    }
    public String toString() {
        return "foo";
    }
}
class Bar extends Foo {
    public void method2() {
        System.out.println("bar 2");
    }
}
    class Baz extends Foo {
    public void method1() {
        System.out.println("baz 1");
    }
    public String toString() {
        return "baz";
    }
}
    class Mumble extends Baz {
        public void method2() {
            System.out.println("mumble 2");
        }
    }

class main_runnable{
    public static void main(String[] args) {
        Foo[] arr = {new Baz(), new Bar(), new Mumble(), new Foo()};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i].method1();
            arr[i].method2();
            System.out.println();

        }
    }
}