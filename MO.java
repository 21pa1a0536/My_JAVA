//Method Overloading

class calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, int b){
        return a+b;
    } 
}

public class MO{
    public static void main(String[] args){
        calculator obj = new calculator();
        int first_add = obj.add(1,2);
        int second_add = obj.add(1,2,3);
        double third_add = obj.add(1.4,2);

        System.out.println(first_add);
        System.out.println(second_add);
        System.out.println(third_add);
    }
    
}
