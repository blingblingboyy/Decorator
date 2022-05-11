package Principal;

public class Principal {

    public static void main(String[] args) {

        Shape circle =  new Circle();
        
        Shape redCircle = new RedShapeDecorator(new Circle());
        
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circulo com borda normal");
        circle.draw();
        
        System.out.println("\n Circulo com borda vermelha");
        redCircle.draw();
        
        System.out.println("\n Rectangle com borda vermelha");
        redRectangle.draw();
       
    }
    
}
