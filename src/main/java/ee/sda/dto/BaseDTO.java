package ee.sda.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDTO {

    private boolean status = true;
    private String message = "Operation successful";
}
