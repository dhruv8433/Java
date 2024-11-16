enum Status {
    PENDING, APPROVED, REJECTED
}

public class EnumsJava {
    public static void main(String[] args) {
        Status s = Status.PENDING;
        System.out.println(s); // print status : PENDING

        // we can also get status from numbers with method ordinal()
        System.out.println(Status.APPROVED.ordinal()); // 1
        System.out.println(s.ordinal()); // 0 -- status of pending

        Status[] all = Status.values();

        // enhanced for loop
        for (Status status : all) {
            System.out.println(status.ordinal() + ": " + status); // print all status
        }

        // else if
        if (s == Status.PENDING) {
            System.out.println("Pending");
        } else if (s == Status.APPROVED) {
            System.out.println("Approved");
        } else {
            System.out.println("Rejected");
        }

        // switch case
        switch (s) {
            case PENDING:
                System.out.println("Pending");
                break;
            case APPROVED:
                System.out.println("Approved");
                break;
            case REJECTED:
                System.out.println("Rejected");
                break;
        }

        System.out.println(s.getClass().getSuperclass());  // print java.lang.Enum it have many methods
    }
}
