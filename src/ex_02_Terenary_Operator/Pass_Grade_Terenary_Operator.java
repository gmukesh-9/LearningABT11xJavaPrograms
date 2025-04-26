package ex_02_Terenary_Operator;

public class Pass_Grade_Terenary_Operator {

    //logic builiding
    //1. Inputs
    //integer num
    //2. Outputs
    //String

    //3. Rough logic
    //num>=90 && num<=100
    //num>=89 && num<=80
    //num>=79 && num<=70
    //num>=69 && num<=60
    //num>=59 && num<=0

    public static void main(String[] args) {
        String number=args[0];
        int num = Integer.parseInt(number);

        String grade = (num >= 90 && num <= 100) ? "A" :
                       (num >= 80 && num <= 89) ? "B" :
                       (num >= 70 && num <= 79) ? "C" :
                       (num >= 60 && num <= 69) ? "D" :
                       (num >= 0 && num <= 59) ? "Failed" : "Please enter number between 0 to 100";
        System.out.println("Grade of the Student is : "+grade);

    }

}
