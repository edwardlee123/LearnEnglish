package org.english.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.english.dao.api.WordDao;
import org.english.form.Word;
import org.english.service.api.WordService;
import org.springframework.stereotype.Service;
@Service(value = "wordServiceImpl")
public class WordServiceImpl implements WordService{
	@Resource(name = "wordDaoImpl")
	WordDao wordDao;
	public boolean addWord(Word word) {
		return wordDao.addWord(word);
	}

	public Word getWordById(int id) {
		return wordDao.getWordById(id);
	}

	public List<Word> getWordByKeyWordPage(String wordName, Integer wordTypeId,
			int page, int pageSize) {
		return wordDao.getWordByKeyWordPage(wordName, wordTypeId,page, pageSize);
	}

	public long getWordCount(String keyword,int wordTypeId) {
		return wordDao.getWordCount(keyword,wordTypeId);
	}

	public boolean updateWord(Word word) {
		return false;
	}

	public boolean deleteWord(Word word) {
		return wordDao.deleteWord(word);
	}

	public List<Word> getWordByKeyWordPage(int studentId, int page, int pageSize) {
		return wordDao.getWordByKeyWordPage(studentId, page, pageSize);
	}

	public Long getWordByStudentIdCount(int id) {
		return wordDao.getWordByStudentIdCount(id);
	}

	public List<Word> getWordByKeyWordStudentTypePage(int id, int page,
			int pageSize) {
		return wordDao.getWordByKeyWordStudentTypePage(id, page, pageSize);
	}

	public List<Word> getWordByKeyWordTestPage(int id, int page, int pageSize) {
		return wordDao.getWordByKeyWordTestPage(id,page,pageSize);
	}
	public Long getWordTestByStudentIdCount(int id){
		return wordDao.getWordTestByStudentIdCount(id);
	}
}
