package jdnc.section3week1.member;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

public class MemberPostDto {
        @NotBlank
    @Email
    private String email;

    @NotBlank(message="name error")
    private String name;

    @Pattern(regexp="^010-\\d{3,4}-\\d{4}$",
            message = "phone error")
    private String phone;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
