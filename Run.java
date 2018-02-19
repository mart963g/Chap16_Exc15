package Exc_15;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(13);
        list.add(15);
        LinkedIntList list2 = new LinkedIntList();
        list2.add(3);
        list2.add(7);
        list2.add(12);
        list2.add(13);
        list2.add(15);
       // list2.add(2);

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list.equals(list2));
    }
}
