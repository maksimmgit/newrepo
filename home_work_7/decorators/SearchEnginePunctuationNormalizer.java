package home_work_7.decorators;

import home_work_7.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        text = text.replace(",", " ");
        text = text.replace(".", " ");
        text = text.replace("!", " ");
        text = text.replace("?", " ");
        text = text.replace("\"", " ");
        text = text.replace("--", " ");
        text = text.replace(";", " ");
        text = text.replace(":", " ");
        text = text.replace("(", " ");
        text = text.replace(")", " ");
        return searchEngine.search(text,word);
    }
}
