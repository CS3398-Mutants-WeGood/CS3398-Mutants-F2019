/* Tyler Perkins
	-Open Close Principle: Separating the manager class allows it to be changed without affecting
		other parts of the program.
	-Single Responsibility: This class only handles the functionality for the manager.
	-Interface Segregation: While this class is not an interface, it is a part of the IWorker interface,
		which can be managed separately from any other interfaces. The IWorker interface only
		includes similar classes, allowing other classes to be handled easier with a different interface.
*/ 

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class Manager {
	IWorker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}