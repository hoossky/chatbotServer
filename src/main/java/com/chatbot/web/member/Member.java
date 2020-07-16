package com.chatbot.web.member;

import com.chatbot.web.volunteer.Volunteer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "member", uniqueConstraints = {@UniqueConstraint(columnNames = {"nickname"})})
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id") private Long id;
    @Column(name = "email", nullable = false) private String  email;
    @Column(name = "nickname", nullable = false) private String nickname;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password", nullable = false) private String password;
    @Column(name = "phone", nullable = false) private String phone;
    @Column(name = "name", nullable = false) private String name;
    @Column(name = "ssn", nullable = false) private String ssn;
    @Column(name = "gender", nullable = false) private String gender;
    @CreationTimestamp
    @Column(name = "join_date", nullable = false) private LocalDateTime joinDate;
    @Column(name = "join_way", nullable = false) private String joinWay;
    @CreationTimestamp
    @Column(name = "withdrawal", nullable = false) private LocalDateTime withdrawal;
    @Column(name = "admin", nullable = false, columnDefinition = "boolean default 0") private String admin;
    @Column(name = "volunteer_score", nullable = false) private String volunteerScore;
    @Column(name = "volunteer_score_count", nullable = false) private String volunteerScoreCount;
    @Column(name = "request_score", nullable = false) private String requestScore;
    @Column(name = "request_score_Count", nullable = false) private String requestScoreCount;
    @Column(name = "point", nullable = false) private String point;
    @JsonIgnore
    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Volunteer> volunteers;

}