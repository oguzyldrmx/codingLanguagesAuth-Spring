package kodlama.io.codingLanguages.dataAccess.abstracts;

import java.util.List;

import kodlama.io.codingLanguages.entities.concretes.Languages;

public interface LanguageRepository {
	 List<Languages> getAll();
	 void delete(int id);
	 void add(Languages language);
	 void update(Languages language);
	 Languages getById(int id);
}
