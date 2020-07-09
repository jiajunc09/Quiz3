package quiz3;

public class Cat extends Animal{
    private String name;
    @Override
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old");
    }
    public Cat(String X){
        this.name = X;        
    }
}
