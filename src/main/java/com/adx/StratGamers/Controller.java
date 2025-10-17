package com.adx.StratGamers;

import com.adx.StratGamers.model.Members;
import com.adx.StratGamers.model.News;
import com.adx.StratGamers.repo.MembersRepo;
import com.adx.StratGamers.repo.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(
        origins = "*", // Or "*" for all
        methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.OPTIONS }
)

@RestController
public class Controller {

    @Autowired
    NewsRepo newsRepo;
    @Autowired
    MembersRepo membersRepo;

    @PostMapping("/addNews")
    public void addNews(@RequestBody News news){
        newsRepo.save(news);
    }

    @PostMapping("/members")
    public void members(@RequestBody Members members){
        membersRepo.save(members);
    }

    @DeleteMapping("/delmember/{member_id}")
    public void delmember(@PathVariable long member_id) {
        membersRepo.deleteById(member_id);
    }

    @GetMapping("/members")
    public List<Members> members(){
        return membersRepo.findAll();
    }

    @GetMapping("/news")
    public List<News> news() {
        return newsRepo.findAll();
    }

    @DeleteMapping("/delnews/{id}")
    public void delnews(@PathVariable long id) {
        newsRepo.deleteById(id);
    }
}
