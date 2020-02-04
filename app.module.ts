import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';

import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';


import { MyserviceService } from './myservice.service';
import { NewCmpComponent } from './new-cmp/new-cmp.component';
import { SqrtPipe } from './sqrt.pipe';
import { New123Directive } from './new123.directive';

@NgModule({
   declarations: [
      SqrtPipe,
      AppComponent,
      NewCmpComponent,
      New123Directive,
   ],
   imports: [
      BrowserModule,
      HttpModule,
      FormsModule,
      RouterModule.forRoot([
         {path: 'new-cmp',component: NewCmpComponent}
      ])
   ],
   providers: [MyserviceService],
   bootstrap: [AppComponent]
})

export class AppModule { }

