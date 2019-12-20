import { Address } from './address';
import { User } from './user';
import { Vehicle } from './vehicle';
import { UserProfile } from './user-profile';

export class Trip {
  id: number;
  host: UserProfile;
  departureAddress: Address ;
  destinationAddress: Address ;
  description: string;
  seatsAvailable: number;
  cargoCapacity: number;
  createDate: Date;
  enabled: boolean;
  totalCost: number;
  miles: number;
  vehicle: Vehicle;
  title: string;


  // tslint:disable-next-line: max-line-length
  constructor(host?: UserProfile, departureAddress?: Address, destinationAddress?: Address, description?: string, seatsAvailable?: number, cargoCapactiy?: number, createDate?: Date, enabled?: boolean, totalCost?: number, miles?: number, vehicle?: Vehicle, title?: string) {
    this.host = host;
    this.departureAddress = departureAddress;
    this.destinationAddress = destinationAddress;
    this.description = description;
    this.seatsAvailable = seatsAvailable;
    this.cargoCapacity = cargoCapactiy;
    this.createDate = createDate;
    this.enabled = enabled;
    this.totalCost = totalCost;
    this.miles = miles;
    this.vehicle = vehicle;
    this.title = title;
  }
}
