package example_3;

import java.time.LocalDateTime;

public class Bus {

    public String name;
    public int speed;
    public LocalDateTime dateBusCreated = LocalDateTime.now();
    public Person person;

    public Bus(String name, int speed,  Person person) {
        this.name = name;
        this.speed = speed;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", dateBusCreated=" + dateBusCreated +
                ", person=" + person +
                '}';
    }
}

