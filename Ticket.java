public class Ticket {
    private Integer ticketId;
    private String ticketPersonData;
    private String ticketMovieTitle;

    public Ticket (Integer ticketId, String ticketPersonData,String ticketMovieTitle){
        this.ticketId = ticketId;
        this.ticketPersonData = ticketPersonData;
        this.ticketMovieTitle = ticketMovieTitle;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketPersonData() {
        return ticketPersonData;
    }

    public void setTicketPersonData(String ticketPersonData) {
        this.ticketPersonData = ticketPersonData;
    }

    public String getTicketMovieTitle() {
        return ticketMovieTitle;
    }

    public void setTicketMovieTitle(String ticketMovieTitle) {
        this.ticketMovieTitle = ticketMovieTitle;
    }

}
