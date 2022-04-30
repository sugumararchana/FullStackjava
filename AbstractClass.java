public class AbstractClass {
	public static void main(String[] args) {
		
		Guitar g = new Guitar();
		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		

		Violin v = new Violin();
		v.utilize();
		v.play();
		v.tuneStrings();
		v.bow();
		
		Sitar s = new Sitar();
		s.utilize();
		s.play();
		s.tuneStrings();
		s.hand();
	}
}
abstract class Instrument {
	abstract void utilize();
}
abstract class MusicalInstrument extends Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Guitar strings");
	}

	@Override
	void play() {
		System.out.println("Playing the guitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the guitar....");
	}
	
	
	void pluck() {
		System.out.println("Plucking the guitar....");
	}
}

class Violin extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Violin strings");
	}

	@Override
	void play() {
		System.out.println("Playing the Violin...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Violin....");
	}
	
	
	void bow() {
		System.out.println("Bowing the Violin....");
	}
}

class Sitar extends StringBasedMusicalInstrument
{

	@Override
	void tuneStrings() {
		System.out.println("Tuning the Violin Sitar Strings");
	}

	@Override
	void play() {
		System.out.println("Playing the Sitar...");
	}

	@Override
	void utilize() {
		System.out.println("Utilizing the Sitar....");
	}
	
	
	void hand() {
		System.out.println("Playing  the Sitar....");
	}
}

