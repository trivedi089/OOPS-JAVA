public class Main {
    public static void main(String[] args) {
        System.out.println("Hello to the world of Dogs!\n");

        System.out.println(new Dog("Dogesh","Cheems",5,"Golden").toString());

        //If I use default toString() Method
        //response -> Dog@2f92e0f4

        //Using Override toString()
        /*
        response :
        Hi My Name is Dogesh
        My Breed is Cheems
        My Colour is Golden
        My Age is 5
        */
    }
}