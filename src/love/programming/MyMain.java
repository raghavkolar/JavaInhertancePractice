package love.programming;

public class MyMain {

    public static void main(String[] args) {


        Animal myAnimal= new Animal();

        System.out.println("*********************************");

        Dog myDog= new Dog();
        System.out.println("*********************************");

        Cat myCat= new Cat();
        System.out.println("*********************************");

        GermanShepard myGs= new GermanShepard();
        System.out.println("*********************************");

        System.out.println(myAnimal.name);






/*

        Animal myAnimal= new Animal ("animal ", 0);

//        myAnimal.name="Dog";
////        myAnimal.numbnerOfLegs=4;


        System.out.println(" Type of Animal name:"+myAnimal.name);



        Dog myDog=new Dog("dolly",4);

        System.out.println("name:"+myDog.name + "Type of animal" +myAnimal.name);



        Cat myCat=new Cat("Kelly",4);

        GermanShepard myGermanShapard = new GermanShepard("Jhony",4);
*/


    }


}
