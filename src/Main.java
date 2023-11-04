Дадам, [04.11.2023 13:51]
// Создаем интерфейс HavingSuperAbility
interface HavingSuperAbility {
    void applySuperAbility();
}

// Создаем абстрактный класс Hero, реализующий интерфейс HavingSuperAbility
abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }
}

// Создаем классы героев Magic, Medic, Warrior, наследуя их от класса Hero
class Magic extends Hero {
    public Magic() {
        super(100, 20, "MAGIC POWER");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbility);
    }
}

class Medic extends Hero {
    public Medic() {
        super(120, 10, "HEALING");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbility);
    }
}

class Warrior extends Hero {
    public Warrior() {
        super(150, 30, "CRITICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbility);
    }
}

// В классе Main создаем массив из 3-х разных героев и применяем суперспособность каждого через цикл
public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic();
        heroes[1] = new Medic();
        heroes[2] = new Warrior();

        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}

Abdulaziz A, [04.11.2023 13:59]
https://github.com/abdulqziz2009/work7
