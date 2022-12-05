public class Triangle {

    Double a, b, c;

    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Double calculateArea(){
       Double Perimeter = a + b + c;
       Double s = Perimeter/2;
        Double area = Math.sqrt( s * (s-a) * (s-b) * (s-c));
        return area;
    }

    public Double calculateCircumference(){
        return a + b + c;
    }
}
