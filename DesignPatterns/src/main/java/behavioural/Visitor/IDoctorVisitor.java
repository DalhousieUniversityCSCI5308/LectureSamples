package behavioural.Visitor;

// This is the Visitor interface that handles known concrete element classes
public interface IDoctorVisitor
{
	public void visitBrokenArmPatient(BrokenArmPatient patient);
	public void visitCancerPatient(CancerPatient patient);
}