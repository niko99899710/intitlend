public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        var frog1 = 10;
        frog1 = frog1 + 4;
        System.out.println(frog1);

        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var fightersWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Вес двух бойцов " + fightersWeight + "кг");
        var differenceWeight = firstFighterWeight - secondFighterWeight;
        System.out.println("Разница в весе бойцов " + differenceWeight + "кг ");
        var differenceTwoWeight = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница в весе " + differenceTwoWeight + "кг ");
        var weight = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница в весе двух бойцов " + weight + "кг ");

        var allHours = 640;
        var eachWorker = 8;
        var howManyHours = allHours / eachWorker;
        System.out.println("Всего работников в компании " + howManyHours + " человек ");
        var staff = 80;
        staff = staff + 94;
        System.out.println("колличество сотрудников в компании " + staff);
        allHours = allHours / 174;
        System.out.println("Если в компании работает " + staff + " человек, то всего по " + allHours + " часа работы может быть поделено между сотрудниками ");
    }
}