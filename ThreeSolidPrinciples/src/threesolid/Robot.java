package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

/* Bo Heyse
	-Open Close Principle: By separating out the robot class we are able to make changes to the code
	 in the robot class or the IWorkable Interface without affecting the other classes within
	 this program. Also, the pre-existing code allowed us to extend the functionality of the by adding in a Robot
	 class consistent with the open close principle.
	-Single Responsibility: To be consistent with the single responsiblity principle
	 we want the Robot class to only handle the functionality of the Robot, thus it does not require the
	 function eat () as with the other workers.
	-Interface Segregation: This class implements the IWorkable interface which is used to compose the IWorker interface.
	 Initially the IWorkable didn't exist but in keeping with the interface segregation principle, since a Robot doesn't
	 need to eat, it is not a good practice to have it implement an interface in which a function is not used. This indicates
	 That we can further break down the IWorker interface, which is what was done with IWorkable and IFeedable.

*/

class Robot implements IWorkable{
	public void work() {
		//.... working much much more
	}
}