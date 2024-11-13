package tools;

public class PublicVariables {
    int marks = 10; // if we try to fetch this type of variable in another class then we have to create object of this class
    // and then we can access this variable 
    // NOTE: this variable is only visible in package folders files

    // if we want to make this variable visible in all the classes then we have to use public keyword
    public int marks1 = 10;

    private int _prvariable = 10; // this variable is only visible in this class, not in even same package folders or files
    
    protected int _protected = 10; // this variable is visible in the same package folders and files and also in the child class
}
// In Java, access specifiers are the keywords used before a class name which defines the access scope.

// The types of access specifiers in Java are:
// 1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
// 2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
// 3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
// 4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package, and outside the package.