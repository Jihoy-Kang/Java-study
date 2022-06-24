package jdnc.section3week1.member;

import javax.validation.constraints.Pattern;

public class MemberPatchDto {
    private long memberId;


    private String email;

    @Pattern(regexp = "^(?=\\s*\\S).*$", message ="error")
    private String name;

    @Pattern(regexp = "^(?=\\s*\\S).*$", message = "전화 번호는 공백이 아니어야 합니다.")
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$",
            message ="error")
    private String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }
}
