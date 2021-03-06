import { TripCalendar } from './trip-calendar';
import { AdventureCalendar } from './adventure-calendar';
import { UserProfile } from './user-profile';
import { Address } from './address';


export class Adventure {
  id: number;
  title: string;
  description: string;
  activityLvl: string;
  includes: string;
  price: number;
  enabled: boolean;
  itinerary: string;
  address: Address;
  host: UserProfile;
  adventureCalendar: AdventureCalendar;

  constructor(
  id?: number,
  title?: string,
  description?: string,
  activityLvl?: string,
  includes?: string,
  price?: number,
  enabled?: boolean,
  itinerary?: string,
  address?: Address,
  host?: UserProfile,
  adventureCalendar?: AdventureCalendar

  ) {
  this.id = id,
  this.title = title;
  this.description = description,
  this.activityLvl = activityLvl,
  this.includes = includes,
  this.price = price,
  this.enabled = enabled,
  this.itinerary = itinerary,
  this.address = address,
  this.host = host;
  this.adventureCalendar = adventureCalendar;

  }
}
