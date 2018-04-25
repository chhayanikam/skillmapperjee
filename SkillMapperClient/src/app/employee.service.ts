//this is the correct Employee service file
import { Injectable } from '@angular/core';
import { Employee } from './Employee';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map, tap } from 'rxjs/operators';
import { Observable } from 'rxjs/Observable';
import { MesssageService} from './messsage.service'
import { of } from 'rxjs/observable/of';

// will be required only for  update,insert,delete
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class EmployeeService {
 // base url to rest api
 private empUrl="";
  constructor(private http: HttpClient) {
  
     }

  // create the log method
private log(message: string) {
// this.messageService.add('EmployeeService: ' + message);
}

/** GET heroes from the server */
getEmployees (): Observable<Employee[]> {
  return this.http.get<Employee[]>("http://localhost:8092/SkillMapperRestWeb/api/employee/")
   /* .pipe(
      tap(employees => this.log('fetched employees')),
      catchError(this.handleError('getEmployees', []))
    );*/
}

private handleError<T> (operation = 'operation', result?: T) {
  return (error: any): Observable<T> => {
    // TODO: send the error to remote logging infrastructure
    console.error(error); // log to console instead
    // TODO: better job of transforming error for user consumption
    this.log('${operation} failed: ${error.message}');
    // Let the app keep running by returning an empty result.
    return of(result as T);
  };
}

addEmployee (employee: Employee): Observable<Employee> {
  return this.http.post<Employee>("http://localhost:8092/SkillMapperRestWeb/api/employee/", employee, httpOptions).pipe(
    tap((employee: Employee) => this.log('added hero w/ id=${employee.employeeid}')),
    catchError(this.handleError<Employee>('addEmployee'))
  );
}

/** GET hero by id. Will 404 if id not found */
getEmployee(id: number): Observable<Employee> {
  const url = '${this.empUrl}/${id}';
  return this.http.get<Employee>(url).pipe(
    tap(_ => this.log(`fetched Employee id=${id}`)),
    catchError(this.handleError<Employee>('EMployee id=${id}'))
  );
}

/** PUT: update the hero on the server */
// tap will log the erroes multiple times
updateEmployee (employee: Employee): Observable<any> {
  return this.http.put("http://localhost:8092/SkillMapperRestWeb/api/employee/", employee, httpOptions).pipe(
    tap(_ => this.log('updated employee id=${employee.employeeId}')),
    catchError(this.handleError<any>('updateEmployee'))
  );
}
  deleteEmployee (employee: Employee | number): Observable<Employee> {
    const id = typeof employee === 'number'? employee: employee.employeeId;
    const url = '${http://localhost:8092/SkillMapperRestWeb/api/employee/}/${id}';
     return this.http.delete<Employee>(url, httpOptions).pipe(tap(_ => this.log('deleted hero id=${id}')),
      catchError(this.handleError<Employee>('deleteEmployee'))
    );
  }
}

