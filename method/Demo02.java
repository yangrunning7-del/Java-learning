package method;


public class Demo02 {
    public static void main(String[] args) {
        printMax(13,3, 53,2, 56);

    }

    public static void printMax(double...numbers){
        if(numbers.length == 0){
            System.out.println("NO Data");
            return ;
        }

        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(result < numbers[i]){
                result = numbers[i];
            }
        }

        System.out.println("This max value is "+result);
    }

}