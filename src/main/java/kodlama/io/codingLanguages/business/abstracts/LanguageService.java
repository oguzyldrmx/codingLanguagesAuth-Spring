package kodlama.io.codingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.codingLanguages.entities.concretes.Languages;

public interface LanguageService {
	List<Languages> getAll();
	void delete(int id)throws Exception;
	void add(Languages language)throws Exception;
	void update(Languages language)throws Exception;
	Languages getById(int id);
}
