package com.chatbot.web.member;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1014359176L;

    public static final QMember member = new QMember("member1");

    public final StringPath admin = createString("admin");

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> joinDate = createDateTime("joinDate", java.time.LocalDateTime.class);

    public final StringPath joinWay = createString("joinWay");

    public final StringPath name = createString("name");

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public final StringPath phone = createString("phone");

    public final StringPath point = createString("point");

    public final StringPath requestScore = createString("requestScore");

    public final StringPath requestScoreCount = createString("requestScoreCount");

    public final StringPath ssn = createString("ssn");

    public final ListPath<com.chatbot.web.volunteer.Volunteer, com.chatbot.web.volunteer.QVolunteer> volunteers = this.<com.chatbot.web.volunteer.Volunteer, com.chatbot.web.volunteer.QVolunteer>createList("volunteers", com.chatbot.web.volunteer.Volunteer.class, com.chatbot.web.volunteer.QVolunteer.class, PathInits.DIRECT2);

    public final StringPath volunteerScore = createString("volunteerScore");

    public final StringPath volunteerScoreCount = createString("volunteerScoreCount");

    public final DateTimePath<java.time.LocalDateTime> withdrawal = createDateTime("withdrawal", java.time.LocalDateTime.class);

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

