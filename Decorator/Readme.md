<h2>The Decorator Design Pattern</h2>
It is a pattern that adds extra responsibilities to a class dynamically.
<br><strong>Dynamically</strong> means adding more responsibilities to a class without changing the content
or the code of that class.
<br>
This could be useful and a protection from the problem of class explosion (nesting many classes representing each
possible combination of responsibilities.
<br>
<h3> The problem </h3>
How to add dynamically more actions or properties on a class without violating the
open/closed design principle (open for extension closed for modification) and the single responsibility principle as
well.

<h3>The Solution</h3>
Starting from the class that we want to add more responsibilities to it,
We are going to wrap it inside a <strong>wrapper</strong> and this wrapper will do that extra action on the output of
the base class.
This wrapper also could be wrapped inside another wrapper to add more and more responsibilities.

<img src = "https://imgur.com/LznGyxF.jpg" />

Here in the image the base class is Degree one, and each layer contributes in the output with it's action or effect.

<h3> UML Diagram </h3>

<img src="https://www.researchgate.net/publication/258568562/figure/fig17/AS:669479990218775@1536627876993/4-UML-Class-diagram-of-the-structure-of-the-Decorator-pattern.ppm" />

<ol> 
    <li>
        Component is an interface/Abstract class that has operation each of his children have their own implementation of it.
    </li>
    <li>
        Concrete Component is a base class with the implementation of it's own operation
        that represents a single responsibility of that class.
    </li>
    <li>
        Decorator is an Abstract/Interface that represents the addOns resposinilities that could be added.
        <ul>
            <li>It <strong>hasA</strong> Component, because it will contribute it's effect on the operation output of the component.</li>
            <li>It <strong>isA</strong> Component, because we would like to treat it as if it is a component and create it as a component.</li>
        </ul>
    </li>
    <li>
        Concrete Decorator is an implementation of the extra or addOn behavior on the basic behavior of the core component.
    </li>
</ol>

<h3> Alternatives? </h3>
<p>
    Why don't we use some if conditions for adding some behaviors?
    <br>
    Adding if condition will be most likely require adding more conditions in the future and consequently 
changing the code of the component class and this won't be adding more responsibilities dynamically.
</p>

<p>
    Why don't we use inheritance and make different combinations using inheritance and each class will have exactly one responsibility?
    <br>
    Although this approach will be good for the Single responsibility design principle. However, this may lead to 
<strong>class explosion</strong> specially when having many addOns and you can have any combination of them.
</p>

<h3>Conclusion</h3>
Decorator pattern will best suit in scenarios in which you would like to dynamically
add many different behaviors (or changing the output of your class differently multiple times ) and thess addedBehaviors
are having a significant change from each others.
