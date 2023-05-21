I was given a technical question study guide and I created an app out of it to study.
Here are my answers to the interview questions I created for myself based on a Skillstorm study guide that I was 
provided.

Encapsulation is one of the four pillars of object-oriented programming. In Java, encapsulation is achieved through 
Classes, which are units that can store both data (primitive and non-primitive) as well as methods, in a single unit 
called a Class. An example of encapsulation is if you create a class called User with a String variable fullName, 
and a method such as sayName() that prints the user's fullName. The fact that we stored data (the String) and 
functionality (the method) in a single unit (the User class) is an example of Java encapsulating data and functionality.

Inheritance is another one of the four pillars of object-oriented programming. In Java, inheritance refers to when one 
or more classes inherit data and methods from another class. When this happens, the class or classes that inherit data 
and methods, are called 'child' classes, and the class that shares its data and methods, is called the 'parent' class. 
An example of inheritance can be seen between the Object class and the String class in Java. All objects in Java inherit 
from the Object class, and because of this they gain access to the Object's class methods like equals() or 
toString(). Therefore, since the String class inherits from the Object class (just like all other classes), it has 
access to these methods. String s = "ABC"; s.toString(); s.equals("ABC");

Abstraction is another one of the four pillars of object-oriented programming. In Java, abstraction refers to limiting 
the exposure of implemented logic and available data by localizing it to various classes and hiding away these classes. 
As a result of abstraction, you only see the data and methods that you are using, and not ALL the data and methods that
are available to you. When you import a library into your application, you will not see every class that is defined 
in that library. You will only see a simple import statement. But even so, you will still have access to each and every 
class in that library. This is because abstraction is hiding away the implemented classes to avoid displaying a massive 
amount of information where you import the library. Without abstraction, development would be very messy and hard to 
navigate because there would be way too much code everywhere.

Polymorphism is the ability of code to take many forms. There are two types of polymorphism in Java: 
compile time polymorphism AKA static polymorphism 
and 
runtime polymorphism AKA dynamic polymorphism.
Static polymorphism is achieved through method overloading and runtime polymorphism is achieved through method 
overriding. 
Method overloading is when many methods of the same name exist but each one accepts different arguments 
for their parameters. 
Method overriding is when a parent class has a method that a child class inherits, but the developer wants to implement 
the logic for the method differently in the child class rather than use the implementation of the method from the parent 
class. 
Why would you want this? Let's say the method does almost exactly the same thing (takes the same parameters, and returns 
the same data type or a covariant* of it) in the child class as it does in the parent class but needs a small change 
that you don't want the parent class method to do, but that you do need the child class to do. Instead of writing a 
brand-new method, we can re-use the parent class method code in the child class but tweak it to our needs through method 
overriding.
covariant* ... refers to a subclass of the data type, e.g. ArrayList is a covariant of Object.
         * ... covariance is a feature of Java 5 onward. Before Java 5, return types had to be exactly the same class, 
               i.e. non-variant. FYI, 'parameter covariance' is taken care of by method overloading.

Your typical basic SQL query is a SELECT statement. These are one of, if not the most common SQL query that you will 
use. SELECT statements will return data from an SQL database matching the conditions in the SELECT statement, if such 
data exists in the database. The syntax for a SELECT statement is as follows:

SELECT <column> FROM <table>;

If your SQL query tool has not specified the database you are using already, before a SELECT statement you will need to
specify this with the following syntax before the SELECT statement:

USE <database>;
SELECT <column1, column2, ... etc> FROM <table>;

Another fundamental SQL query is the INSERT statement. These allow you to add data to a database.
Another fundamental SQL query other than these is the UPDATE statement. These allow you to update data in a database.
Another fundamental SQL query other than these is the DELETE statement. These allow you to delete data in a database.

Examples of more advanced SQL queries are SQL joins. These take a SELECT statement and join the returned data with data
from another table based on the correlation of a specified field from each table.

Primary keys refer to the columns in tables that uniquely identify each row of data from others. For example, in a 
database with people, the first row could have the Primary Key value of 1, and the fullName value of John Smith.
The second row could then have the Primary Key value of 2, and the fullName value of Sam Smith. Like this, no two rows
should ever have the same Primary key. Primary Keys are typically auto-generated when data is added to a table upon
its creation or after the fact. The auto-generation is specified in the schema of the table, which is a representation
of the structure of the table such as what data types are required for each column, and if there are any primary or 
foreign keys in the table. Although you can create an SQL table without a primary key, it is highly advised to always
have a primary key for each table.

Foreign keys are when you have at least two tables, and the column of one table corresponds to the primary key of 
another. The column that corresponds to the primary key of another table, is called a foreign key in that table. The
foreign key of that table, is the primary key of the other table. You can have multiple tables with foreign keys 
corresponding to a single other table's primary key.
