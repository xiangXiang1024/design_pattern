package proxy.protectionProxy;

/**
 * @author: xiang
 * @date: 2020/12/8
 * @description:
 */
public interface PersonBean {
    String getName();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
