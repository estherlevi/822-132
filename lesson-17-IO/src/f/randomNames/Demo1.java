package f.randomNames;

public class Demo1 {

	public enum names {
		Dan, Ran, Dina, Yafa, Moshe, Liat;
	}
	
	public static void main(String[] args) {
		String name = names.values()[(int)(Math.random()*names.values().length-1)].toString();
		System.out.println(name);
	}

}
