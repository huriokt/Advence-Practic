package day03.day07;

public class BMI {
    private double kilo;
    private double boy;

    public BMI(double kilo, double boy) {
        this.kilo = kilo;
        this.boy = boy;
    }

    public BMI() {
    }

    public double getKilo() {
        return kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void BMIHesapla(){
      double bmi=kilo/(boy*boy);
      if (bmi>0&&bmi<18.5){
          System.out.println("Zayif kategarisindesiniz.");
      }else if(bmi>=18.5&&bmi<25){
          System.out.println("Normal kategarisindesiniz. ");
      }else  if (bmi>25&&bmi<30){
          System.out.println("Kilolu kategarisindesiniz.");
      } else if (bmi >= 30) {

          System.out.println("Obez kategarisindesiniz.");
      }else {
          System.out.println("Gecersiz deger");
      }




    }


    @Override
    public String toString() {
        return "BMI{" +
                "kilo=" + kilo +
                ", boy=" + boy +
                '}';
    }
}
