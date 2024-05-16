import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner sc = new Scanner(System.in);

    static AK72 ak72;

    public static void main(String[] args) {

        System.out.print("Mermi sayini daxil edin: ");
        int mermiCount = sc.nextInt();
        System.out.print("Daraq tutumu sayini daxil edin: ");
        int daraqTutumu = sc.nextInt();

        ak72 = new AK72(mermiCount, daraqTutumu);
        getZarjat();

        while (mermiCount > 0) {
            menu();
            System.out.print("prosesi secin: ");
            int proses = sc.nextInt();
            switch (proses) {
                case 1 -> showMermiSayi();
                case 2 -> showDaraqCount();
                case 3 -> getZarjat();
                case 4 -> atisEt();
            }
        }
    }

    public static void menu() {
        System.out.println("1 -mermi sayina bax.");
        System.out.println("2 -daraqdaki mermi sayina bax.");
        System.out.println("3 -zarjat et.");
        System.out.println("4 -atis et.");
    }

    public static void showMermiSayi() {
        ak72.getMermiSayi();
    }

    public static void showDaraqCount() {
        ak72.getDaraqCount();
    }

    public static void getZarjat() {
        ak72.zarjatEtmek();
    }

    public static void atisEt() {
        ak72.atisEtmek();
    }
}