public class Dog extends Animal {
    public Dog(){
      super();//used to call super class constructor
        System.out.println("now I am Dog..");
    }
    @Override
    public String sleep() {
        return "A Dog sleeps...";
    }

    @Override
    public String eat() {
        return "A Dog eats...";
    }

    public String Dog_purr() {
        return "Dog purrr...";
    }
}
