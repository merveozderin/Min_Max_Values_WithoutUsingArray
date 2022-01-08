import java.util.Scanner;

public class Min_Max_Value
{
    public static void main(String[] args)
    {
        int value, deger, enk=0, enb=0;
        Scanner input_value = new Scanner(System.in);
        System.out.println("Kaç değer girmek istiyorunuz?");
        value = input_value.nextInt();

        for (int i=1; i<=value; i++)
        {
            System.out.println(i+ ". değeri giriniz: ");
            deger = input_value.nextInt();

            if(i != 1 && deger>enk && deger >enb)
            {
                enb = deger;
            }
            else if (i != 1 && deger<enk && deger<enb)
            {
                enk = deger;
            }
            else  if( i==1)
            {
                enk = deger;
                enb = deger;
            }
        }

        System.out.println("En büyük değer: " +enb);
        System.out.println("En küçük değer: " +enk);

        }


    }
