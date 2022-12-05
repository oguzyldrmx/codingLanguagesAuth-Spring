package kodlama.io.codingLanguages.wepApi.controllers;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.codingLanguages.business.abstracts.LanguageService;
import kodlama.io.codingLanguages.entities.concretes.Languages;

@RestController // annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	Scanner scanner = new Scanner(System.in);
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	
    @PostMapping("/add")
    public void add(Languages language) throws Exception {
        languageService.add(language);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id",required = true) int id) throws Exception {
        languageService.delete(id);
    }

    @PutMapping("/update")
    public void update(Languages language) throws Exception {
        languageService.update(language);
    }

    @GetMapping("/getbyid/{id}")
    public Languages getById(@PathVariable(value = "id",required = true) int id){
        return languageService.getById(id);
    }

    @GetMapping("/getall")
    public List<Languages> getAll(){
        return languageService.getAll();
    }
	
}
