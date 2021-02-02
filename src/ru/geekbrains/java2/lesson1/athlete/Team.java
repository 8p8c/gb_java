package ru.geekbrains.java2.lesson1.athlete;

public class Team {
	protected Athlete members[];
	protected String name;

	public Team(String name) {
		this.name = name;
		members = new Athlete[4];
		members[0] = new Athlete("Leonardo", 9);
		members[1] = new Athlete("Raphael", 8);
		members[2] = new Athlete("Donatello", 7);
		members[3] = new Athlete("Michelangelo", 6);
	}

	public Athlete[] get_members() {
		return members;
	}

	public String get_name() {
		return this.name;
	}

	public void showResults() {
		StringBuilder result = new StringBuilder("These athletes passed the course:");
		for (Athlete member: members) {
			if (member.is_running()) {
				result.append(" ");
				result.append(member.get_name());
			}
		}
		result.append(".");
		System.out.println(result.toString());
	}
}
