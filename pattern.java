package Logicjava;

public class pattern {
    public static void main(String[] args) {

        int i,j,cout=0;
        for (i=1;i<=3;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.printf("%d",cout++);
            }
            System.out.println(" ");

        }
    }
}
