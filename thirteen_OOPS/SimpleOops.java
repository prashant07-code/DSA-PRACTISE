//package thirteen_OOPS;

class SimpleOops{

    // Parent class
    static class Animal {
        String name;

        Animal(String name) {          // Constructor: object banate waqt naam set hota hai
            this.name = name;
        }

        void speak() {
            System.out.println(name + " makes a sound");
        }
    }

    // Child class: Animal ki saari cheezein milti hain
    static class Dog extends Animal {
        Dog(String name) {
            super(name);               // parent ke constructor ko naam bhej diya
        }

        @Override
        void speak() {                 // apna alag version
            System.out.println(name + " says Woof!");
        }
    }

    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        @Override
        void speak() {
            System.out.println(name + " says Meow!");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal("Tiger");
        Dog d = new Dog("Bruno");
        Cat c = new Cat("Kitty");

        a.speak();
        d.speak();
        c.speak();
    }
}
