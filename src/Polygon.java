class Polygon {
    public void display() {
    }
 }
 
 class AnonymousDemo {
    public void createClass() {
 
       // creation of anonymous class extending class Polygon
       Polygon p1 = new Polygon() {
        @Override
          public void display() {
             System.out.println("Inside an anonymous class.");
          }
       };
       p1.display();
    }
 }
 
 class RunAnonymous {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
 }