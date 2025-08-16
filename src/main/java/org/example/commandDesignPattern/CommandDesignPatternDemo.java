package org.example.commandDesignPattern;

import org.example.commandDesignPattern.differentRooms.*;


public class CommandDesignPatternDemo {
  public static void show() {
    System.out.println("commandDesignPattern");
    House house = new House();
    Room bathroom = new Bathroom();
    bathroom.setCommand(new SwitchingLightCommand(new Light()));
    house.addRoom(bathroom);
    Room livingRoom = new LivingRoom();
    livingRoom.setCommand(new SwitchingLightCommand(new Light()));
    house.addRoom(livingRoom);
    Room bedroom = new BedRoom();
    bedroom.setCommand(new SwitchingLightCommand(new Light()));
    house.addRoom(bedroom);
    Room kitchen =  new Kitchen();
    kitchen.setCommand(new SwitchingLightCommand(new Light()));
    house.addRoom(kitchen);
    house.rooms.forEach(Room::executeCommand);
  }
}
