import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { UserProfile } from './../models/user-profile';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class UserProfileService {

  // F I E L D S

  private baseUrl = 'http://localhost:8090/';
  private url = this.baseUrl + 'api/userProfiles';

  userProfiles: UserProfile[] = [];

  // C O N S T R U C T O R

  constructor(private http: HttpClient, private authService: AuthService, private router: Router) { }

  // M E T H O D S

  index() {
    if (this.authService.checkLogin()) {
      return null;
    }

    // Make credentials
    const credentials = this.authService.getCredentials();
    // Send credentials as Authorization header (this is spring security convention for basic auth)
    const httpOptions = {
      headers: new HttpHeaders({
        Authorization: `Basic ${credentials}`,
        'X-Requested-With': 'XMLHttpRequest'
      })
    };
    // this.checkLogin();
    return this.http.get<UserProfile[]>(this.url + '?sorted=true', httpOptions)
      .pipe(
        catchError((err: any) => {
          console.log(err);
          return throwError('KABOOM');
        })
      );
  }

  checkLogin(): boolean {
    if (this.authService.getCredentials() === null) {
      this.router.navigateByUrl('login');
      return false;
    } else {
      this.router.navigateByUrl('userProfiles');
      return true;
    }
  }

  create(newUserProfile: UserProfile) {

    const credentials = this.authService.getCredentials();
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        Authorization: `Basic ${credentials}`,
        'X-Requested-With': 'XMLHttpRequest'
      })
    };

    return this.http.post<UserProfile>(this.url, newUserProfile, httpOptions)
      .pipe(
        catchError((err: any) => {
          console.log(err);
          return throwError('Could not add User Profile');
        })
      );
  }

  updateUserProfile(userProfile: UserProfile) {
    const credentials = this.authService.getCredentials();
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        Authorization: `Basic ${credentials}`,
        'X-Requested-With': 'XMLHttpRequest'
      })
    };

    return this.http.put(this.url + '/' + userProfile.id, userProfile, httpOptions)
      .pipe(
        catchError((err: any) => {
          console.log(err);
          return throwError('Could not update User Profile');
        })
      );
  }

  delete(id: number) {
    const credentials = this.authService.getCredentials();
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        Authorization: `Basic ${credentials}`,
        'X-Requested-With': 'XMLHttpRequest'
      })
    };

    return this.http.delete(this.url + '/' + id, httpOptions)
      .pipe(
        catchError((err: any) => {
          console.log(err);
          return throwError('Could not delete User Profile');
        })
      );

  }
}