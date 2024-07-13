interface Shape {
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
    
}

class RunInterface {
    public static void main(String args[]){
        Shape rect = new Rectangle();
        Shape circ = new Circle();

        rect.draw();
        circ.draw();
    }
}