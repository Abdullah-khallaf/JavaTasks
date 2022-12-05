public class Circle {

    Double radius;


    public Circle(Double radius) {
        this.radius = radius;
    }


    public double calculateArea(){
        return (22 * radius * radius) / 7 ;
    }

    public double calculateCircumference(){
        return (22 * 2 * radius) / 7 ;
    }


}
