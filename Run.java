package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SamsungHead samsungHead = new SamsungHead(45);
        SamsungHand samsungHand = new SamsungHand(14);
        SamsungLeg samsungLeg = new SamsungLeg(17);

        SonyHead sonyHead = new SonyHead(49);
        SonyHand sonyHand = new SonyHand(11);
        SonyLeg sonyLeg = new SonyLeg(14);

        ToshibaHead toshibaHead = new ToshibaHead(54);
        ToshibaHand toshibaHand = new ToshibaHand(9);
        ToshibaLeg toshibaLeg = new ToshibaLeg(12);

        Robot robot1 = new Robot(sonyHead, samsungHand, toshibaLeg);
        robot1.action();
        System.out.println(robot1.getPrice());

        Robot robot2 = new Robot(samsungHead,toshibaHand, sonyLeg);
        robot2.action();
        System.out.println(robot2.getPrice());

        Robot robot3 = new Robot(toshibaHead, sonyHand, samsungLeg);
        robot3.action();
        System.out.println(robot3.getPrice());

        if (robot1.getPrice() > robot2.getPrice() && robot1.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот 1");
        } else
            if (robot2.getPrice() > robot1.getPrice() && robot2.getPrice() > robot3.getPrice()) {
            System.out.println("Самый дорогой робот 2");
            } else
                System.out.println("Самый дорогой робот 3");


    }
}
