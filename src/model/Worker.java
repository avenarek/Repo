package model;

public class Worker extends Human {

    private boolean uniForm;

    public Worker(String fullName, int age, char gender, boolean uniForm) {
        super(fullName, age, gender);
        this.uniForm = uniForm;
    }

    public boolean isUniForm() {
        return uniForm;
    }

    public void setUniForm(boolean uniForm) {
        this.uniForm = uniForm;
    }
}
