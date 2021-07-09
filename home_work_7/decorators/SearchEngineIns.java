package home_work_7.decorators;

import home_work_7.api.ISearchEngine;

public class SearchEngineIns implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineIns(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    //Первый параметр текст в котором ищем, второй параметр что ищем в тексте.
    @Override
    public long search(String text, String word) {
        return searchEngine.search(text.toLowerCase(), word.toLowerCase());
    }
}
