package com.chatbot.web.article;

import com.chatbot.web.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface ArticleRepository extends JpaRepository<Member, Long>, ArticleService{}

interface ArticleService{
    public List<Member> findByAddr(String addr);
}

public class ArticleRepositoryImpl extends QuerydslRepositorySupport implements ArticleService{

    ArticleRepositoryImpl(){
        super(Article.class);
    }

    @Override
    public List<Member> findByAddr(String addr) {
        return null;
    }
}
