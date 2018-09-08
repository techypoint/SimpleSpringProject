package vbeast.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vbeast.pro.model.Topic;

/**
 * Created by varun on 7/9/18.
 */
public interface TopicRepository extends CrudRepository<Topic,Integer> {
}
