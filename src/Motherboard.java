/*
 * Copy - pasted from https://www.programiz.com/java-programming/nested-inner-class
 */
class MotherBoard {

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            return usb2 + usb3;
        }
    }
 
 }
class RunStaticInnerClass {
    public static void main(String[] args) {
 
        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
 }