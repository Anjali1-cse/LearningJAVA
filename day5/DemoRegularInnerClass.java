public class DemoRegularInnerClass {
    private int num = 42;

    void showDetails() {
        System.out.println("Outer class method: num = " + num);
    }

    // Regular Inner Class
    class Inner {
        void showDetails() {
            // Accessing outer class's private field directly
            System.out.println("Inner class accessing num: " + num);
            showDetails(); // calling outer class method
        }
    }

    void display() {
        // Method-local Inner Class
        class MethodLocal {
            void printMessage() {
                System.out.println("Inside method-local inner class");
            }
        }

        MethodLocal ml = new MethodLocal();
        ml.printMessage();
    }

    // Static Inner Class
    static class StaticInner {
        void showStatic() {
            System.out.println("Inside static inner class");
        }
    }

    // Main method to test all inner classes
    public static void main(String[] args) {
        DemoRegularInnerClass outer = new DemoRegularInnerClass();

        // Regular inner class usage
        DemoRegularInnerClass.Inner inner = outer.new Inner();
        inner.showDetails();

        // Method-local inner class usage
        outer.display();

        // Static inner class usage
        DemoRegularInnerClass.StaticInner staticInner = new DemoRegularInnerClass.StaticInner();
        staticInner.showStatic();
    }
}
