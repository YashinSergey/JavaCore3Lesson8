package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// id entityId parentId
// 1    1        0
// 2    2        0
// 3    3        1
// 4    4        3
// 5    5        4
// 6    6        0

public class MainSearch {
    public static void main(String[] args) {
        List<Human> humans= new ArrayList<Human>();
        humans.add(new Human(1,1,0,"firstHuman"));
        humans.add(new Human(2,2,0,"secondHuman"));
        humans.add(new Human(3,3,1,"thirdHuman"));
        humans.add(new Human(4,4,3,"fourthHuman"));
        humans.add(new Human(5,5,4,"fifthHuman"));
        humans.add(new Human(6,6,0,"sixthHuman"));

//        Node node1 = new Node(new Human(1,1,0,"firstHuman"), null);
//        Node node2 = new Node(new Human(2,2,0,"secondHuman"), node1);
//        Node node3 = new Node(new Human(3,3,1,"thirdHuman"), node2);
//        Node node4 = new Node(new Human(4,4,3,"fourthHuman"),node3);
//        Node node5 = new Node(new Human(5,5,4,"fifthHuman"), node4);
//        Node node6 = new Node(new Human(6,6,0,"sixthHuman"), node5);


        for (Human o : humans) {
            for (Human h : humans) {
                if (!h.isVisited) {
                    if (h.parentId == 0) {
                        h.addToChildren(h, null);
                        h.isVisited = true;
                    }
                    if (h.parentId == o.entityId){
                        h.addToChildren(h, o);
                        h.isVisited = true;
                    }
                }
            }
        }
    }
}
