package kodlama.io.codingLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.codingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.codingLanguages.entities.concretes.Languages;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	private List<Languages> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Languages>();
		languages.add(new Languages(1,"Java"));
        languages.add(new Languages(2,"C++"));
        languages.add(new Languages(3,"Python"));
        languages.add(new Languages(4,"C#"));
	}

	@Override
	public List<Languages> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		languages.remove(id-1);
	}

	@Override
	public void add(Languages language) {
		// TODO Auto-generated method stub
		languages.add(language);
	}

	@Override
	public void update(Languages language) {
		// TODO Auto-generated method stub
		for(Languages item : languages) {
			if(item.getId() == language.getId()) {
				item.setId(language.getId());
				item.setName(language.getName());
			}
		}
	}

	@Override
	public Languages getById(int id) {
		// TODO Auto-generated method stub
		Languages language = new Languages();
		for(Languages item:languages) {
			if(item.getId() == id) {
				language.setId(id);
				language.setName(item.getName());
			}
		}
		return language;
	}

	

	

}
