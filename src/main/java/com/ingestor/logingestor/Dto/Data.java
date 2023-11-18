package com.ingestor.logingestor.Dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.type.classreading.MetadataReader;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "login")
public class Data {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
@Id
private String traceId;


    private String level;
    private String message;
    private String resourceId;
    private String timestamp;



    private String spanId;
    private String commit;
//
@Embedded
private Metadata metadata;

    @Getter
    @Setter
    @NoArgsConstructor
    @Embeddable
    public static class Metadata {
        private String parentResourceId;
    }
}

//@Getter
//@Setter
//@NoArgsConstructor
//@Entity
//@Table(name = "login")
//public class Data {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String level;
//    private String message;
//    private String resourceId;
//                  private String timestamp;
//    private String traceId;
//    private String spanId;
//    private String commit;
//
//}
