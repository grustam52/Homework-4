public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age <= 18) {
            System.out.println("если возраст человека равен " + age + " то он не достиг совершенолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
            System.out.println("задача 2");
            int temperature = 8;
            if ( temperature <= 5 ) {
                System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку");
            } else { System.out.println(" На улице " + temperature + " градусов, можно идти без шапки");

            }
        }
        public static void task3 () {
        System.out.println("задача 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " придется заплатить штрф");
        }else {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("задача 4");
        int yearsOld = 19;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println(" Если возраст человека равен " + yearsOld + " то ему нужно ходить в десткий сад");
        } else if (yearsOld > 7 && yearsOld <= 18) {
            System.out.println(" Если возраст человека равен " + yearsOld + " то ему нужно ходить в школу");
        } else if (yearsOld > 18 && yearsOld <= 24) {
            System.out.println(" Если возраст человека равен " + yearsOld + " то ему нужно ходить в Университет");
        }else if (yearsOld > 24 ){
            System.out.println(" Если возраст человека равен " + yearsOld + " то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("задача 5");
        int years = 15;
        if (years < 5) {
            System.out.println( "Если возраст ребенка равен " + years + " то ему нельзя кататься на аттракционе");
        } else if (years < 14) {
            System.out.println( "Если возраст ребенка равен " + years + " то ему можно кататься на аттракционе в сопровождении");
        }else {
            System.out.println(" Ребёнок может кататься на аттракционе ");
        }

    }
    public static void task6 () {
        System.out.println("задача 6");
        int capacity = 102;
        int seatsCount = 60;
        int otherCount = capacity - seatsCount;
        int seatUsed = 6;
        int otherUsed = 4;
        if (seatUsed < seatsCount){
            System.out.println(" Есть еще " + (seatsCount - seatUsed) + " сидячих мест");
        }
        if (otherUsed < otherCount){
            System.out.println( " Есть Еще "+ (otherCount - otherUsed) + " стоячих мест" );
        }
    }
    public static void task7 () {
        System.out.println("задача 7");
        int one = 99;
        int two = 8;
        int three = 130;
        if (one > three) {
            if (one >= three){
                System.out.println(" Большее число - " + one );
            }else {
                System.out.println(" Большее число - " + three );
            }
        }else if (two > one) {
            if (one >= three) {
                System.out.println(" Большее число - " + two);
            }else {
                System.out.println(" Большее число - " + three);
            }
        }else {
            if (one > three) {
                System.out.println(" Большее число - " + one);
            }else if ( three > one){
                System.out.println(" Большее число - " + three);
            }else {
                System.out.println( " Все три числа равны ");
            }
        }
    }

}