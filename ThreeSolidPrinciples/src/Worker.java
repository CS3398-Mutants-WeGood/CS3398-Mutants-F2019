/*  Name: Rick Rodriguez (grr58)
    Three SOLID Principles:

    1.  The Open Close Principle: This class adheres to the Open Close Principle
    by being separate from other similar classes (such as SuperWorker).  When set up this way,
    the class Worker's behavior can be extended without having to
    modify other classes, which are closed for modification.

    2.  The Single Responsibility Principle: This class adheres to the Single Repsonsibility
    Principle by only including methods and code that are relevant to the Worker class
    and does not include extraneous data or methods, such as employee name or methods that are
    only relevant to the Manager class that a member of the Worker class would not need.

    3.  The Interface Segregation Principle: By implementing two separate interfaces
    (IWorkable and IReadable), this class adheres to the Interface Segregation Principle.
    Although this class uses both interfaces, other classes (Robot) do not use both methods
    included in these two interfaces.  By separating the methods into their own interfaces,
    we eliminate fat interfaces that offer useless methods to other classes whem implemented.


 */

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

public class Worker implements IWorkable, IFeedable{
    public void work() {
        //.... working
    }

    public void eat() {
        //.... eating in launch break
    }
}
