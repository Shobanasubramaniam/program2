import java.util.Scanner;
class task1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the number of subject marks: ");
        int n=scanner.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            System.out.print("Enter the mark "+i+" out of 100: ");
            int marks=scanner.nextInt();
            sum+=marks;
        }
        int average=sum/n;
        System.out.println("Total marks scored is: "+sum);
        System.out.println("Average scored is: "+average+"%");
        System.out.print("Grade obtained is: ");
        if(average>=90){
            System.out.println("Grade A");
        }
        else if(average>=80 && average<90){
            System.out.println("Grade B");

        }
        else if(average>=70 && average<80){
            System.out.println("Grade C");
        }
        else if(average>=60 && average<70){
            System.out.println("Grade D");
        }
        else if(average>=50 && average<60){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail. Need improvement!!!");
        }
        
        
    }
}