package softuniBlog.bindingModel;

import javax.validation.constraints.NotNull;

/**
 * Created by IntelliJ IDEA.
 * User: LAPD
 * Date: 10.12.2017 г.
 * Time: 12:07 ч.
 */


public class ArticleBindingModel {

    @NotNull
    private String title;

    @NotNull
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}