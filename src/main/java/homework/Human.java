package homework;

// id entityId parentId
// 1    1        0
// 2    2        0
// 3    3        1
// 4    4        3
// 5    5        4
// 6    6        0

import java.util.ArrayList;
import java.util.List;

public class Human {
    int id;
    int entityId;
    int parentId;
    String name;
    boolean isVisited = false;
    List<Human> children = new ArrayList<Human>();


    public Human(int id, int entityId, int parentId, String name) {
        this.id = id;
        this.entityId = entityId;
        this.parentId = parentId;
        this.name = name;
    }

    public void addToChildren(Human human, Human previous){
        children.add(human);
        System.out.println(human.name);
    }

}
