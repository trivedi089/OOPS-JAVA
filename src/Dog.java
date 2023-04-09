public class Dog {
    String name;
    String breed;
    int age;
    String colour;

    //Parameterised Constructor
    public Dog(String name,String breed,int age,String colour){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.colour=colour;
    }

    //Getters And Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    //Overriden toString() method
    @Override
    public String toString(){
        return "Hi My Name is "+this.getName()+"\nMy Breed is "+this.getBreed()+"\nMy Colour is "+this.colour+"\nMy Age is "+this.getAge();
    }
}
