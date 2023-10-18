package chapter14.Homework_;

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        arr.add(new News("新闻1111111111111111111111111"));
        arr.add(new News("新闻2"));
        arr.add(new News("新闻3"));
        News nnn = new News("新闻4");
        arr.add(nnn);
        arr.addAll(arr);
        arr.remove(nnn);

//        int size = arr.size() - 1;
//        for (int i = size; i >= 0; i--) {
//            News n = (News)arr.get(i);
//            System.out.println(processTittle(n.getTitle()));
//        }

        System.out.println(arr);
        System.out.println(arr.contains(nnn));

    }

    public static String processTittle(String title){
        if(title.length()>15){
            return title.substring(0,15) + "...";
        }else{
            return title;
        }
    }
}

class News{
    private String title;
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

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
