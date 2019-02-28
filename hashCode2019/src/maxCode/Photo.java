package maxCode;

public class Photo {
    private int id;
    private String or;
    private int nbrTags;
    private String [] tags;

    public Photo(int id, String or, int nbrTags, String [] tags){
        this.id = id;
        this.or = or;
        this.nbrTags =nbrTags;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public String getOr() {
        return or;
    }

    public int getNbrTags() {
        return nbrTags;
    }


    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        String res = "[id:"+id+" orientation:"+or+" nombre tags:"+nbrTags+" tags:";
        for (String s :
                tags) {
            res = res.concat(s+",");
        }
        res += "]";
        return res;
    }
}
