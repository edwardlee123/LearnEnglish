package org.english.service.api;

import java.util.List;

import org.english.form.Word;

public interface WordService {
	boolean addWord(Word word);
	public Word getWordById(int id);

	public long getWordCount(String keyword,int wordTypeId);

	boolean updateWord(Word word);

	boolean deleteWord(Word word);
	List<Word> getWordByKeyWordPage(String wordName, Integer wordTypeId,
			int page, int pageSize);
	List<Word> getWordByKeyWordPage(int studentId, int page, int pageSize);
	Long getWordByStudentIdCount(int id);
	List<Word> getWordByKeyWordStudentTypePage(int id, int page, int pageSize);
	List<Word> getWordByKeyWordTestPage(int id, int page, int pageSize);
	public Long getWordTestByStudentIdCount(int id);
}
