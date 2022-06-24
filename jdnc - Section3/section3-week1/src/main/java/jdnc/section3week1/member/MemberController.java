package jdnc.section3week1.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/members")
@Validated
public class MemberController {
    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberPostDto){

        return new ResponseEntity<>(memberPostDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Min(1) long memberId,
                                     @Valid @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        memberPatchDto.setName("홍길동");
        return new ResponseEntity<>(memberPatchDto, HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id")long memberId){
        System.out.println("# memberId = " + memberId);

        return new ResponseEntity<Map>(HttpStatus.OK);
    }

    @GetMapping
    public  ResponseEntity getMembers(){
        System.out.println("# get Members");

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id")long memberId){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
