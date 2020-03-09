package OOP.Interface;

public interface interface_Parent {

/*
      Interface vs Abstract

                    interface                                                               Abstract
             A Class can implement multiple interfaces	                            The class can inherit only one Abstract Class

      Use of Access modifiers
            You cannot use access modifiers for the method, properties, etc.      	You can use an abstract class which contains access modifiers.

      Constructor or destructors
            An interface cannot declare constructors or destructors.	            An abstract class can declare constructors and destructors.

       Interfaces never contain instance variables but,                             Abstract can contain instance and public static final variables
               they can contain public static final variables

 */

        public int sum(int i1 , int i2);

        int num1 = 10;

/*
Can we declare abstract methods as private? Justify your answer?

        No. Abstract methods can not be private. If abstract methods are allowed to be private, then they will not be inherited to sub class and will not get enhanced.

Why final and abstract can not be used at a time?
        Because, final and abstract are totally opposite in nature.
        A final class or method can not be modified further where as abstract class or method must be modified further.
        “final” keyword is used to denote that a class or method does not need further improvements.
        “abstract” keyword is used to denote that a class or method needs further improvements

*/


}


