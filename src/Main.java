//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    var dog = 8.0;
    System.out.println(dog);
    var cat = 3.6;
    System.out.println(cat);
    var paper = 763789;
    System.out.println(paper);

    dog =dog +2;
    System.out.println(dog);
    cat =cat +2;
    System.out.println(cat);
    paper =paper +2;
    System.out.println(paper);

    dog =dog -3.5;
    System.out.println(dog);
    cat =cat -1.6;
    System.out.println(cat);
    paper =paper -7639;
    System.out.println(paper);

    var friend = 19;
    System.out.println(friend);
    friend =friend +2;
    System.out.println(friend);
    friend =friend /7;
    System.out.println(friend);

    var frog = 3.5;
    System.out.println(frog);
    frog =frog *10;
    System.out.println(frog);
    frog =frog /3.5;
    System.out.println(frog);
    frog =frog +4;
    System.out.println(frog);

    var boxer1Mass = 78.2;
    var boxer2Mass = 82.7;
    var totalMass = boxer1Mass + boxer2Mass;
    System.out.println(totalMass);
    var massDifference = (boxer1Mass - boxer2Mass);
    System.out.println(massDifference);
    var remainder = boxer2Mass % boxer1Mass;
    System.out.println(remainder);

    var totalHours = 640;
    var hoursPerEmployee = 8;
    var employees = totalHours / hoursPerEmployee;
    System.out.println("Всего работников в компании — "+employees +" человек");
    var newEmployees = employees + 94;
    System.out.println(newEmployees);
    var newTotalHours = newEmployees * hoursPerEmployee;
    System.out.println("Если в компании работает "+newEmployees +" человек, то всего "+newTotalHours +" часов работы может быть поделено между сотрудниками");

}
}