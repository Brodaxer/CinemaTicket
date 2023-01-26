class CinemaSystem {

    public static void main(String[] args) {
        CinemaMenu film1 = new CinemaMenu("Omen", "horror",123,16,72,72);
        Person person1 = new Person("Kamil","Kowalski",16);
        Person person2 = new Person("Jan", "Dab", 22);
        //Ticket ticket1 = null;      niby tak mialem stworzyc ticket 
        Ticket ticket1 = new Ticket(null,null,"Omen");
        LogicTicket newticket = new LogicTicket();
        newticket.sprawdzTicket(film1,person1,ticket1);
        newticket.printInfo(ticket1,film1);

        newticket.sprawdzTicket(film1,person2,ticket1);

        newticket.printInfo(ticket1,film1);











//        String movieTitle = "Omen";
//        String movieType = "horror";
//        int movieTime = 128;
//        int ageRequired = 16;             CinemaMenu przeniesione
//        int maxSeats = 72;
//        int freeSeats = 72;

//        String firstName1 = "Jan";
//        String lastName1 = "Kowalski";        Person
//        int age1 = 15;

//        int ticket1Id = 0;
//        String ticket1PersonData = null;      Ticket
//        String ticket1MovieTitle = null;

//        if (freeSeats == 0) {
//            System.out.println("Brak wolnych miejsc na seans");
//        } else if (age1 < ageRequired) {
//            System.out.println("Film dostępny dla osób powyżej " + ageRequired + " lat");
//        } else {
//            ticket1Id = 1;
//            ticket1PersonData = firstName1 + " " + lastName1;
//            ticket1MovieTitle = "Omen";
//            freeSeats--;
//        }

//        String firstName2 = "Anna";
//        String lastName2 = "Zalewska";
//        int age2 = 19;
//        int ticket2Id = 0;
//        String ticket2PersonData = null;
//        String ticket2MovieTitle = null;
//        if (freeSeats == 0) {
//            System.out.println("Brak wolnych miejsc na seans");
//        } else if (age2 < ageRequired) {
//            System.out.println("Film dostępny dla osób powyżej " + ageRequired + " lat");
//        } else {
//            ticket2Id = ticket1Id + 1;
//            ticket2PersonData = firstName2 + " " + lastName2;
//            ticket2MovieTitle = "Omen";
//            freeSeats--;
//        }

//        System.out.println("Sprzedane bilety");
//        if (ticket1Id != 0) {
//            System.out.println(ticket1Id + " | " + ticket1PersonData + " | " + ticket1MovieTitle + " - " + movieType + " - " + movieTime + "min");
//        }
//        if (ticket2Id != 0) {
//            System.out.println(ticket2Id + " | " + ticket2PersonData + " | " + ticket2MovieTitle + " - " + movieType + " - " + movieTime + "min");
//        }
//
//        System.out.println("Liczba pozostałych miejsc: " + freeSeats);
//        System.out.println("Liczba sprzedanych biletów: " + (maxSeats - freeSeats));
    }
}