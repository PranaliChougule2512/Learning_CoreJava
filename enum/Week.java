enum Day{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
public class Week{
    public static void main(String[] args) {
        Day today=Day.MONDAY;
        switch (today) {
            case MONDAY:
                System.out.println("Start of week");
                break;
            case TUESDAY:
                System.out.println("Second day");
                break;
            case WEDNESDAY:
                System.out.println("Mid week");
                break;
            case THURSDAY:
                System.out.println("Mid week");
                break;
            case FRIDAY:
                System.out.println("End of week");
                break;
            case SATURDAY:
                System.out.println("Weekend");
                break;
            case SUNDAY:
                System.out.println("Weekend");
                break;
                default:
                System.out.println("wrong input");
                break;
        }
    }
}