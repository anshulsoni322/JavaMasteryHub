public class BasicsOperator{
    //Q1 - Finding Adult
    public static boolean isAdult(int age){
        if(age>=18){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        boolean ans = isAdult(22);
        if(ans){
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}