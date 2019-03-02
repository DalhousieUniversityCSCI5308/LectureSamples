package behavioural.Visitor;

import java.util.*;

// This class is the class that manages the object structure, it is responsible
// for enumerating the objects in the structure, and doing the work of having
// visitors visit all of the objects in the structure.
public class Hospital
{
	List<IPatient> patients;
	
	public Hospital()
	{
		patients = new ArrayList<IPatient>();
		patients.add(new BrokenArmPatient());
		patients.add(new BrokenArmPatient());
		patients.add(new BrokenArmPatient());
		patients.add(new CancerPatient());
		patients.add(new CancerPatient());
		patients.add(new CancerPatient());
		patients.add(new CancerPatient());
		visitAllPatients();
	}
	
	// This method just makes a doctor and sends the doctor to visit all the
	// patients, but the visitor could be passed IN to this method (dependency injection).
	private void visitAllPatients()
	{
		Doctor doctor = new Doctor();
		ListIterator<IPatient> iter = patients.listIterator();
		while (iter.hasNext())
		{
			IPatient patient = iter.next();
			patient.accept(doctor);
		}
	}
}