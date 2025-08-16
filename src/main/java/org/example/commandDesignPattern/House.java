package org.example.commandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class House {
  List<Room> rooms;

  public House () {
    rooms = new ArrayList<Room>();
  }
  public  House (List<Room> rooms) {
    this.rooms = rooms;
  }

  public void addRoom(Room room) {
    rooms.add(room);
  }
}
