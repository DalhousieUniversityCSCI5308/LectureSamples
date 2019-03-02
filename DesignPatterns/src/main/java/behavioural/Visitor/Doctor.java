package behavioural.Visitor;

// This is the concrete visitor object that does the work.  You could implement
// different visitors that do different things to the objects it visits.
public class Doctor implements IDoctorVisitor
{
	public void visitBrokenArmPatient(BrokenArmPatient patient)
	{
		// This doctor knows to put broken arms in a cast.
		// This means the Doctor knows about the public interface exposed
		// by the concrete BrokenArmPatient class and knows how to do "Doctor"
		// stuff to that class (in this case call the putArmInCast() method).
		patient.putArmInCast();
	}

	public void visitCancerPatient(CancerPatient patient)
	{
		// This doctor knows to give cancer patients chemotherapy.
		patient.administerChemotherapy();
	}
}