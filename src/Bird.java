public class Bird extends Animal {
    public Bird(){
        System.out.println("A bird is hatched....");
    }
    @Override
    public String sleep(){
        return "A bird sleeps soundly...";
    }
    @Override
    public String eat(){
     return "A bird eat..";
    }
    public String fly(){
        return "A bird flies";
    }
}
