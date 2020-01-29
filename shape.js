
class Shape { 
   constructor(a) { 
      this.Area = a
   } 
} 
class Circle extends Shape { 
   circle(r) { 
       this.Area=3.14*r*r;
       
        
       
      console.log("Area of the circle:  "+this.Area) 
   } 
} 

class Rectangle extends Shape { 
   rectangle(l,b) { 
       this.Area=l*b;
       
      console.log("Area of the Rectangle:  "+this.Area) 
   } }

var obj = new Rectangle(); 
obj.rectangle(11,4) 
var obj = new Circle(); 
obj.circle(3) 
