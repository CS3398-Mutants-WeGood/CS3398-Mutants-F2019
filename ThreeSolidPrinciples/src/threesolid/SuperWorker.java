package threesolid;
/*
* Name: Benjamin Hunter Anderson
* Date: 9/12/19
*
* Open Close Principle: This class implements this principle by being open for extension as new super workers are added
*							but stays closed for modification to the interface.
*
* Single Responsibility Principle: This class implements the single responsibility principle by leaving open its functions
*									for extension that may change depending on the worker.
*
* Interface Segregation Principle: This class implements the interface segregation principle, by starting off with a thin,
* 									 skeleton like class as to not add needless functionality and allows the specific classes to build on it.
* */
import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class SuperWorker implements IWorkable, IFeedable{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}