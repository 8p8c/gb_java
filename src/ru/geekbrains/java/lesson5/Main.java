package ru.geekbrains.java.lesson5;

public class Main {
	public static void main(String[] args) {
		Person[] persArray = new Person[5];
		persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
		persArray[1] = new Person("Nariman Namazov", "Master of puppets", "abunyasha@mail.ru", "892612312", 100000, 34);
		persArray[2] = new Person("Angela Merkel", "Kanzlerin", "kanzlerin@deutschland.de", "292232312", 40000, 66);
		persArray[3] = new Person("William Henry Gates III", "Vaccine evangelist", "gates@hotmail.com", "192555312", 1, 65);
		persArray[4] = new Person("Maxime Katz", "founder", "theshtab@gmail.com", "890334823443", 50000, 36);

		int i = 0;
		while (i < persArray.length) {
			if (persArray[i].getAge() > 40) {
				System.out.println(persArray[i].toPrettyString());
			}
			i++;
		}
	}
}
