package org.english.dao.api;

import java.util.List;

import org.english.form.Word;

public interface WordDao {
	boolean addWord(Word word);
	public Word getWordById(int id);

	public List<Word> getWordByKeyWordPage(String keyword,int wordTypeId, int page,
			int pageSize);
	
	public long getWordCount(String keyword,int wordTypeId);

	boolean updateWord(Word word);

	boolean deleteWord(Word word);
	List<Word> getWordByKeyWordPage(int studentId, int page, int pageSize);
	Long getWordByStudentIdCount(int id);
	List<Word> getWordByKeyWordStudentTypePage(int id, int page, int pageSize);
	//测试
	List<Word> getWordByKeyWordTestPage(int id, int page, int pageSize);
	public Long getWordTestByStudentIdCount(int id);
}
