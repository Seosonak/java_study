package java_modeling.ch01.asso3;

public class Course {
	private String name;

	public Course(String name) {
		this.name = name;
		transcripts = new Vector<trabscript>;
	}

	public String getName() {
		return name;
	}
	public void addTranscript(Transcript transcript ) {
		transcripts.add(transcript);
	}
}
