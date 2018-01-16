package softuniBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniBlog.entity.Article;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 10.12.2017 г.
 * Time: 11:56 ч.
 */


public interface ArticleRepository extends JpaRepository<Article,Integer>{


}