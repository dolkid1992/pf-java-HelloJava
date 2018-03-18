import java.util.Scanner;

public class Luong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luong ;
        int nam;
        System.out.println("Nhap he so luong cua ban:");
        luong=sc.nextInt();
        System.out.println("Nhap So Nam lam viec: ");
        nam=sc.nextInt();
        int ketqua = luong*4000000 + nam*500000;
        if (0 << luong <6){
            System.out.println("Luong cua ban la:"+ketqua);
        }
        else {
            System.out.println("Ban nhap he so luong sai");
        }

    }
}
