# Classes-Tutorial
The program is a tutorial on making classes with IntelliJ. The tutorial covers parameterized and default constructors, the toString method, and creating object of a class.


-- Add private integer fields to the Box class. Inside the class block (in between the braces), type the following code:

private int wide; // horizontal dimension
private int high; // vertical dimension
private int thick; // depth dimension

-- Add a parameterized constructor to the Box class using this as a starting point:

public Box(int w, int h, int t) {
// ...
}

-- Assign w to wide, h to high, and t to thick in the parameterized constructor.Add the following method to class Box:

public String toString() {
// Create a String with the fields wide, high, and thick.
// The String is formatted as "WxHxT" with the letters
// W, H, and T replaced by the fields.
// Return the String created above.
}

-- Switch the current file to Main.java by clicking on the Main.java tab or opening the file in
the Project. Create a Box with width, height and thickness all 1 in the main method. The reference
variable will be called unitBox. It will be assigned to a new Box with the number 1 sent
as all three of the constructor’s parameters. See the example below:

// Reference variable
Box unitBox;
// New Box with constructor
unitBox = new Box(1,1,1);

-- Print the reference variable, run the program, and observe the results.

-- Switch the current file to Box.java and add a default constructor. This type of constructor
has no parameters. In the default constructor, set all three fields to 1.

-- Change the unitBox reference variable to use the default constructor instead, run the
program again, and observe the same results.

-- Switch the current file to Box.java and change the default constructor to use the this
keyword in calling the parameterized constructor as shown below:

// Call the parameterized constructor with the value 1.
this(1,1,1);

-- Run the program once more and observe the same results
