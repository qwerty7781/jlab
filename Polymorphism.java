abstract class Shape{
    public abstract void noofsides();
}

class Rectangle extends Shape{
    public void noofsides(){
        System.out.println("Number of sides=4");
    }
}
class Triangle extends Shape{
    public void noofsides(){
        System.out.println("Number of sides=3");
    }
}
class Hexagon extends Shape{
    public void noofsides(){
        System.out.println("Number of sides=6");
    }
}

class Poly{
    public static void main(String[]args){
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        Hexagon h=new Hexagon();
        
        r.noofsides();
        t.noofsides();
        h.noofsides();
        
    }
}
   
    
