public class Motorcycle extends Vehicle{

    private String color;

    public Motorcycle (String name, int wheels, String color){
        super(name, wheels);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void vroom(){
        System.out.println("Vroom Vroom! You intimidated someone.");
    }

    public void turnOnFrontLights(){
        System.out.println("It's too dark. Front lights are turned on for safety.");
    }
}
