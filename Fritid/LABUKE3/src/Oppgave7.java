import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Oppgave7 {

}


public class Student {
	private int studentNr;
	private String navn;
	private String etternavn;
	private String studieSted;
	
	public Student(int studentNr, String navn, String etternavn, String studieSted) {
		this.studentNr = studentNr;
		this.navn = navn;
		this.etternavn = etternavn;
		this.studieSted = studieSted;
	}

	public int getStudentNr() {
		return studentNr;
	}

	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getStudieSted() {
		return studieSted;
	}

	public void setStudieSted(String studieSted) {
		this.studieSted = studieSted;
	}
	
	
	public int compreTo(Student other) {
		return Integer.compare(this.studentNr, other.studentNr);
	}
	
	public String toString() {
        return "Student{" +
                "studentnummer=" + studentNr +
                ", fornavn='" + navn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", studieby='" + studieSted + '\'' +
                '}';
	}
	
	
	// For Oppgave C //
	@Override
	public String toString() {
	    return "Studentnummer: " + studentnummer +
	           ", Fornavn: " + fornavn +
	           ", Etternavn: " + etternavn +
	           ", Studieby: " + studieby;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentNr == other.studentNr;
	}
	
	
	
}

public static void Main(String[] args) {
	
    List<Student> students = new ArrayList<>();
    
    // Opprett og legg til Student-objekter
    students.add(new Student(103, "Ola", "Nordmann", "Oslo"));
    students.add(new Student(101, "Kari", "Hansen", "Bergen"));
    students.add(new Student(104, "Per", "Andersen", "Trondheim"));
    students.add(new Student(102, "Lise", "Johansen", "Stavanger"));
    students.add(new Student(105, "Jonas", "Nilsen", "Tromsø"));
	
    
    
    
    
    Collections.sort(students);
    
    System.out.println("\Sortert Liste:");
    	for(Student student : student) {
    		System.out.println(student);
    	}
}

public int compreTo(Student other) {
	int lastNameComparison = this.etternavn.compareTo(other.etternavn);
	
	if (lastNameComparison != 0) {
		return lastNameComparison;
	}
	
	return this.navn.comapreTo(other.navn)
}














