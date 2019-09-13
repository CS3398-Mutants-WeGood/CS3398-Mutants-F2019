//  Author Luis
package threesolid;

//  The Interface Segregation principle was used with our toned down more specific interfaces
//  these smaller interfaces stop cases of implementing useless methods for each class.

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

interface IWorker extends IFeedable, IWorkable{
	public void work();
	public void eat();
} 
