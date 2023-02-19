public class Main {
    public static void main(String[] args) {
        task1();
        task3();
    }
        public static void task1() {
            System.out.println("task 1");
        byte age = 17;
        if (age >= 18) {
            System.out.println("ВамВы совершеннолетний");

        } else {
            System.out.println("Вы не совершеннолетний ");
        }
            System.out.println("===========================");
    }
    public static void task3(){
        System.out.println("task 3");
        int speed = 60;

        if(speed > 60){
            System.out.println(" Если скорость больше " + speed +  " придется заплатить штраф");
        }else {
            System.out.println( "Eсли скорость меньше или равна " + speed +  " млжно ездить спокойно");
        }


    }
}