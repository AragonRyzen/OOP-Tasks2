import java.util.Scanner;

public class Main {

    public static void main(String []argc){
        Scanner scanner = new Scanner(System.in);
//1
        System.out.println("������� 1");
        System.out.println("������� ������");
        String st = scanner.nextLine();
        System.out.println("������� N");
        int nom = scanner.nextInt();
        System.out.println(repeat(st, nom));
//2
        System.out.println("������� 2");
        System.out.println("������� ������ �������");
        int raz = scanner.nextInt();
        int[] mas = new int[raz];
        for (int i = 0; i<raz; i++){
            System.out.println("������� ������� �������");
            mas[i] = scanner.nextInt();
        }
        System.out.println("������� ����� ������������ � ����������� ��������� = " + differenceMaxMin(mas));
//3
        System.out.println("������� 3");
        System.out.println("������� ������ �������");
        raz = scanner.nextInt();
        mas = new int[raz];
        for (int i = 0; i<raz; i++){
            System.out.println("������� ������� �������");
            mas[i] = scanner.nextInt();
        }
        System.out.println(isAvgWhole(mas));
//4
        System.out.println("������� 4");
        System.out.println("������� ������ �������");
        raz = scanner.nextInt();
        mas = new int[raz];
        for (int i = 0; i<raz; i++){
            System.out.println("������� ������� �������");
            mas[i] = scanner.nextInt();
        }
        int[] outmas = new int[raz];
        outmas = comulativeSum(mas);
        for (int i = 0; i<raz; i++){
            System.out.print(outmas[i] + " ");
        }

//5
        System.out.println("������� 5");
        System.out.println("������� �����");
        String ch = scanner.nextLine();
        System.out.println(getDecimalPlaces(ch));

//6
        System.out.println("������� 6");
        System.out.println("������� �����");
        nom = scanner.nextInt();
        System.out.println(fibonacci(nom));

//7
        System.out.println("������� 7");
        System.out.println("������� ������");
        String adress = scanner.nextLine();
        System.out.println(isValid(adress));
//8
        System.out.println("������� 8");
        System.out.println("������� ������ ������");
        String str1 = scanner.nextLine();
        System.out.println("������� ������ ������");
        String str2 = scanner.nextLine();
        System.out.println(isStrangePair(str1,str2));

//9
        System.out.println("������� 9");
        System.out.println("������� �����");
        String slovo = scanner.nextLine();
        System.out.println("������� �������");
        String pref = scanner.nextLine();
        if (isPrefix(slovo, pref) == true){System.out.println("�������� ����� ���������� � �������� " + pref);}
        else {System.out.println("�������� ����� �� ���������� � �������� " + pref);}

        System.out.println("������� �����");
        slovo = scanner.nextLine();
        System.out.println("������� �������");
        String suff = scanner.nextLine();
        if (isSuffix(slovo, suff) == true){System.out.println("�������� ����� ������������� ��������� " + suff);}
        else {System.out.println("�������� ����� �� ������������� ��������� " + suff);}

//10
        System.out.println("������� 10");
        System.out.println("������� �����");
         nom = scanner.nextInt();
        System.out.println(boxSeq(nom));
    }
//1
    public static String repeat (String strn, int n){
        String strf = "";
    for (int i = 0; i<strn.length(); i++){
        char symb = strn.charAt(i);
        for (int j=0; j<n; j++){
            strf = strf + symb;
        }
    }
    return strf;
    }
//2
    public static int differenceMaxMin(int[] masf){
        int max = masf[0];
        int min = masf[0];
        for (int i = 0; i<masf.length; i++){
            if (max<masf[i]){max=masf[i];}
            if (min>masf[i]){min=masf[i];}
        }
        return (max-min);
    }

//3
    public static boolean isAvgWhole(int[] masf){
        int sum=0;
        for (int i = 0; i<masf.length; i++){
            sum = sum+masf[i];
        }
        return (sum % masf.length == 0);

    }

//4
    public static int[] comulativeSum (int[] masf){
        int[] rezmas = new int [masf.length];
        for (int i=0; i<masf.length; i++){
            int sum = 0;
            for (int j=0; j<=i; j++){
                sum = sum + masf[j];
            }
            rezmas[i]=sum;
        }
        return rezmas;
    }

//5
    public static int getDecimalPlaces(String strf){
      int kol=0;
       int index = strf.indexOf('.');
                for (int i= index+1; i<strf.length(); i++){
                 kol++;
                }
                return kol;
    }

//6
    public static int fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


//7
    public static boolean isValid(String address) {
        if (address.length() > 5) return false;
        if (address.indexOf(" ") != -1) return false;
        try {
            int check = Integer.parseInt(address);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

//8
    public static boolean isStrangePair(String st1, String st2){
        if (st1.length() == 0 || st2.length() == 0) return false;
        return ((st1.charAt(0) == st2.charAt(st2.length() - 1)) && (st1.charAt(st1.length() - 1) == st2.charAt(0)));
    }

//9
    public static boolean isPrefix(String word, String prefix) {
return word.startsWith(prefix.substring(0, prefix.length() - 1));
}

public static boolean isSuffix(String word, String suffix) {
return word.endsWith(suffix.substring(1));
}

//10
    public static int boxSeq(int step) {
        if (step == 0) return 0;
        if (step % 2 == 0) return step;
        return step + 2;
    }


}
