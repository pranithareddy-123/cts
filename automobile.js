
class Car{
    constructor (name) {
        this.name = name;
      }
      run(){
          console.log("this is name");
      }
     }
    class Maruthi extends Car {
     
      constructor (speed) {
        super();
        this.speed=speed
      }
      run()
      {
          super.run();
          console.log("speed="+this.speed);
      }
     
    }
    class Maruthisuzuki extends Car {
     
        constructor (color) {
          super();
          this.color=color
        }
        run()
        {
            super.run();
            console.log("color="+this.color);
        }
       
      }
    var speed=new Maruthi(54)
    speed.run();
    var color=new Maruthisuzuki("red")
    color.run();
    