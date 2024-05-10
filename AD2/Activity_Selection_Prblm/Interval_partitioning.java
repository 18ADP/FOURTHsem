package AD2.Activity_Selection_Prblm;

//Write a java code to implement Interval Partitioning using greedy method.

import java.util.*;

class Lecture {
    int start, end;
    String time;

    public Lecture(int start, int end) {
        this.start = start;
        this.end = end;
        this.time = getTimeFromInt(start) + "-" + getTimeFromInt(end);
    }

    public String getTimeFromInt(int time) {
        if (time < 1000) {
            return "0" + time;
        } else if (time < 100) {
            return "0" + time;
        } else {
            return String.valueOf(time);
        }
    }
}

public class Interval_partitioning {
    public static void main(String[] args) {
        List<Lecture> lectures = new ArrayList<>();
        lectures.add(new Lecture(900, 1030));
        lectures.add(new Lecture(1000, 1200));
        lectures.add(new Lecture(1230, 1320));
        lectures.add(new Lecture(1400, 1500));
        lectures.add(new Lecture(1430, 1520));
        lectures.add(new Lecture(1600, 1700));

        List<List<Lecture>> rooms = intervalPartitioning(lectures);

        System.out.println("Number of rooms required: " + rooms.size());
        System.out.println("\nRooms and their schedules:");
        int roomNumber = 1;
        for (List<Lecture> room : rooms) {
            System.out.println("\nRoom " + roomNumber++ + ":");
            for (Lecture lecture : room) {
                System.out.println(lecture.time);
            }
        }

        System.out.println("\nOutput written to output.txt");
    }

    public static List<List<Lecture>> intervalPartitioning(List<Lecture> lectures) {
        List<List<Lecture>> rooms = new ArrayList<>();
        Collections.sort(lectures, (l1, l2) -> Integer.compare(l1.start, l2.start));

        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < lectures.size(); i++) {
            count.add(1);
        }

        int currentRoom = 0;
        for (int i = 1; i < lectures.size(); i++) {
            if (lectures.get(i).start >= lectures.get(currentRoom).end) {
                count.set(currentRoom, count.get(currentRoom) + 1);
            } else {
                currentRoom = i;
                count.set(currentRoom, count.get(currentRoom) + 1);
            }
        }

        for (int i = 0; i < count.size(); i++) {
            rooms.add(new ArrayList<>());
        }

        for (int i = 0; i < lectures.size(); i++) {
            rooms.get(count.get(i) - 1).add(lectures.get(i));
        }

        return rooms;
    }
}
/*Output:
 Number of rooms required: 6

Rooms and their schedules:

Room 1:
0900-1030
1230-1320
1400-1500
1430-1520
1600-1700

Room 2:

Room 3:

Room 4:

Room 5:

Room 6:
1000-1200
 */
