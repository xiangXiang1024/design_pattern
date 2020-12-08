package proxy.protectionProxy;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public class PersonBeanImpl implements PersonBean {
    private String name;
    private String interests;
    private int rating;
    private int ratingCount;

    public PersonBeanImpl(String name, String interests) {
        this.name = name;
        this.interests = interests;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0) {
            return 0;
        }
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating+=rating;
        ratingCount++;
    }
}
