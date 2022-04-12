package com.company.processor.impl;
import com.company.model.Travel;
import com.company.model.TravelType;

public interface i_TravelManager  {
    void addTravelToTheList(Travel travel);


     void deleteTravelFromList(Travel travel);
     void sortListByPrice();
     void sortListByDuration();
     void  printListOfTravel();
     void findTravelByType(TravelType travelType);
}
