public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
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
    public static void task3() {
        System.out.println("task 3");
        int speed = 60;

        if (speed > 60) {
            System.out.println(" Если скорость больше " + speed + " придется заплатить штраф");
        } else {
            System.out.println("Eсли скорость меньше или равна " + speed + " км можно ездить спокойно");
        }
        System.out.println("======================================");
    }
    public static void task4() {
        System.out.println("task 4");
        int kindergarten = 6;
        int school = 18;
        int university = 25;



        if(kindergarten <=6 && kindergarten >=2) {
            System.out.println("Если возраст человека равен " + kindergarten + ", то ему нужно ходить в садик");
        }
        if(school <=18 && school >=6) {
            System.out.println("Если возраст человека равен " + school + ", то ему нужно ходить в школу");
        }
        if(university <=24 && university >18) {
            System.out.println("Если возраст человека равен " + university + " , то ему нужно ходить в университет");
        } else {
            System.out.println("Нужно ходить на работу тебе больше 24 , взрослая жизнь ждет");
        }

        }
    public static void task5() {
        System.out.println("task 4");

        int ageKind1 = 5;
        int ageKind2 = 115;

        if( ageKind1 <=5) {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе.");
        }
        if(ageKind1 >= 5 && ageKind2 <=14){
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");


        }else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");
        }
    }
}
