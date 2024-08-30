package Model;

public class Appointment {

    private String appointmentDate;
    private String appointmentReason;
    private boolean isTreated;
    private User vet;

    public Appointment(String appointmentDate, String appointmentReason, boolean isTreated, User vet) {
        this.appointmentDate = appointmentDate;
        this.appointmentReason = appointmentReason;
        this.vet = vet;
        this.isTreated = isTreated;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentReason() {
        return appointmentReason;
    }

    public boolean isIsTreated() {
        return isTreated;
    }

    public User getVet() {
        return vet;
    }

    public void setIsTreated(boolean isTreated) {
        this.isTreated = isTreated;
    }

    @Override
    public String toString() {
        return "\nData: " + this.appointmentDate + "\nMotivo: " + this.appointmentReason + "\nFoi tratado: " + this.isTreated + "\nVeterinario: " + this.vet.getName() + "\nUsername Veterinario: " + this.vet.getUsername();
    }
}
