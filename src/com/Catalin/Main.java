package com.Catalin;

public class Main {

    public static void main(String[] args) {
        /** Objects: real world objects can be doors, a mouse, a monitor etc. Real world objects have two
         * major characteristics, the state and behavior.
         *
         * The state in terms of a computer can be the hard
         * size, the amount of ram it has, the size of the monitor.
         * Even an ant can have a state and behavior, the state can be the age, the number of legs.
         *
         * The behavior for a computer might be booting up, shutting down, printing something. For
         * an ant the behavior might be eating, drinking, fighting etc.
         *
         * Software objects that are part of object oriented programing are very similar to real world
         * objects because they also consist of states and behaviors.
         *
         * Software objects store their states in fields and we know fields as variables, and they
         * expose their behavior with methods.
         *
         * Classes are templates or blueprints for creating objects.
         * "public class Main" for example is a statement that creates a class in Java.
         */

        /** Now that we've created the blueprint and specified fome fields, we need to create the object.
         * Bare in mind that a class can also be considered a data type, one on steroids. Allowing the user
         * to actually create custom data types, just like String for example which is used as a 9th data type
         * but it is actually a class.
         */

//        Car porsche;
        /**Porsche is the keyword, of type "Car". Just like writing "int porsche;" using an int data type.
         * Now we're using a Car data type.
         * This is how you define an object of type Car that is called porsche.
         * Aka you've created an object called porsche, based on a template called car.
         * You also need to initialize the class:
         */
        Car porsche = new Car();
        Car holden = new Car();

        /** Now we've got two objects created from the same template called car.
         */
//        porsche.
        /** This is how you access the fields that were previously written in the blueprint, the Car class,
         * porsche. When you type the dot, a list of methods will show up, methods inherited automatically
         * through a process that was ran in the background by Java.
         * But in this list you can't see the custom fields that are part of the Car class, not yet.
         * This happens because, initially all the fields were declared as private, so they can't be accessed
         * outside the Car class.
         */

//        porsche.model = "Carrera";
        /** Now that the model field is public, it can be accessed within this class and appears as an option
         * after typing porsche.
         * Now we've defined the model (the model si a field, the state of the car), for our object, porsche.
         * This is one way of accessing the data but it is not really the correct way, because it more or
         * less violates the rules of encapsulation, requiring you to make every single field public.
         */
        /** The above statement can no longer call the other class because now, the model field is private,
         * so it can no longer be directly called.
         * On the other hand, that field is now being updated by a method, the setModel one that we've created
         * in the Car class. This method is public and can be directly accessed from within this class.
         */
        porsche.setModel("Carrera");
        /** This will SET the model field of the porsche object, to Carrera.
         * Now all we need is a way to print out the model. Back to the Car class -->.
         */

        System.out.println("Model is " + porsche.getModel());
        /** Now that the getter method is set up, we can print out the value of the model field.
         * The model was set previously to Carrera, with the help of the setter method and now it will
         * be accessed with another public method, getModel.
         * porsche.getModel() = the porsche object was created with the help of the Car template(class).
         * The template contains fields and methods. One of the methods returns the value of the model field.
         * So now we're accessing the getModel method withing the template, for the porsche object.
         */
        porsche.setModel("911");
        /** This will return "Model is Unknown" because the internal method will only set the value to the
         * model field if the value equals carrera or commodore. In this case the value is 911.
         */
    }
}
