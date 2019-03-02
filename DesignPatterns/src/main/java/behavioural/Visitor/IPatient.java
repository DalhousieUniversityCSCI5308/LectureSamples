package behavioural.Visitor;

// This is an element in the object structure that "accepts" a visitor.
public interface IPatient
{
	public void accept(IDoctorVisitor visitor);
}