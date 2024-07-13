abstract class Person {
    abstract void printName();
}

class Employee extends Person{

    @Override
    void printName() {
        System.out.println("Abishek Krishnan");
    }
    
}

class RunAbstract {
    public static void main(String[] args) {
        Person emp = new Employee();
        emp.printName();
    }
}

