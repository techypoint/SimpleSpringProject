package vbeast.pro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vbeast.pro.model.Topic;
import vbeast.pro.repository.TopicRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by varun on 7/9/18.
 */
@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getTopics() {
        List<Topic> topicList = new ArrayList<>();
        Iterable<Topic> topicIterable = topicRepository.findAll();
        Iterator<Topic> topicIterator = topicIterable.iterator();
        while (topicIterator.hasNext()) {
            Topic topic = topicIterator.next();
            topicList.add(topic);
        }
        return topicList;
    }

    public void save(Topic topic){
        topicRepository.save(topic);
    }
}
