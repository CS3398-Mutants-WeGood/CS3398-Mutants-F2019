package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

interface IWorker extends IFeedable, IWorkable{
	public void work();
	public void eat();
} 