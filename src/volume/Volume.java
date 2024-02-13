package volume;

public class Volume {
    int volume = 1;
    public void set(int volume){
        this.volume = volume;
    }
    public int get(){
        return this.volume;
    }
    void up(){
        this.volume = this.volume >= 15 ? 1 : ++this.volume;
    }
    void down(){
        this.volume = this.volume <= 1 ? 1 : --this.volume;;
    }
}
