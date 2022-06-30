public class TestCoordenada {
  public static void main(String[] args)
  {
    Coordenada a = new Coordenada();
    a.setX (1.5);
    a.setY(3.5);
    
    System.out.println("coordenada x1: " + a.getX());
    System.out.println("coordenada y1: " + a.getY());
    System.out.println(a);
    
    Coordenada b = new Coordenada();
    b.setX(2.5);
    b.setY(4.5);
    
    
    
    System.out.println("coordenada x2: " + b.getX());
    System.out.println("coordenada y2: " + b.getY());
    System.out.println(b);
    
    Coordenada c;
    c = b;
    
     if(a.equals(b))
   {
     System.out.println("Coordenadas iguales " );
     
   }
   else
   {
     System.out.println("Coordenadas diferentes ");
   }
   
   
   
   
   
   
   
   
    
   
    
  }
  
}
