import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return 12 <= appointmentDate.getHour() && appointmentDate.getHour() <18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy,");
        DateTimeFormatter TimeFormatter = DateTimeFormatter.ofPattern("h:mm a.");
        return "You have an appointment on " + DateFormatter.format(appointmentDate) + " at " + TimeFormatter.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(2023, 9,15);
    }
}