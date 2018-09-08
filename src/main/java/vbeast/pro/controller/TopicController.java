package vbeast.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vbeast.pro.model.Topic;
import vbeast.pro.service.TopicService;

import java.util.List;

/**
 * Created by varun on 7/9/18.
 */
@RestController
public class TopicController {

    @Autowired
    TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopics();
    }

    @RequestMapping(value = "/topics",method = RequestMethod.POST)
    public void saveTopics(@RequestBody Topic topic){
         topicService.save(topic);
    }
}
