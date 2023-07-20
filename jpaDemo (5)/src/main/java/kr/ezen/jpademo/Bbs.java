package kr.ezen.jpademo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Bbs {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;
    private String writer;

    private String content;
    private Long viewCnt;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date regDate;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date upDate;
}
