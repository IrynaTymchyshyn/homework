// Інтерфейс Instrument
interface Instrument {
    void play();
}

// Клас Drum, який реалізує інтерфейс Instrument
class Drum implements Instrument {
    @Override
    public void play() {
        System.out.println("Барабан грає: бум-бум-бум!");
    }
}

// Клас Piano, який реалізує інтерфейс Instrument
class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Фортепіано грає: пінь-пінь-пінь!");
    }
}

// Клас Violin, який реалізує інтерфейс Instrument
class Violin implements Instrument {
    @Override
    public void play() {
        System.out.println("Скрипка грає: віу-віу-віу!");
    }
}

// Клас Musician
class Musician {
    private String name;

    public Musician(String name) {
        this.name = name;
    }

    public void playInstrument(Instrument instrument) {
        System.out.println(name + " грає на інструменті:");
        instrument.play();
    }
}

// Головний клас для програми
public class MusicConcert {
    public static void main(String[] args) {
        // Створюємо музикантів
        Musician john = new Musician("Джон");
        Musician mary = new Musician("Мері");

        // Створюємо музичні інструменти
        Instrument drum = new Drum();
        Instrument piano = new Piano();
        Instrument violin = new Violin();

        // Музиканти грають на різних інструментах
        john.playInstrument(drum);
        mary.playInstrument(piano);
        john.playInstrument(violin);
    }
}
