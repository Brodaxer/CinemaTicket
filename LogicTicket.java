public class LogicTicket {
    public void  sprawdzTicket (CinemaMenu moveie,Person person,Ticket id){
        if(moveie.getFreeSeats()==0){
            System.out.println("Brak wolnych miejsc na seans");
        } else if (person.getAge()<moveie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + moveie.getAgeRequired() + " lat");
        }else {
            id.setTicketId(moveie.getMaxSeats()- moveie.getFreeSeats()+1);
            id.setTicketPersonData(person.getFirstname()+ " "+person.getLastName());
            id.setTicketMovieTitle("Omen");
            moveie.setFreeSeats(moveie.getFreeSeats()-1);
        }
    }
    public void printInfo(Ticket ticket, CinemaMenu movie){
        System.out.println(ticket.getTicketId() + " | " + ticket.getTicketPersonData()+ " | "+ ticket.getTicketMovieTitle() +
                " | "+ movie.setMovieType() + " - "+ movie.getMovieTime()+"min");
        System.out.println("Wolne miejsca "+ movie.getFreeSeats());
        System.out.println("Sprzedane bilety "+(movie.getMaxSeats() - movie.getFreeSeats()));
    }
}
