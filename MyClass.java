public class MyClass{
    public static void main(String[] args){

        String day = "Tuesday";
        int cost = 7;

        Room work = new Room();
        String Result = work.Lazy(day);
        System.out.println(Result);
        
        Computer obj = new Computer();
        obj.Music();
        String Can_I = obj.pen(cost);
        System.out.println(Can_I);

    }
}

class Room{
    public String Lazy(String a){
        if (a=="Tuesday" || a=="Friday"){
            return "Madhu, Put Rice";
        }
        return "No Work for Today";
    }
}

class Computer{
    public void Music(){
        System.out.println("Music Playing");
    }

    public String pen(int a){
        if(a>=5){
            return "Yes, you can buy a pen";
        }
        return "No, Money is not Enough";
    }
}