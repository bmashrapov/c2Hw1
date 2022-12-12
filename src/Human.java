public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;
    int sex;

    Human(String name, int yearOfBirth, String town, String jobTitle, int sex) {
        if (name == null) {
            System.out.println("Введите полную информацию");
        } else {
            this.name = name;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.town = town;
        if (town == null) {
            System.out.println("Введите полную информацию");
        } else {
            this.town = town;
        }
        this.jobTitle = jobTitle;
        if (jobTitle == null) {
            System.out.println("Введите полную информацию");
        } else {
            this.jobTitle = jobTitle;
        }
        this.sex = sex;
    }

    public void printInformation() {
        if (sex == 0) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        } else {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        }
    }
}
