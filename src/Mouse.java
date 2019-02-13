public class Mouse extends Animal {
    public Mouse(){
        super();//used to call super class constructor
        System.out.println("now I am Mouse..");
    }
    @Override
    public String sleep() {
        return "A MOuse sleeps...";
    }

    @Override
    public String eat() {
        return "A MOuse eats...";
    }

    public String MOuse_purr() {
        return "MOuse purrr...";
    }
}
