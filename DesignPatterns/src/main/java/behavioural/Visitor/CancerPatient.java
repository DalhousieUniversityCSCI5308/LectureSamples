package behavioural.Visitor;

// This is a concrete element in the object structure that can be visited
// by the visitor object.
public class CancerPatient implements IPatient
{
	public void administerChemotherapy()
	{
		System.out.println("Yay I'm all better!");
	}

	public void accept(IDoctorVisitor visitor)
	{
		// Each Concrete Element object must tell the visitor what kind of object it is,
		// this usually means calling the specific method in the visitor interface associated
		// to the concrete element.
		visitor.visitCancerPatient(this);
	}
}