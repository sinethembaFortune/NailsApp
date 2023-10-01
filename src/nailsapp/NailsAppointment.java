package nailsapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Random;

public class NailsAppointment {

    private String name;
    private String surname;
    private String nailsColor;
    private int size;
    private String design;
    private String type;
    private String date;
    private String time;
    private Double price;
    private int appointmentId;

    public NailsAppointment() {
    }

    public NailsAppointment(String name, String surname, String nailsColor, int size, String design, String type, String date, String time) {
        this.name = name;
        this.surname = surname;
        this.nailsColor = nailsColor;
        this.size = size;
        this.design = design;
        this.type = type;
        this.date = date;
        this.time = time;
        generateAppointmentId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNailsColor() {
        return nailsColor;
    }

    public void setNailsColor(String nailsColor) {
        this.nailsColor = nailsColor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public boolean chechSize() {
        boolean gflag = false;
        if (size > 0 && size < 50) {

            gflag = true;
        }
        return gflag;
    }

    public Double determinePrice() {
        if (design.equalsIgnoreCase("Simple/Plain design R150")) {
            price = 150.0;
        } else if (design.equalsIgnoreCase("Glitter design R250")) {
            price = 250.0;
        } else if (design.equalsIgnoreCase("Drawin designed R300")) {
            price = 300.0;
        }
        return price;
    }

    public void generateAppointmentId() {
        Random random = new Random();
        int max = 9999, min = 1000;
        appointmentId = random.nextInt(max - min) + min;
    }

    public LocalDateTime currentTime() {
        LocalDateTime dateT = LocalDateTime.now();
        return dateT;
    }

    public String concatingDisplay() {
        return "Client Full Names: " + name + " " + surname + "\n"
                + "AppointmentId: " + appointmentId + "\n"
                + "Color of Nails: " + nailsColor + "\n"
                + "Size/Lenght: " + size + "\n"
                + "Chosen design: " + design + "\n"
                + "type of Nails: " + type + "\n"
                + "Date and time of appointment: " + date + " " + time + "\n"
                + "Date Appointment Made: " + currentTime().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "\n"
                + "Price: R" + determinePrice() + "\n\n";
    }
}
