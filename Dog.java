package quiz3;

public class Dog extends Animal{
    private String name;
    @Override
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old");
    }
    public Dog(String X){
        this.name = X;       
    }
}
