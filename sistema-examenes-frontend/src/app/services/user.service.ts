import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import baserURL from './helper';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

  public añadirUsuario(user: any) {
    return this.httpClient.post(`${baserURL}/usuarios/`, user)
  }

}
