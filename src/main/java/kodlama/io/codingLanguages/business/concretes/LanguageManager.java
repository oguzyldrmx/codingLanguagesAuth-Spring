package kodlama.io.codingLanguages.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.codingLanguages.business.abstracts.LanguageService;
import kodlama.io.codingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.codingLanguages.entities.concretes.Languages;

@Service
public class LanguageManager implements LanguageService{

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Languages> getAll() {
		// TODO Auto-generated method stub
		return languageRepository.getAll();
	}

	@Override
	public void delete(int id) throws Exception{
		// TODO Auto-generated method stub
		if(id >= 0){
            languageRepository.delete(id);
            System.out.println("Programming language deleted.");
        }
        else{
            throw new Exception("such an id does not exist.");
        }
	}

	@Override
	public void add(Languages language) throws Exception{
		List<Languages> languages = languageRepository.getAll();
        for (Languages item:languages){
            if(item.getName() == language.getName()){
                throw new Exception("Such a programming name already exists.");
            }
        }
        languageRepository.add(language);
        System.out.println("Programming language added.");
		
	}

	@Override
	public void update(Languages language)throws Exception {
		List<Languages> languages = languageRepository.getAll();
        for (Languages item:languages){
            if(item.getName() == language.getName()){
                throw new Exception("Such a programming name already exists.");
            }
        }
        languageRepository.update(language);
        System.out.println("Programming language updated.");
		
	}

	@Override
	public Languages getById(int id) {
		// TODO Auto-generated method stub
		return languageRepository.getById(id);
	}

	

	
	

}
