/**
If we have to use any static variable or method from
other class, usually we import the class and then
use the method/variable with class name.

We can do the same thing by importing the static method
or variable only and then use it in the class as if it
belongs to it.
*/

package StaticImport;
import static java.lang.Math.PI;
// without static would be:
//import java.lang.Math;

public class StaticImport
{
    double thePi = PI;
//  without static would be:
//  double test = Math.PI * 5;
}
