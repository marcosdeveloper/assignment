# assignment
Assignment Currency Converter
My approach to fit it was using a Design Pattern called Command which one I had previous experience at BrasilPrev 
(my last Brazilian project), due to the scenario with many classes with the same behavior and needed checking for them.
Using it you can note about the saving and cleaning codes. The idea is: all currency conversions have a specific calculus, 
so, we can centralize a method responsible for the calculus in a common object for all the currency conversions (interface). 
For each kind of conversion, we can create classes that be inherited by this interface and modify only their intern logics.
We can put all of these classes in a structure (List) and so to each menu option and amount desired to convert we invoke the 
correct class and method. In this way, we can eliminate unnecessary "ifs" and keep high cohesion and low coupling as well.
For the scenario, I used 20 currency conversions.
