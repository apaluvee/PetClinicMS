package ee.sda.dto;

public class BaseDTO {

    private boolean status = true;
    private String message = "Operation successful";

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
