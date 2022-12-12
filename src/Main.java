public class Main {
    public static void main(String[] args) {
        Human Maxim = new Human("Максим", 1988, "Минск", "бренд-менеджер", 0);
        Human Ania = new Human("Аня", 1993, "Москва", "методист образовательных программ", 1);
        Human Katya = new Human("Катя", 1992, "Калининград", "продакт - менеджер", 1);
        Human Artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса", 0);
        Maxim.printInformation();
        Ania.printInformation();
        Katya.printInformation();
        Artem.printInformation();
    }
}