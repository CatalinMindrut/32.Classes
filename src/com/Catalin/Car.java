package com.Catalin;

public class Car {
    /** It is recommended that to write the first letter of a class name in upper case.
     * "public" is an access modifier that determines what access we allow others to have to this class.
     * This allows unrestricted access to a class.
     * Other access modifiers are "private" which means that no other classes can access this class.
     * "protected" which allows only classes in this package to access this class.
     *
     * Variables created inside a method are called local variables and they can not be accessed
     * outside that method.
     * Classes allow us to create variables that can be seen and can be accessed anywhere within the
     * class that we're creating.
     * This are known as class or member variables but are commonly referred to as fields.
     *
     * When you're creating a field for a class you need to also specify an access modifier that works the same
     * way the class access modifiers work.
     * As a general rule when you're defining fields in Java, you go with the access modifier "private".
     * when we're using the private access modifier, we're actually adhering to encapsulation which is a
     * fundamental rule of object oriented programming.
     * Encapsulation in Java is used to hide the fields and methods from access publicly.
     * The internal workings of a particular object can only be accessed by this class.
      */

    private int doors;
    private int wheels;
    private String model;
//    public String model; //Setting it to public so it can be accessed by the Main class.
    private String engine;
    private String colour;
    /** These are the fields that we've created for the object.
     * The next thing we need to do is to create an object from this class, remembering that the class
     * is just a blueprint for the object. Back to the main class.
     */

    /** Now we're going to create a method, withing the class and this method will attach to every object
     * that you create for that particular class.
     * In the past we've only created static methods, this time we're just going to create a public method.
     */
    public void setModel(String model){
        /** We've created a class, public class that returns nothing (void). The class will have a String parameter.
         * This will allow the other class to send a string parameter to this method, in the Car class.
         * Currently we've got two variables called model, one was initially set above and it is a field and the
         * other is actually a parameter passed to this method.
         * Java will need to know exactly which one we're using at any given time.
         * To fix this we're going update the field with the contents of the parameter that was passed to the method,
         * and update this within the method.
         *
         * In order to update the field, we need to use a keyword called "this". This points to the field.
         */
//        this.model = model;
        /** this.model points out to the model field and "model" after the equal sign, points to the parameter
         * passed to the method.
         * This statement means that the model field will be updated with the model parameter, passed to this
         * method.
         * This is a way to access the private field, with the help of a method.
         */
        /** We can also introduce some type of validation in the setter method:
         */
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknow";
        }
        /** The .toLowerCase(); makes sure that everything is being converted to a lower case.
         * The .equals() is a way to test that a particular value of String is equal to another one (explained
         * at the bottom of the page).
         * So only if what was passed to this method, equals a porsche or a holden, we will allow our internal
         * model field to be assigned the value that has been passed.
         */
    }
    public String getModel(){
        return this.model;
    }
    /** When you type in this., you will get suggestions that have, to the left little icons and to the right,
     * the data type.
     * Now this will indicate if the suggestion is a method (little m), a parameter (little p) etc. And it will
     * also have a padlock icon, that is either red, closed, indicating that this is private or a green one,
     * unlocked, indicating that this is public.
     *
     * This method will be used to return (or to get as the name implies) the value of the model FIELD. We're
     * making sure that the field is returned by using this.model again.
     */
}

/** Comparison between .equals  and ==
 * Main difference between .equals() method and == operator is that one is method and other is operator.
 * We can use == operators for reference comparison (address comparison) and .equals() method for
 * content comparison. In simple words, == checks if both objects point to the same memory location
 * whereas .equals() evaluates to the comparison of values in the objects.
 *
 * // Java program to understand
 * // the concept of == operator
 * public class Test {
 *     public static void main(String[] args)
 *     {
 *         String s1 = new String("HELLO");
 *         String s2 = new String("HELLO");
 *         System.out.println(s1 == s2);
 *         System.out.println(s1.equals(s2));
 *     }
 * }
 * Output:
 * false
 * true
 *
 * Both s1 and s2 refer to different objects.
 * When we use == operator for s1 and s2 comparison then the result is false as both have different
 * addresses in memory.
 * Using equals, the result is true because its only comparing the values given in s1 and s2.
 */
