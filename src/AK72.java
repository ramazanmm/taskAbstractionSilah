public class AK72 extends Weapon implements Fireable{
    public int daraqCount;
    public AK72(int mermiSayi, int daraqTutumu) {
        super(mermiSayi, daraqTutumu);
    }
    public void getMermiSayi(){
        System.out.println("Qalan mermi sayi: " + mermiSayi);
        System.out.println();
    }
    public void getDaraqCount(){
        System.out.println("Daraqdaki mermi sayi: " + daraqCount);
        System.out.println();
    }

    @Override
    public void zarjatEtmek() {
        if (daraqCount==0 && mermiSayi >= daraqTutumu){
            mermiSayi -= daraqTutumu;
            daraqCount = daraqTutumu;
        }
        else if (daraqCount>0) {
            System.out.println("Daraqda mermi var, Zarjat olunmadi.");
            System.out.println();
        }
        else if (mermiSayi>0 && mermiSayi<daraqTutumu){
            daraqCount = mermiSayi;
            mermiSayi = 0;
            System.out.println("Mermi qalmadi.");
            System.out.println();
        }
        else if (mermiSayi==0){
            System.out.println("Mermi yoxdur");
        }

    }

    @Override
    public void atisEtmek() {
        if (daraqCount>0){
            daraqCount--;
        }
        else
            System.out.println("Daraqda mermi yoxdur, Zarjat edin.");
        System.out.println();
    }
}
