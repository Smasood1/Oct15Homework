package SolidDesignPrinciples;

import jdk.jfr.DataAmount;

public class Main {


    //S.O.L.I.D stands for:

    //Single Responsibility principle
    //Open closed principle
    //Liskov Substitution Principle
    //Interface Segregation Principle
    //Dependency Inversion Principle



    //Single Responsibility principle: a class should have only one reason to chagne.

    public static void main(String[] args) {

    }



    class ProductService{

        public void addProduct(){
            System.out.println("add product logic...");
        }

        public Product getProduct(){
            return null;
        }

        public Product getProductId(Long id){
            return null;
        }

        //If the requirements change for this class, such as we have a text email and an HTML email to be sent,
        //we need to create a class for notifications and seperate it from the Product service class

//        public void sendSms(){
//            System.out.println("sms sent");
//        }
//
//        public void sendEmail(){
//            System.out.println("email sent");
//
//        }

        class NotificationService{

            public void sendSms(){
                System.out.println("sms sent");
            }

            public void sendHtmlEmail(){
                System.out.println("email sent");
            }

            public void sendTextEmail(){
                System.out.println("email sent");
            }

        }

        //even though the methods are different, the idea is to separate the concerns.

        class Product{
            private String name;
        }
    }




    public class OpenClosedPrinciple{

        //Open Closed Principle: states that software entities should be opened to extension but closed to modification.

//        class AreaCalculator{
//
//            private void squareArea(Double height, Double width){
//                System.out.println(height * width);
//            }
//
//            private void circleArea(Double radius){
//                System.out.println(radius * radius * Math.PI);
//            }
//        }

class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }
}

        interface Shape {
            void calculate();
        }


        class Rectangle implements Shape {
            public Double height;
            public Double width;

            @Override
            public void calculate() {
                System.out.println(height * width);
            }
        }


        class Circle implements Shape {
            public Double radius;

            @Override
            public void calculate() {
                System.out.println(radius * radius * 3.14);
            }
        }

        //because we introduced polymorphism we now have each shape handle its own implementation that way we wont have
        //to add or change the old method everytime.



    }

    //Liskov Substitution Principle: states substitutability of a class by its sublclass, so a class can be replaced by its
    //subclasses in all practical usage scenarios.

    //A childclass should only extend a parent class if we can replace a parent class object by a childclass object without changing
    // the behavior of the program, otherwise we should use composition or delegation.

    //integration Segregation Principle states that a client shouldnt be forced to implement an interface that it doesnt use.
    //-break up interface into smaller components.

    //Dependency Inversion Principle states that we should invert the classic dependecy between higher level modules and lower level modules
    // by abstracting their interaction.








}
