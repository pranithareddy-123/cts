import { Component } from '@angular/core';
import { MyserviceService } from './myservice.service';
import {Http} from '@angular/http'
import 'rxjs/add/operator/map';

@Component({
   selector: 'app-root',
   templateUrl: './app.component.html',
   styleUrls: ['./app.component.css']
})

export class AppComponent {
   title = 'Angular 4 Project!';
   searchparam=2;
   jsondata;
   name;
   todaydate;
   months = ["January", "February", "March", "April",
   "May", "June", "July", "August", "September",
   "October", "November", "December"];
isavailable = true;
myClickFunction(event){
  alert("button is clicked");
  console.log(event);
}
changemonths(event){
  alert("changed month from the dropdown");
}
   constructor(private http: Http) { }
   ngOnInit() {
      this.http.get("http://jsonplaceholder.typicode.com/users?id="+this.searchparam).
      map((Response)=> Response.json()).
      subscribe((data) => this.converttoarray(data))
   }
   converttoarray(data){
     console.log(data);
     this.name=data[0].name;
   }
   /*constructor(private myservice: MyserviceService) {}
   ngOnInit() {
      this.todaydate = this.myservice.showTodayDate();
   }*/
   onClickSubmit(data) {
      alert("Entered Email id : " + data.emailid);
   }
}